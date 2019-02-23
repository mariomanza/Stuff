import java.util.*;

public class Painting
{
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), m = s.nextInt();
        char[][] arr = new char[n][m];
        String ln = "";
        for(int i=0; i<n; i++) {
            ln = s.next();
            arr[i] = ln.toCharArray();
        }
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                arr[i][m] = 0;
            }
        }
        Print(arr);
    }
    
    private static void Print(char[][] arr) {
      for(int i=0;i<arr.length;i++) {
          for (int j=0; j<arr[0].length; j++) {
              System.out.print(arr[i][j]);
          }
          System.out.println("");
      }
    }
}
