package Homework1.tppm;

import java.util.Scanner;

public class Bin2dec {

    private void runTest(String binStr)
    {
        if ( ! isBin(binStr)) {
            System.out.printf("Error: Invalid Binary String \"%1$s\"\n", binStr);
            return;
        }
        System.out.printf("The equivalent decimal number for binary \"%1$s\" is %2$d\n"
                , binStr, convertBin2Dec(binStr));
    }

    private static boolean isBin(String binStr)
    {
        for(int i = 0; i < binStr.length(); i++)
        {
            if (binStr.charAt(i) == '0') {
                continue;
            }
            if (binStr.charAt(i) == '1') {
                continue;
            }
            return false;
        }
        return true;
    }
    private int convertBin2Dec(String binStr)
    {
        int number = 0;
        for(int i = 0; i < binStr.length(); i++) {
            if (binStr.charAt(i) == '0') {
                continue;
            }
            number += Math.pow(2, (binStr.length() - 1 - i));
        }
        return number;
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter a Binary string: ");
        String bin = in.next();
        Bin2dec aBin2dec = new Bin2dec();
        aBin2dec.runTest(bin);
    }



}
