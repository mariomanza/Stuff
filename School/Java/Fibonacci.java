import java.util.Scanner;

 public class Fibonacci
{
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long f = 0;
        int temp = 1;
         while (temp > 0) {
            System.out.println("Cuantos numeros quiere?");
            f = s.nextInt();
            temp = (int) f;
            f = 0;
             for (int i=0; i<temp; i++) {
                System.out.print(Fibonacci(f) +" ");
                f++;
            }
            System.out.println("");
        }
    }
    
    private static long Fibonacci(long f) {
         if (f<2) {
            return 1;
        } else {
            return Fibonacci(f-2) + Fibonacci(f-1);
        }
    }
}
