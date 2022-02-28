package lab1;

import java.util.Scanner;
import java.lang.Math;

public class SumProductMinMax3 {
    public static void test() {
        // Declare variables
        int number1, number2, number3;
        int sum, product, min, max;

        Scanner in = new Scanner(System.in);
        System.out.println("moi ban nhap 3 so");
        number1 = in.nextInt();
        number2 = in.nextInt();
        number3 = in.nextInt();
        in.close();

        sum = number1 + number2 + number3;
        product = number1 * number2 * number3;
        System.out.println("Enter 1st integer:" + number1);
        System.out.println("Enter 2st integer:" + number2);
        System.out.println("Enter 3st integer:" + number3);
        System.out.println("sum=" + sum);
        System.out.println("product=" + product);

        min = Math.min(number3, Math.min(number1, number2));
        System.out.println("min=" + min);
        max = Math.max(number3, Math.max(number2, number1));
        System.out.println("max=" + max);

    }
}

