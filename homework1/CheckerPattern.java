package Homework1.tppm;

import java.util.Scanner;

public class CheckerPattern {
    public static void main(String[] args) {
        int size = new Scanner(System.in).nextInt();
        System.out.println("Enter the size:" + size);
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if(row%2==0) {
                    System.out.print(" ");
                    System.out.print("#");
                }else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
}