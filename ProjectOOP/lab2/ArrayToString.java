package lab2;

import java.util.Scanner;

public class ArrayToString {
    public static void test() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int array[] = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        ArrayToString ar = new ArrayToString();
        System.out.print(ar.arrayToString(array));

    }

    public String[] arrayToString(int[] array) {
        String array1[] = new String[array.length];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = String.valueOf(array[i]);
        }
        return array1;
    }
}
