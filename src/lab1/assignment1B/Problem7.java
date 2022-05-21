package lab1.assignment1B;

import java.util.HashMap;

public class Problem7 {
    static int count = 0;
    static int count1 = 0;
    public static void main(String[] args) {

//        for (int i = 0; i <= 20; ++i) {
//            System.out.println(generate(i));
//        }

        System.out.println(generate(10));
        System.out.println("count " + count);
        System.out.println(generate1(10, new HashMap<>()));
        System.out.println("count 1 " + count1);

    }

    public static int generate(int n) {
        count++;
        if (n == 0) return 0;
        if (n == 1) return 1;

        return generate(n - 1) + generate(n - 2);
    }

    public static int generate1(int n, HashMap<Integer, Integer> map) {
        count1++;
        if (n == 0 || n == 1) {
            return n;
        }
        if (!map.containsKey(n)) {
            map.put(n, generate1(n - 1, map) + generate1(n - 2, map));
        }
        return map.get(n);

    }
}
