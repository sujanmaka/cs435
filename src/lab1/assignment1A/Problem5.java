package lab1.assignment1A;

public class Problem5 {

    // second approach is comparatively faster
    // in worst case scenario, n loops are required in 1st approach
    // whereas n/2 loops are required in second approach

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 3, 4, 4, 4, 5, 6};
        System.out.println(find(arr, -1));
        System.out.println(findOptimized(arr, -1));
    }

    public static boolean find(int[] arr, int z) {
        for (int j : arr) {
            if (j == z) {
                return true;
            }
        }
        return false;
    }

    public static boolean findOptimized(int[] arr, int z) {
        int midpoint = arr.length / 2;
        if (arr[midpoint] == z) {
            return true;
        } else if (arr[midpoint] > z) {
            while (midpoint > 0) {
                if (arr[midpoint - 1] == z) {
                    return true;
                }
                midpoint--;
            }
        } else {
            while (midpoint < arr.length - 1) {
                if (arr[midpoint + 1] == z) {
                    return true;
                }
                midpoint++;
            }
        }
        return false;
    }
}
