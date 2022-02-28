package homework1;

import java.util.Scanner;

public class TimeTable {
    public static void test() {
        int size = new Scanner(System.in).nextInt();
        int arr[][] = new int[size][size];
        System.out.println("Enter the size:" + size);

        for (int i = 0; i < size + 1; i++) {
            if (i == 0) {
                System.out.print("*|");
            } else {
                System.out.printf("%4d", i);
            }
        }
        System.out.println();


        for (int i = 0; i <= size; i++) {
            System.out.print("----");
        }
        System.out.println();

        //tinh bang cuu chuong
        for (int i = 0; i < size; i++) {
            System.out.print(i + 1 + "|");
            for (int j = 0; j < size; j++) {
                arr[i][j] = (i + 1) * (j + 1);
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
