package lab2;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class bai2_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap so phan tu va cac phan tu mang 1");
        int n1 = sc.nextInt();
        int[] array1 = new int[n1];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = sc.nextInt();
        }
        System.out.println(" nhap so phan tu va cac phan tu mang 2");
        int n2 = sc.nextInt();
        int[] array2 = new int[n2];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = sc.nextInt();
        }
        if (n1 == n2) {
            if (equals(array1, array2) == true) {
                System.out.println("hai mang bang nhau");
            } else System.out.println("hai mang khong bang nhau");
        }
    }

    public static boolean equals(int[] array1, int[] array2) {

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[i]) {
                return true;
            }
        }
        return false;
    }
}