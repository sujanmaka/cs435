package lab2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5, 8, 17};
        int[] arr2 = {2, 4, 8, 11, 13, 21, 23, 25};

        List<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(2);
        test.add(3);
        System.out.println(test.contains(1));

        System.out.println(Arrays.toString(merge(arr2, arr1)));
    }

    static int[] merge(int[] arr1, int[] arr2) {
        int n = arr1.length + arr2.length;
        int[] result = new int[n];
        int pointer1 = 0, pointer2 = 0;

        for (int i = 0; i < n; i++) {
            if (arr1.length < arr2.length) {
                if (pointer1 < arr1.length && arr1[pointer1] < arr2[pointer2]) {
                    result[i] = arr1[pointer1];
                    pointer1++;
                } else {
                    result[i] = arr2[pointer2];
                    pointer2++;
                }
            } else {
                if (pointer2 < arr2.length && arr2[pointer2] < arr1[pointer1]) {
                    result[i] = arr2[pointer2];
                    pointer2++;
                } else {
                    result[i] = arr1[pointer1];
                    pointer1++;
                }
            }
        }
        return result;
    }

}
