package lab1;

public class ExtractDigits{
    public static void main(String[] args) {
        int n =15423;
        while (n > 0) {
            int digit = n % 10; // Extract the least-significant digit
            System.out.print(digit+" ");
            n = n / 10;
        }
    }
}
