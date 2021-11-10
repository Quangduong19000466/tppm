package lab2;

import java.util.Scanner;

public class Exponent {
    public static void main(String[] args) {
        int base;
        int exp;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap base");
        base=sc.nextInt();
        System.out.println("nhap exp");
        exp=sc.nextInt();
        System.out.println(base+" raises to the power of "+exp+" is :"+exponent(base,exp));
    }
    public static int exponent(int base,int exp){
        int product=1;
        for (int i=0 ;i <exp;i++){
            product*=base;
        }
        return product;

    }
}
