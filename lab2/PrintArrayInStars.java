package lab2;

import java.util.Scanner;

public class PrintArrayInStars {
    public static void main(String[] args) {
        final int NUM_ITEMS;
        int[] items;
        Scanner sc = new Scanner(System.in);
        NUM_ITEMS = sc.nextInt();
        items = new int[NUM_ITEMS];
        if (items.length > 0) {
            for (int i = 0; i < items.length; i++) {
                items[i] = sc.nextInt();
            }
        }
        System.out.println("Enter the number of items : " + NUM_ITEMS);
        System.out.print("Enter the value of all items (separa ted by space) :");
        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i] + ": ");
            for (int j = items[i]; j > 0; j--) {
                System.out.print("*");
            }
            System.out.print("(" + items[i] + ")");
            System.out.println();
        }
    }
}
