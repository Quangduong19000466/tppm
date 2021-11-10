package Homework1.tppm;

import java.util.Scanner;

public class Hex2Dec {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal String: ");
        String hex = input.nextLine();
        try {
            System.out.println("Thee qui valent decimal number " + hex + " is " + hexToDecimal(hex.toUpperCase()));
        }
        catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static int hexToDecimal(String hex) throws NumberFormatException {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            if (!(hex.charAt(i) >= '0' && hex.charAt(i) <= '9') && !(hex.charAt(i) >= 'A' && hex.charAt(i) <= 'F')){
                throw new NumberFormatException("String is not a hex string");}
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }

        return 0;
    }

    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else
            return ch - '0';
    }
}
