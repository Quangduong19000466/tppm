package lab2;

import java.util.Locale;
import java.util.Scanner;

public class Hex2Bin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hex = sc.nextLine().toUpperCase();// chuyen dau vao ve dang in hoa
        if (checkHex(hex) == true) {
            System.out.println("la so nhi phan");
        }
    }

    public static boolean checkHex(String hex) {
        int dem = 0;
        for (int i = 0; i < hex.length(); i++) {
            if (!(hex.charAt(i) >= '0' && hex.charAt(i) <= '9') && !(hex.charAt(i) >= 'A' && hex.charAt(i) <= 'F'))
                return false;
        }
        return true;
    }
    public static void binary(String hex){
        String bin="";
        for(int i =0;i<hex.length();i++){


        }


    }
}
