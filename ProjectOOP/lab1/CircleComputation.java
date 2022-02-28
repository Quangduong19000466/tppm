package lab1;

import java.lang.Math;
import java.util.Scanner;

public class CircleComputation {
    public static void test() {
        Scanner in = new Scanner(System.in);
        double radius, diameter, circumference, area;
        System.out.print("Enter the radius: ");
        radius = in.nextDouble();
        diameter = 2.0 * radius;
        area = Math.PI * radius * radius;
        circumference = 2.0 * Math.PI * radius;
        System.out.printf("Diameter is: %.2f%n", diameter);
        System.out.printf("area is: %.2f%n", area);
        System.out.printf("circumference is: %.2f%n", circumference);
    }
}
