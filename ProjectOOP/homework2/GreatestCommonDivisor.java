package homework2;
import java.lang.Math;
public class GreatestCommonDivisor {
    public static void test() {
        System.out.println(gcd(18, 42));
    }

    public static int gcd(int n, int m) {
        if (m == 0) {
            return n;
        } else {
            return gcd(m, Math.abs(n - m));
        }
    }
}
