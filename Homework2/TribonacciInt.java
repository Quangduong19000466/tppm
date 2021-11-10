package Homework2;

public class TribonacciInt {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            if (i == 1 || i == 2) {
                System.out.println("the fibonacci " + i + " is " + "1");
            } else if (tribonacciInt(i) < 0) {
                System.out.println("the tribonacci of " + i + " is out the range");
                System.exit(1);
            } else {
                System.out.println("the fibonacci " + i + " is " + tribonacciInt(i));
            }
        }
    }

    public static int tribonacciInt(int n) {
        int[] tribo = new int[n + 1];
        tribo[0] = 0;
        tribo[1] = 1;
        tribo[2] = 1;
        for (int i = 3; i <= n; i++) {
            tribo[i] = tribo[i - 1] + tribo[i - 2] + tribo[i - 3];
        }
        return tribo[n];
    }
}
