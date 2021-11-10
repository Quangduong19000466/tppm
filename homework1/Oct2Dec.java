package Homework1.tppm;

import java.util.Scanner;
import java.lang.Math ;
public class Oct2Dec {
    public static void main(String[] args) {
        System.out.println("nhap so");
        int oct= new Scanner(System.in).nextInt();
        System.out.println("Enter an Octal String:"+oct);
        int i=0;
        double decimal=0;
        while (oct>0){
            decimal=decimal+(oct%10)*Math.pow(8,i);
            i++;
            oct/=10;
        }
        System.out.println("The equival ent decimal number: "+oct+" is:"+decimal);
    }
}
