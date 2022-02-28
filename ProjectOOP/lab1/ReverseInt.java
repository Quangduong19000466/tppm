package lab1;

import java.util.Scanner;

public class ReverseInt {
    public static void test() {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi ban nhap so");
        int inNumber = sc.nextInt(); // to be input
        int inDigit = 0; // each digit
        int rever = 0;
        System.out.println("Enter a positive integer:" + inNumber);
        while (inNumber > 0) {
            inDigit = inNumber % 10; // extract the "last" digit
            inNumber /= 10;
            rever = rever * 10 + inDigit;
        }
        System.out.println("The reverse is:" + rever);
    }
}
