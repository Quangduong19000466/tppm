package homework2;

import java.util.Scanner;

public class PerfectNumberList {
    public static void test() {
        System.out.print("enter the upper bound :");
        int n = new Scanner(System.in).nextInt();
        aPerfect(n);
        aDeficient(n);
    }

    public static void aPerfect(int n) {
        System.out.println("these number  are perfect:");
        double ptram;
        double dem = 0;
        for (int i = 1; i <= n; i++) {
            if (isPerfect(i) == true) {
                System.out.print(i + " ");
                dem++;
            }
        }
        System.out.println();
        ptram = (dem / n) * 100;
        System.out.println("[" + (int) dem + " perfect number found(" + ptram + "%)]");
    }

    public static void aDeficient(int n) {
        System.out.println("these number  are neither deficient not a perfect:");
        double ptram;
        double dem = 0;
        for (int i = 0; i <= n; i++) {
            if (isDeficient(i) == true) {
                System.out.print(i + " ");
                dem++;
            }
        }
        System.out.println();
        ptram = (dem / n) * 100;
        System.out.println("[" + (int) dem + " number found(" + ptram + "%)]");
    }

    public static boolean isPerfect(int aPosInt) {
        int temp = 0;
        for (int i = 1; i < aPosInt; i++) {
            if (aPosInt % i == 0) {
                temp += i;
            }
        }
        if (temp == aPosInt) {
            return true;
        }
        return false;
    }

    public static boolean isDeficient(int aPosInt) {
        int temp = 0;
        for (int i = 1; i < aPosInt; i++) {
            if (aPosInt % i == 0) {
                temp += i;
            }
        }
        if (temp > aPosInt) {
            return true;
        }
        return false;
    }
}
