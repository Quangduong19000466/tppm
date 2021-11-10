package Homework1.tppm;

import java.util.Scanner;

public class CountVowelsDigits {
    public static void main(String[] args) {
        final char cr[]={'a','e','i','o','u','A','E','I','O','U','0','1','2','3','4','5','6','7','8','9'};
        String inStr;
        System.out.println("Enter a String :");
        Scanner in = new Scanner(System.in);
        inStr=in.nextLine();
        int inStrLen=inStr.length();
        for(int charIdx=inStrLen-1;charIdx>=0;charIdx--){
            System.out.print( inStr.charAt(charIdx));
        }

    }
}
