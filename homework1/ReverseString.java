package Homework1.tppm;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String inStr;
        int inStrLen;
        System.out.println("Enter a String :");
        Scanner in = new Scanner(System.in);
        inStr=in.nextLine();
        inStrLen=inStr.length();
        for(int charIdx=inStrLen-1;charIdx>=0;charIdx--){
            System.out.print( inStr.charAt(charIdx));
        }
    }
}
