package homework1;

import java.util.Scanner;

public class CheckHexStr {
    public static void test() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal String: ");
        String hex = input.nextLine();
        try {
            System.out.println(hex + "is a hex string" + checkHex(hex.toUpperCase()));
        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static String checkHex(String hex) throws NumberFormatException {
        for (int i = 0; i < hex.length(); i++) {
            if (!(hex.charAt(i) >= '0' && hex.charAt(i) <= '9') && !(hex.charAt(i) >= 'A' && hex.charAt(i) <= 'F')) {
                throw new NumberFormatException(hex + " is a NOT hex string");
            }
        }
        return "";
    }
}
