package lab2;

import java.util.Scanner;

public class Dec2Hex {
    public static void test() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so thap phan");
        int decimal = sc.nextInt();
        String hex = "";
        char hexchars[] = {'0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (decimal > 0) {
            int rem = decimal % 16;
            hex = hexchars[rem] + hex;
            decimal = decimal / 16;
        }
        System.out.println(hex);
    }
}
