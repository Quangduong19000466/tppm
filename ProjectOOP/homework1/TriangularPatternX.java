package homework1;

import java.util.Scanner;

public class TriangularPatternX {

    public static void TriangularPatternA(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void TriangularPatternB(int size) {
        System.out.println("----------------------");
        for (int row = size; row > 0; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void TriangularPatternC(int size) {
        System.out.println("----------------------");
        for (int row = 0; row < size; row++) {
            for (int col = row; col < size - 1; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= row; col++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void TriangularPatternD(int size) {
        System.out.println("----------------------");
        for (int row = 0; row < size; row++) {
            for (int col = row; col < size; col++) {
                System.out.print("#");
            }
            System.out.println();
            for (int col = 0; col <= row; col++) {
                System.out.print(" ");
            }

        }
        System.out.println();
    }

    public static void TriangularPatternE(int size) {
        System.out.println("----------------------");
        for (int row = 0; row < size; row++) {
            for (int col = row; col < size - 1; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= row; col++) {
                System.out.print(" #");
            }
            System.out.println();
        }
    }

    public static void TriangularPatternF(int size) {
        System.out.println("----------------------");
        for (int row = 0; row < size; row++) {
            for (int col = row; col < size; col++) {
                System.out.print(" #");
            }
            System.out.println();
            for (int col = 0; col <= row; col++) {
                System.out.print(" ");
            }

        }
    }

    public static void test() {
        int size = new Scanner(System.in).nextInt();
        TriangularPatternA(size);
        TriangularPatternB(size);
        TriangularPatternC(size);
        TriangularPatternD(size);
        TriangularPatternE(size);
        TriangularPatternF(size);
    }
}
