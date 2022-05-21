package lab3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Reverse {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>() {{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
        }};
        reverse(list, 0, list.size()-1);
        System.out.println(list);
    }

    private static void reverse(LinkedList<Integer> list, int i, int j) {
        if (i < j) {
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            reverse(list, ++i, --j);
        }
    }
}
