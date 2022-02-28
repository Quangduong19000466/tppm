package homework2;

import java.util.Scanner;

public class PerfectPrimeFactorList {
    public static void test() {
        int n = new Scanner(System.in).nextInt();
        aPerfectPrimeFactorList(n);

    }

    public static void aPerfectPrimeFactorList(int n) {
        double dem = 0;
        double ptram;
        for (int i = 1; i <= n; i++) {
            if (isProductOfPrimeFactors(i) == true) {
                System.out.print(i + " ");
                dem++;
            }
        }
        System.out.println();
        ptram = (dem / n) * n;
        System.out.println("[" + dem + " number  found(" + ptram + "%)]");
    }

    public static boolean isProductOfPrimeFactors(int aPosInt) {
        int multip = 1;

        for (int i = 2; i < aPosInt; i++) {
            if (isPrime(i) == true) {
                if (aPosInt % i == 0) {
                    multip = multip * i;
                }
            }
        }
        if (multip == aPosInt) {
            return true;
        }
        return false;
    }

    public static boolean isPrime(int aPosInt) {
        int dem = 0;
        for (int i = 1; i <= aPosInt; i++) {
            if (aPosInt % i == 0) {
                dem += 1;
            }
        }
        if (dem == 2) {
            return true;
        }
        return false;
    }
}
