package lab1;

import java.util.Scanner;
import java.lang.Math;
public class SphereComputation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius, surfaceArea, volume;
        System.out.print("Enter the radius: ");
        radius = in.nextDouble();
        surfaceArea = 4 * Math.PI * radius * radius;
        volume = 4 /3 * Math.PI * radius * radius * radius;
        System.out.printf("surfaceArea is: %.2f%n", surfaceArea);
        System.out.printf("volume is: %.2f%n", volume);

    }
}
