package Homework1.tppm;

import java.util.Scanner;

public class SquarePattern1 {
    public static void main(String[] args) {
        int size = new Scanner(System.in).nextInt();
        System.out.println("Enter the size:"+size);
        int row=1;
        while (row<=size){
            int col=1;
            while (col<=size){
                System.out.print("# ");
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
