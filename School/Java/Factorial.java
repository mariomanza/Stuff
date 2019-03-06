import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = 0;
        while (n!=-1) {
            System.out.println("Numero a factorizar...");
            n = s.nextInt();
            long res = Factorial(n);
            System.out.println(res);
        }
    }
    
    private static long Factorial(long n) {
        if (n<=1) {
            return 1;
        } else {
            return (n * Factorial(n-1));
        }
    }
}
