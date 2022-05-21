package lab3;

public class Problem3 {
    public static void main(String[] args) {
        int gcd = GCD.gcd(8,7);
//        int gcd = 7;
        int power = 1;
        int twoPowerK = 0;
        if (Prime.isPrime(7)) {
            System.out.println(true);
        }
        while (Math.pow(2, power) <= gcd) {
            twoPowerK = (int) Math.pow(2, power);
            if (gcd % twoPowerK == 0) {
                int p = gcd / twoPowerK;
                System.out.println(Prime.isPrime(p));
            }
            power++;
        }
    }
}
