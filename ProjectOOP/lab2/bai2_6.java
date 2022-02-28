package lab2;

import java.util.Scanner;

public class bai2_6 {
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

        if (Search(array, key) != -1) {
            System.out.println(" ton tai vi tri bang key la:" + Search(array, key));
        } else System.out.print(Search(array, key));
    }

    public static int Search(int[] array, int key) {
        int s = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                s = i;
            }
        }
        return s;
    }
}