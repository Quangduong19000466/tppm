package Homework2;

public class Factorialdequy2 {

    public static void main(String[] args) {
        System.out.println(factorialDeQuy(5));
    }

    public static int factorialDeQuy(int n) {
        if (n > 0) {
            return n * factorialDeQuy(n - 1);
        } else {
            return 1;
        }
    }
}
