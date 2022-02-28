package lab1;

import java.lang.Math;

public class ComputePI {
    public static void test() {
        double sum = 0.0;
        int MAX_DENOMINATOR = 1000; // Try 10000, 100000, 1000000;
        for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator += 2) {
            if (denominator % 4 == 1) {
                sum = sum + 4.0 * (1.0 / denominator);
            } else if (denominator % 4 == 3) {
                sum = sum - 4.0 * (1.0 / denominator);
            } else { // remainder of 0 or 2
                System.out.println("Impossible!!!");
            }
        }
        System.out.println("cach 1 p1 = " + sum);
        //---------------------------------------------
        int MAX_TERM = 10000; // number of terms used in computation
        double tong = 0.0;
        for (int term = 1; term <= MAX_TERM; term++) {

            if (term % 2 == 1) { // odd term number: add
                tong += 1.0 / (term * 2 - 1);
            } else {
                tong -= 1 / (term * 2 - 1);
            }
        }
        System.out.println("cach 2 p1 = " + tong);
        double phantram = (sum / Math.PI) * 100;
        System.out.println(phantram);
    }
}