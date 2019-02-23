import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Power
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Queue<Integer> cit = new LinkedList<Integer>();
        int n = 1;
        int m = 1;
        while (n!=0) {
            n = s.nextInt();
            if (n!=0) {
                for (int i=1; i<=n; i++) {
                    cit.add(i);
                }
                while (cit.peek() != 13) {
                    for (int i=0; i<=m; i++) {
                    }
                }
            }
        }
    }
}
