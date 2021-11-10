package Homework2;

public class FactorialLong {
    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);
        for (int i = 1; i <= 30; i++) {
            if (factorialInt(i) < 0) {
                System.out.println("the factorial of " + i + " is out the range");
                System.exit(0);
            }
            System.out.println("the factorial of " + i + " is " + factorialInt(i));

        }
    }

    public static long factorialInt(int x) {
        long fact = 1;
        for (int i = 1; i <= x; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
