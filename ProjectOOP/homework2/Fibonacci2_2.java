package homework2;

public class Fibonacci2_2 {
    public static void test() {
        System.out.println(fibonacci(3));
    }
    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
}
