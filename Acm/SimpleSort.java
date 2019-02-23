import java.util.*;

public class SimpleSort {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = s.nextInt(), c = s.nextInt();
        int a1 = 0, b1 = 0, c1 = 0;
        a1 = Math.min(a, Math.min(b,c));
        if (a1 == a) {
            b1 = Math.min(b, c);
            c1 = Math.max(b, c);
        }
        if (a1 == b) {
            b1 = Math.min(a, c);
            c1 = Math.max(a, c);
        }
        if (a1 == c) {
            b1 = Math.min(a, b);
            c1 = Math.max(a, b);
        }
        System.out.println(a1+"\n"+b1+"\n"+c1+"\n");
        System.out.println(a+"\n"+b+"\n"+c);
    }
}
