package homework4.bai1_1;

import java.util.Scanner;

public class MyComplexApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1 (real and imaginary part ): ");
        MyComplex myComplex1 = new MyComplex(sc.nextDouble(), sc.nextDouble());
        System.out.print("Enter the number 2 (real and imaginary part ): ");
        MyComplex myComplex2 = new MyComplex(sc.nextDouble(), sc.nextDouble());

        System.out.println("Number 1 is :" + myComplex1);
        testIsReal(myComplex1);
        testIsImaginary(myComplex1);

        System.out.println("Number 2 is :" + myComplex2);
        testIsReal(myComplex2);
        testIsImaginary(myComplex2);
        testEquals(myComplex1, myComplex2);
        System.out.println(myComplex1 + " + " + myComplex2 + " = " + myComplex1.addInto(myComplex2));
    }

    public static void testIsReal(MyComplex myComplex) {
        if (myComplex.isReal() == true) {
            System.out.println(myComplex + " is a pure  real number");
        } else {
            System.out.println(myComplex + " is NOT pure real number");
        }
    }

    public static void testIsImaginary(MyComplex myComplex) {
        if (myComplex.isImaginary() == true) {
            System.out.println(myComplex + " is a pure  imaginary number");
        } else {
            System.out.println(myComplex + " is NOT pure imaginary number");
        }
    }

    public static void testEquals(MyComplex myComplex1, MyComplex myComplex2) {
        if (myComplex1.equals(myComplex2) == true) {
            System.out.println(myComplex1 + " is equals to " + myComplex2);
        } else {
            System.out.println(myComplex1 + " is NOT equals to " + myComplex2);
        }

    }

}
