package lab2;

import java.util.Scanner;

public class PrintAraay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int array[]=new int[n];
        for (int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        print(array);
    }
    public static void print(int [ ] array){
        for (int i=0;i<array.length;i++) {
            if (i == 0) {
                System.out.print("["+array[i]);
            }else if(i==array.length-1){
                System.out.print(","+array[i]+"]");
            }else System.out.print(","+array[i]);
        }
    }
}
