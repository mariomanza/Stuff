import java.util.*;

public class Sum
{
    public static void main(String[] args) {
        int[] org = {4,5,7,2,5,9};
        int x = Cuenta(org);
        System.out.println(x);
    }
    
    public static int Cuenta (int[] arr) {
        if (arr.length != 1) {
            int n1 = arr.length/2;
            int n2 = arr.length-n1;
            int[] part1 = new int[n1];
            int[] part2 = new int[n2];
            
            for (int i=0; i<n1; i++) {
                part1[i] = arr[i];
            }
            for (int j=n1; j<n2; j++) {
                part2[j] = arr[j];
            }
            Print(part1); Print(part2);
            return Cuenta(part1) + Cuenta(part2);
        } else {
            return arr[0];
        }
    }
    
    private static void Print(int[] arr) {
      for(int i=0;i<arr.length;i++) {
          if ((i+1)%10 != 0) {
              System.out.print(arr[i]+"-");
          } else {System.out.println(arr[i]+"-");}
      }
      System.out.println(":]");
  }
}
