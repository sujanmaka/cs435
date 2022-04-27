package lab1.assignment1A;

import java.util.Arrays;

public class Problem2 {
    public static void main(String[] args) {
        int[] input = new int[]{-10, 0, -1, -8, 1, -9, 4, 2, 1, 2, 3, 1};
        System.out.println(secondSmallest(input));
        System.out.println(secondSmallestNextApproach(input));
    }

    public static int secondSmallest(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Input array too small");
        }
        int smallest = arr[0];
        int secondSmallest = arr[1];
        if (smallest > secondSmallest) {
            int temp = smallest;
            smallest = secondSmallest;
            secondSmallest = temp;
        }
        for (int i = 2; i < arr.length; i++) {

            if (arr[i] < smallest && arr[i] < secondSmallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] >= smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }

    public static int secondSmallestNextApproach(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Input array too small");
        }
        Arrays.sort(arr);
        return arr[1];
    }

}
