package lab1;

/**
 * Print first 20 Fibonacci numbers and their average
 */
public class Fibonacci {
    public static void test() {
        int n = 3;
        int fn; // F(n) to be computed
        int fnMinus1 = 1; // F(n-1), init to F(2)
        int fnMinus2 = 1; // F(n-2), init to F(1)
        int nMax = 20; // maximum n, inclusive
        int sum = fnMinus1 + fnMinus2; // Need sum to compute average
        double average;
        System.out.println("The first " + nMax + " Fibonacci numbers are:");

        while (n <= nMax) { // n starts from 3
            fn = fnMinus1 + fnMinus2;
            ++n;
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
            System.out.print(fnMinus1 + " ");
            sum = sum + fn;
        }
        average = (double) sum / nMax;
        System.out.println();
        System.out.println(average);
// Compute and display the average

    }
}