package Homework2;

public class Bai2_3 {
    public static void main(String[] args) {
        System.out.println(len(6));
    }

    public static int len(int n) {
        if (n == 1) {
            return 1;
        } else {
            return len(n - 1) * 10 + n;
        }
    }
}
