package Homework2;

import java.lang.Math;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int SECRETNUMBER = (int) (Math.random() * 100);
        int dem = 0;
        System.out.println("Key i n your g u e s s :");
        while (true) {
            int n = sc.nextInt();
            if (n == SECRETNUMBER) {
                dem++;
                System.out.println("you got it in " + dem + " trilas!");
            } else {
                if (n < SECRETNUMBER) {
                    System.out.println("try higher");
                    dem++;
                } else {
                    System.out.println("try lower");
                    dem++;
                }
            }

        }
    }
}
