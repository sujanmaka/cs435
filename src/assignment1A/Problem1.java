package assignment1A;

public class Problem1 {
    public static void main(String[] args) {
        boolean result = sumFound(new int[]{3, 3, 4, 7}, 5);
        System.out.println(result);
    }

    public static boolean sumFound(int[] arr, int z) {
        if (arr == null || arr.length < 2) {
            return false;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] != arr[j]) {
                    if (arr[i] + arr[j] == z) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
