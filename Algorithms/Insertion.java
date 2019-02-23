import java.util.*;
public class Insertion {
  public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.println("Indique tamaño del arr");
      int x = s.nextInt();
      int[] arr = Rand(x);
      Print(arr);
      int temp = 0;
      for (int i=1; i<arr.length; i++) {
          temp = arr[i];
          int j;
           for (j=i-1; j>-1 && arr[j] < temp; j--) {
               arr[j+1] = arr[j]; 
           }
          arr[j+1] = temp;
      }
      Print(arr);
  }
  
  private static int[] Rand(int size) {
      int[] random = new int[size];
      for(int i=0; i<size; i++) {
          random[i] = (int)(Math.random() * ((size) + 1));
      }
      return random;
  }
  
  private static void Print(int[] arr) {
      for(int i=0;i<arr.length;i++) {
          if ((i+1)%10 != 0) {
              System.out.print(arr[i]+"-");
          } else {System.out.println(arr[i]+"-");}
      }
      System.out.println("");
  }
}
