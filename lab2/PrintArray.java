package lab2;

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        final int NUM_ITEMS;
        int [] items;
        Scanner sc= new Scanner(System.in);
        NUM_ITEMS = sc.nextInt();
        items =new int[NUM_ITEMS];
        if(items.length>0){
            for(int i=0;i<items.length;i++){
                items[i]=sc.nextInt();
            }
        }
        System.out.println("Enter the number of items : "+NUM_ITEMS);
        System.out.print("Enter the value of all items (separa ted by space) :");
        for(int i=0;i<items.length;i++){
            System.out.print(items[i]+" ");
        }
        System.out.println();
        System.out.print("the value are: ");
        for(int i=0;i<items.length;i++){
            if(i==0) {
                System.out.print("["+items[i]);
            }else if(i==items.length-1){
                System.out.print(","+items[i]+"]");
            }else{
                System.out.print(","+items[i]);
            }
        }
    }
}
