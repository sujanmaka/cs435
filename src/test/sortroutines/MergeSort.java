package test.sortroutines;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>() {
            {
                add(5);
                add(4);
                add(3);
                add(1);
                add(6);
                add(2);
            }
        };
        System.out.println(recSort(integers, integers.size()));
    }


    public static List<Integer> merge(List<Integer> arr, List<Integer> l, List<Integer> r, int left, int right) {


        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l.get(i) <= r.get(j)) {
                arr.set(k++, l.get(i++));
            } else {
                arr.set(k++, r.get(j++));
            }
        }
        while (i < left) {
            arr.set(k++, l.get(i++));
        }
        while (j < right) {
            arr.set(k++, r.get(j++));
        }
        return arr;
    }

    public static List<Integer> recSort(List<Integer> list, int n) {
        int mid = list.size() / 2;

        if (list.size() > 1) {
            List<Integer> list1 = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();
            partition(list, list1, list2, mid);
            recSort(list1, mid);
            recSort(list2, n - mid);
            merge(list, list1, list2, mid, n - mid);
        }
        return list;
    }

    private static void partition(List<Integer> list, List<Integer> list1, List<Integer> list2, int mid) {
        for (int i = 0; i < mid; i++) {
            list1.add(list.get(i));
        }
        for (int i = mid; i < list.size(); i++) {
            list2.add(list.get(i));
        }
    }

}
