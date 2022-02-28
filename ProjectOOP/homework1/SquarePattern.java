package homework1;

import java.util.Scanner;

public class SquarePattern {
    public static void test() {
        int size = new Scanner(System.in).nextInt();
        System.out.println("Enter the size:" + size);
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
