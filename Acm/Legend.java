import java.util.*;

public class Legend
{
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int nc = s.nextInt();
        Queue<Integer> q = new LinkedList<>();
        int n,k;
        for (int i=1; i<=nc; i++) {
            n = s.nextInt();
            k = s.nextInt(); 
            for (int j=1; j<=n; j++) {
                q.add(j);
            }
            int temp = 0;
            while (q.peek() != null) {
                for (int x=1; x<k; x++) {
                    temp = q.poll();
                    q.add(temp);
                }
                temp = q.poll();
            }
                System.out.println("Case "+i+": "+temp);
        }
    }
}
