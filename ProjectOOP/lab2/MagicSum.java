package lab2;

import java.util.Scanner;

public class MagicSum {
    public static void test() {
        final int SENTINEL = -1;
        int number;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter apositive integer ( or −1 to end ) : ");
        number = in.nextInt();
        int sum = 0;
        while (number != SENTINEL) {
            if (hasEight(number) == true) {
                sum += number;

            }
            System.out.print("Enter apositive integer ( or −1 to end ) : ");
            number = in.nextInt();
            if (number == -1) break;

        }
        System.out.println("sum =" + sum);

    }

    public static boolean hasEight(int number) {
        int s = 0;
        for (int i = 0; i < number; i++) {
            s = number % 10;
            if (s == 8) {
                return true;
            }
            number = number / 10;
        }
        return false;

    }
}
