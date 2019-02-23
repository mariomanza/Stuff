import java.util.*;
public class BinomioNewton
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = 1; long k = 0;
        while(n!=0) {
            n = s.nextInt();
            print(n, k);
            System.out.println("");
        }
    }
    
    private static void print(long n, long k) {
        System.out.print(Combinacion(n, k)+"(a^"+(n-k)+")(b^"+k+") + ");
        if (k<n) {
            print(n, k+1);
        }
    }
    
    private static long Combinacion(long n, long k) {
        long com = Fact(n) / (Fact(k) * Fact(n-k));
        return com;
    }
    
    private static long Fact(long n) {
        if (n<=1) {
            return 1;
        } else {
            return (n * Fact(n-1));
        }
    }
}
