package lab1;

import java.util.Scanner;

public class SumProductMinMax5 {
    public static void main(String[] args) {
        int number1, number2, number3,number4,number5;
        int sum, product, min, max;

        Scanner in = new Scanner(System.in);
        System.out.println("moi ban nhap 5 so");
        number1 = in.nextInt();
        number2 = in.nextInt();
        number3 = in.nextInt();
        number4 = in.nextInt();
        number5 = in.nextInt();
        in.close();
        sum = number1 + number2 + number3+number4+number5;
        product = number1 * number2 * number3*number4*number5;
        min=number1;
        if (number2 < min) {
            min = number2;
        }
        if (number3 < min) {
            min = number3;
        }
        if (number4 < min) {
            min = number4;
        }
        if (number5 < min) {
            min = number5;
        }
        max= number1;
        if (number2 > max) {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }
        if (number4 > max) {
            max = number4;
        }
        if (number5 > max) {
            max = number5;
        }
        System.out.println("Enter 1st integer:"+number1);
        System.out.println("Enter 2st integer:"+number2);
        System.out.println("Enter 3st integer:"+number3);
        System.out.println("Enter 3st integer:"+number4);
        System.out.println("Enter 3st integer:"+number5);
        System.out.println("sum="+sum);
        System.out.println("product="+product);


        System.out.println("min="+min);

        System.out.println("max="+max);
    }
}
