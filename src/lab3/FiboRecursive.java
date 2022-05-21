package lab3;

import java.util.HashMap;

public class FiboRecursive {
    static int count = 0;
    static int countOptimize = 0;

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        map.put(1, 1);
        System.out.println(fibo(13));
        System.out.println(fibo(13, map));
        System.out.println("num self-calls: " + count);
        System.out.println("num self-calls optimize: " + countOptimize);
    }

    private static int fibo(int n) {
        count++;
        if (n == 0 || n == 1) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    private static int fibo(int n, HashMap<Integer, Integer> map) {
        countOptimize++;
        if (n == 0 || n == 1) {
            return n;
        }
        if (!map.containsKey(n)) {

            map.put(n, fibo(n - 1, map) + fibo(n - 2, map));
        }
        return map.get(n);
    }
}
