import java.util.Scanner;

public class Test1
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(); int b = s.nextInt();
        int c = s.nextInt(); int d = s.nextInt();
        if (a%2 == 0 && b>c && d>a && (c+d) > (a+b) && c>=0 && d>=0) {
            System.out.println("Valores aceitos");
        } else System.out.println("Valores nao aceitos");
    }
}
