import java.util.*;

public class Run
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 1; int c = 0;
        do {
            n = s.nextInt(); c = 0;
            if (n!=0) {
                int[] arr = new int[n];
                for (int i=0; i<n; i++) {
                    arr[i] = s.nextInt();
                }
                for (int j=1; j<n-1; j++) {
                    if (arr[j-1]<arr[j] && arr[j]>arr[j+1] || arr[j-1]>arr[j] && arr[j]<arr[j+1]) {
                        c++;
                    }
                }
                if (arr[n-2]>arr[n-1] && arr[n-1]<arr[0] || arr[n-1]>arr[n] && arr[n]<arr[n+1]) {
                    c++;
                }
                System.out.println(c);
            } else break;
        } while (n!=0);
    }
}
