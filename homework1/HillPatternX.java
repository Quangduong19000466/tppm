package Homework1.tppm;

import java.util.Scanner;

public class HillPatternX {
    public static void HillPatternA(int size){
        System.out.println("----------------------");
        for (int row=0;row<size;row++){
            for (int col=row;col<size-1;col++){
                System.out.print(" ");
            }
            for (int col=0;col<=row;col++){
                System.out.print(" #");
            }
            System.out.println();
        }
    }
    public static void HillPatternB(int size){
        System.out.println("----------------------");
        for (int row=0;row<size;row++){
            for (int col=row;col<size;col++){
                System.out.print(" #");
            }
            System.out.println();
            for (int col=0;col<=row;col++){
                System.out.print(" ");
            }

        }
    }
    public static void HillPatternC(int size){
        System.out.println();
        System.out.println("----------------------");
        for (int row=0;row<size;row++){
            for (int col=row;col<size-1;col++){
                System.out.print(" ");
            }
            for (int col=0;col<=row;col++){
                System.out.print(" #");
            }
            System.out.println();
        }
        for (int row=0;row<size;row++){
            System.out.print(" ");
            for (int col=row;col<size-1;col++){
                System.out.print(" #");
            }
            System.out.println();
            for (int col=0;col<=row;col++){
                System.out.print(" ");
            }

        }

    }
    public static void HillPatternD(int size){

    }
    public static void main(String[] args) {
        System.out.println(" nhap size:");
        int size = new Scanner(System.in).nextInt();
        System.out.println(" hinh A");
        HillPatternA(size);
        System.out.println(" hinh B:");
        HillPatternB(size);
        System.out.println(" Hinh C:");
        HillPatternC(size);
    }
}
