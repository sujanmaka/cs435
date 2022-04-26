package assignment1A;

import java.util.ArrayList;
import java.util.LinkedList;

public class Problem4 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>() {
            {
                add(4);
                add(2);
                add(5);
                add(-8);
                add(0);
                add(3);
                add(1);
            }
        };

        LinkedList<Integer> list1 = new LinkedList<>() { {
           add(6);
           add(2);
           add(4);
           add(5);
           add(9);
        }};

        sort(list);
        sort(list1);
    }

    public static void sort(ArrayList<Integer> list) {
        int index = list.size();

        while (index > 0) {
            for (int i = 0; i < index - 1; i++) {

                if (list.get(i) > list.get(i + 1)) {
                    int temp = list.get(i + 1);
                    list.set(i + 1, list.get(i));
                    list.set(i, temp);
                }
            }
            index--;
        }

        System.out.println(list);
    }

    public static void sort(LinkedList<Integer> list) {
        int index = list.size();

        while (index > 0) {
            for (int i = 0; i < index - 1; i++) {

                if (list.get(i) > list.get(i + 1)) {
                    int temp = list.get(i + 1);
                    list.set(i + 1, list.get(i));
                    list.set(i, temp);
                }
            }
            index--;
        }

        System.out.println(list);
    }

}
