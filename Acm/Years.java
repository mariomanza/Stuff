import java.util.Scanner;

public class Years
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int total = s.nextInt();
        int y, m, d;
        y = total/365;
        total -= (y*365);
        System.out.println(y+" ano(s)");
        m = total/30;
        total -= (m*30);
        System.out.println(m+" mes(es)");
        d = total;
        System.out.println(d+" dia(s)");
    }
}
