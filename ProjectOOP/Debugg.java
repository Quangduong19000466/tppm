public class Debugg {
    public static void main(String[] args) {

        int s = Integer.MAX_VALUE;
        System.out.println(s);
        int d = Integer.MIN_VALUE;
        System.out.println(d);
        int c = s + 1;
        System.out.println(c);



        int n = 17;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println("tha factorial of " + n + " is " + factorial);
    }
}
