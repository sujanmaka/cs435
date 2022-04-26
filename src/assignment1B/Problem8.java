package assignment1B;

public class Problem8 {
    public static void main(String[] args) {
        System.out.println(smallestCommon(4, 6));
        System.out.println(smallestCommon(3, 5));
        System.out.println(smallestCommon(7, 14));
    }

    public static int smallestCommon(int x, int y) {
        return (x * y) / gcd(x, y);
    }

    public static int gcd(int x, int y) {
        if (x == 0) {
            return y;
        }
        return gcd(y % x, x);
    }


}
