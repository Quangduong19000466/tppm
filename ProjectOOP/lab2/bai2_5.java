package lab2;

import java.util.Scanner;

public class bai2_5 {
    public static void test() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so nguyen key");
        int key = sc.nextInt();
        System.out.println("nhap so phan tu cua mang");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("nhap ca cphan tu cua mang");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        if (contains(array, key) == true) {
            System.out.println("ton tai phan tu cua mang = key");
        } else {
            System.out.println("khong ton tai phan tu cua mang = key");
        }
    }

    public static boolean contains(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }
}
