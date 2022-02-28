package lab1;

/**
 * Trying nested-if and switch-case statements.
 */
public class PrintNumberInWord { // Save as "PrintNumberInWord.java"
    public static void test() {
        int number = 5; // Set the value of "number" here!
// Using nested-if
        if (number == 1) { // Use == for comparison
            System.out.println("one");
        } else if (number == 2) {
            System.out.println("two");
        } else if (number == 3) {
            System.out.println("three");
        } else if (number == 4) {
            System.out.println("four");
        } else if (number == 5) {
            System.out.println("five");
        } else if (number == 6) {
            System.out.println("six");
        } else if (number == 7) {
            System.out.println("seven");
        } else if (number == 8) {
            System.out.println("eight");
        } else if (number == 9) {
            System.out.println("nine");
        } else {
            System.out.println("other");
        }
// Using switch-case-default
        switch (number) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;

            default:
                System.out.println("other");
        }
    }
}