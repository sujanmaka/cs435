package lab2;

import java.util.Arrays;

public class Problem6 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1, 0, 2,2, 0, 1, 1, 0, 2, 2, 0, 1, 2, 1, 1, 2, 0, 0};

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = arr[index];
                arr[index] = 0;
                index++;
            }

        }
        for (int i = index; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = arr[index];
                arr[index] = 1;
                index++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
