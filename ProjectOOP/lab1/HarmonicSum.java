package lab1;

import java.lang.Math;

/**
 * Compute the sum of harmonics series from left-to-right and right-to-left.
 */
public class HarmonicSum { // Save as "HarmonicSum.java"
    public static void test() {

        final int MAX_DENOMINATOR = 50000;
        double sumL2R = 0.0; // Sum from left-to-right
        double sumR2L = 0.0; // Sum from right-to-left
        double absDiff; // Absolute difference between the two sums

        for (int denominator = 1; denominator <= MAX_DENOMINATOR; ++denominator) {
            sumL2R = sumL2R + 1 / denominator;

        }
        System.out.println("The sum from left-to-right is: " + sumL2R);
        for (int denominator = MAX_DENOMINATOR; denominator > 0; denominator--) {
            sumR2L = sumR2L + 1 / denominator;

        }
        System.out.println("The sum from left-to-right is: " + sumR2L);

        if (sumL2R > sumR2L) {
            absDiff = Math.abs(sumL2R - sumR2L);
            System.out.println("Absolute difference between the two sums" + absDiff);
        } else {
            System.out.println("two sums equal");
        }
    }
}
