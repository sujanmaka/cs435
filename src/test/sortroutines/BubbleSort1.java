package test.sortroutines;

import test.runtime.Sorter;

import java.util.Arrays;

public class BubbleSort1 extends Sorter {

    public static void main(String[] args) {
        int test[] = new int[]{33,12,22, 1, 2, 3, -8, 5};
        BubbleSort1 bubbleSort = new BubbleSort1();
        System.out.println(Arrays.toString(bubbleSort.sort(test)));
    }

    @Override
    public int[] sort(int[] arr) {

        int len = arr.length;
        for (int i = 0; i < len; ++i) {
            boolean swapped = false;
            for (int j = 0; j < len - i - 1; ++j) {
                if (arr[j] > arr[j + 1]) {
                    swap(j, j + 1, arr);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
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
