package Homework2;

public class FibonacciInt {
    public static void main(String[] args) {
        for(int i =0;i<1000;i++){
            if(finonacciInt(i)<0){
                System.out.println("the fibonacci of " + i + " is out the range");
                System.exit(1);
            }else {
                System.out.println("the fibonacci " + i + " is " + finonacciInt(i));
            }
        }
    }

    public static int finonacciInt(int n) {
        int f1 = 1;
        int f2 = 1;
        int fn = 0;
        for (int i = 0; i < n; i++) {
            f1 = f2;
            f2 = fn;
            fn = f1 + f2;
        }
        return fn;
    }

}
