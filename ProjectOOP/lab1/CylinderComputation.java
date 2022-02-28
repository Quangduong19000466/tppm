package lab1;

import java.util.Scanner;
import java.lang.Math;

public class CylinderComputation {
    public static void test() {
        Scanner in = new Scanner(System.in);
        double radius, surfaceArea, baseArea;
        System.out.print("Enter the radius: ");
        radius = in.nextDouble();
        baseArea = Math.PI * radius * radius;
        surfaceArea = 2.0 * Math.PI * radius + 2.0 * baseArea;
        System.out.printf("surfaceArea is: %.2f%n", surfaceArea);
        System.out.printf("baseArea is: %.2f%n", baseArea);

    }
}
