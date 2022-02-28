package homework2;

import java.util.Scanner;

public class FactorialInt {
    public static void test() {
        for (int i = 1; i <= 13; i++) {
            if (i == 13) {
                System.out.println("the factorial of " + i + " is out the range");
            } else {
                System.out.println("the factorial of " + i + " is " + factorialInt(i));
            }
        }
    }

    public static int factorialInt(int x) {
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
