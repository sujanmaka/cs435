package lab3;

public class Fibo {
    public static void main(String[] args) {
        System.out.println(fibo(6));
    }

    private static int fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int a = 0, b = 1;
        int temp = 0;
        for (int i = 2; i <= n; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }
        return temp;

    }
}
