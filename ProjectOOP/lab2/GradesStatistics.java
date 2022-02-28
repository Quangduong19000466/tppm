package lab2;

import java.util.Scanner;

public class GradesStatistics {
    public static void test() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap luong hoc sinh");
        int numStudents = sc.nextInt();
        int array[] = new int[numStudents];
        System.out.println("nhap diem hoc sinh <100 va >0");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("enter the number of student: " + numStudents);
        for (int i = 0; i < array.length; i++) {
            System.out.println("enter the grade fo student " + (i + 1) + ": " + array[i]);
        }
        double s = 0;
        for (int i = 0; i < array.length; i++) {
            s = s + array[i];
        }
        System.out.printf("the arevager is: %.2f%n", s / numStudents);
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(" minimum = " + min);
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(" maximum = " + max);
    }
}
