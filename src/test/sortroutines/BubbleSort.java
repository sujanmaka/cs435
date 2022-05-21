package test.sortroutines;

import test.runtime.Sorter;

import java.util.Arrays;
import java.util.List;

public class BubbleSort extends Sorter {

    public static void main(String[] args) {
        int test[] = new int[]{-6, -4, 1, 2, 8, 17};
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println(Arrays.toString(bubbleSort.sort(test)));

        int[] t = bubbleSort.sort(test);
        int[] a = new int[t.length];
        int first = 0, last = t.length - 1;
        for (int i = 0; i < t.length; i++) {
            if (i % 2 == 0) {
                a[i] = t[first];
                first++;
            } else {
                a[i] = t[last];
                last--;
            }
        }
        System.out.println(Arrays.toString(a));
    }

    @Override
    public int[] sort(int[] arr) {

        int len = arr.length;
        for (int i = 0; i < len; ++i) {
            for (int j = 0; j < len - 1; ++j) {
                if (arr[j] > arr[j + 1]) {
                    swap(j, j + 1, arr);
                }
            }
        }
        return arr;
    }

    void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
