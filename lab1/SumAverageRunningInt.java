package lab1;
/**
 * Compute the sum and average of running integers from a lowerbound to an
 upperbound using loop.
 */
public class SumAverageRunningInt { // Save as "SumAverageRunningInt.java"
    public static void main (String[] args) {
// Define variables
        int sum = 0;
        double average;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;

        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            sum += number;
        }
        average=sum/100.0;
        System.out.println("The sum of 1 to 100 is "+ sum);
        System.out.println("The average is "+average);
        //---------------------------
        int sum1 = 0;
        int number = LOWERBOUND; // declare and init loop index variable
        while (number <= UPPERBOUND) { // test
            sum1 += number;
            ++number; // update
        }

        System.out.println("The sum1 of 1 to 100 is "+ sum1);
        System.out.println("The average is "+sum1/100.0);
        //---------------------------------
        int sum2 = 0;
        int number1 = LOWERBOUND; // declare and init loop index variable
        do {
            sum2 += number1;
            ++number; // update
        } while (number1 <= UPPERBOUND);
        average=sum2/100.0;
        System.out.println("The sum2 of 1 to 100 is "+ sum2);
        System.out.println("The average is "+sum2/100.0);
        //------------------------
        int count=0;

        for(int i=111;i<=8899;i++){
            count+=i;

        }
        double average1=count/(8899-111);
        System.out.println("The sum3 of 111 to 98899 is "+ sum2);
        System.out.println("The average is "+average1);
    }
}
