package lab3;

public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(4,8));
    }

    public static int gcd(int m, int n) {
        if (n == 0) {
            return m;
        }
        return gcd(n, m % n);
    }
}
