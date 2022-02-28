package homework4;

import homework4.bai1_2.MyPolynomial;

public class TestMyPolynomial {
    public static void test() {
        // Test constructor
        MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3);
        MyPolynomial p2 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5);

        System.out.println("Polynomial p1: " + p1);
        System.out.println("Polynomial p2: " + p2);

        // Can also invoke with an array
        double[] coeffs = { 1.2, 3.4, 5.6, 7.8 };
        MyPolynomial p3 = new MyPolynomial(coeffs);
        System.out.println("Polynomial p3: " + p3);
    }
}
