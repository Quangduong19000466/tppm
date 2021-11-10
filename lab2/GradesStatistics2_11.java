package lab2;

import java.util.Scanner;
import java.lang.Math;

public class GradesStatistics2_11 {
    public static int[] grades;

    public static void main(String[] args) {
        readGrades();
        print(grades);
        System.out.println();
        System.out.printf("the average is: %.2f%n ", average(grades));
        System.out.printf("the median is:%.2f%n ", median(grades));
        System.out.println("the max is: " + max(grades));
        System.out.println("the min is: " + min(grades));
        System.out.printf("the deviation is:%.2f%n ", sdtDev(grades));


    }

    public static void readGrades() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of students: ");
        int n = sc.nextInt();
        int array[] = new int[n];

        for (int i = 0; i < array.length; i++) {
            System.out.print("enter the grade student " + (i + 1) + ":");
            array[i] = sc.nextInt();
        }
        grades = array;
    }

    public static void print(int[] array) {
        System.out.print("the grades are: ");
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("[" + array[i]);
            } else if (i == array.length - 1) {
                System.out.print("," + array[i] + "]");
            } else {
                System.out.print("," + array[i]);
            }
        }
    }

    public static double average(int[] array) {
        double arevage;
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        arevage = sum / array.length;
        return arevage;
    }

    public static double median(int array[]) {
        int median;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        median = sum / array.length;
        return median;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static double sdtDev(int[] array) {
        double sum=0;
        double dev=0;
        for (int i =0 ;i<array.length;i++){
            dev=(1/array.length)*array[i]-average(array)*average(array);
            sum=sum+dev;
        }

        return sum;
    }
}
