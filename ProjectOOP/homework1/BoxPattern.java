package homework1;

import java.util.Scanner;

public class BoxPattern {

    public static void BoxPatternA(int size) {
        for (int row = 0; row < size; row++) {
            if (row == 0 || row == size - 1) {
                for (int col = 0; col < size; col++) {
                    System.out.print("# ");
                }
            } else {
                for (int col = 0; col < size; col++) {
                    if (col == 0 || col == size - 1) {
                        System.out.print("# ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void BoxPatternB(int size) {
        System.out.println("----------------------");
        for (int row = 0; row < size; row++) {
            if (row == 0 || row == size - 1) {
                for (int col = 0; col < size; col++) {
                    System.out.print("# ");
                }
            } else {
                for (int col = 0; col < size; col++) {
                    if (col == row) {
                        System.out.print("# ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void BoxPatternC(int size) {
        System.out.println("----------------------");
        for (int row = 0; row < size; row++) {
            if (row == 0 || row == size - 1) {
                for (int col = 0; col < size; col++) {
                    System.out.print("# ");
                }
            } else {
                for (int col = 0; col < size; col++) {
                    if (col == size - row - 1) {
                        System.out.print("# ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void BoxPatternD(int size) {
        System.out.println("----------------------");
        for (int row = 0; row < size; row++) {
            if (row == 0 || row == size - 1) {
                for (int col = 0; col < size; col++) {
                    System.out.print("# ");
                }
            } else {
                for (int col = 0; col < size; col++) {
                    if (col == row || col == size - row - 1) {
                        System.out.print("# ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void test() {
        System.out.println("nhap size:");
        int size = new Scanner(System.in).nextInt();
        System.out.println("Hinh A");
        BoxPatternA(size);
        System.out.println("Hinh B");
        BoxPatternB(size);
        System.out.println("Hinh C");
        BoxPatternC(size);
        System.out.println("Hinh D");
        BoxPatternD(size);
    }
}
