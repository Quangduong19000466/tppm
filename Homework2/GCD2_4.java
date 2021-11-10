package Homework2;

import java.lang.Math;

public class GCD2_4 {
    public static void main(String[] args) {
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
