package lab1;

public class Tribonacci {
    public static void main (String[] args) {
        int n = 4;
        int fn; // F(n) to be computed
        int fnMinus1 = 1; // F(n-1), init to F(2)
        int fnMinus2 = 1; // F(n-2), init to F(1)
        int fnMinus3 = 2;
        int nMax = 20; // maximum n, inclusive
        int sum = fnMinus1 + fnMinus2 +fnMinus3; // Need sum to compute average
        double average;
        System.out.println("The first " + nMax + " Tribonacci numbers are:");

        while (n <= nMax) { // n starts from 4
            fn=fnMinus1+fnMinus2+fnMinus3;
            ++n;
            fnMinus3= fnMinus1+fnMinus2;
            fnMinus2 = fnMinus1;
            fnMinus1 =fn;
            System.out.print(fnMinus1+" ");
            sum=sum+fn;
        }
        average=(double)sum/nMax;
        System.out.println();
        System.out.println(average);
// Compute and display the average

    }
}

