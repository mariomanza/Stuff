import java.util.*;

public class Quicksort
{
    
      static  int[] arr = {2,5,3,6,8,3,5,89,0,8,3,1,4,8,89,43,5,8,9,4,2,1,2,6,8,9,9,8,6,43,4,6};
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        quicksort(arr, 0, arr.length-1);
        print(arr);
    }
    
    private static void quicksort(int[] arr, int l, int h) {
        if(l<h) {
            int pi = part(arr, l, h);
            quicksort(arr, l, pi-1);
            quicksort(arr, pi+1, h);
        }
    }
    
    private static int part(int[] arr, int l, int h) {
        int piv = arr[h];
        int i = l-1;
        int temp;
        for(int j=l; j<h-1; j++) {
            if(arr[j] <= piv) {
                i++;
                temp = arr[i];  
                arr[i] = arr[j];  
                arr[j] = temp; 
            }
        }
        temp = arr[i+1];
        arr[i+1] = arr[h];
        arr[h] = temp;
        return i+1;
    }
    
    private static void print(int[] arr) {
      for(int i=0;i<arr.length;i++) {
          System.out.print(arr[i]+" ");
      }
      System.out.println("");
    }
}
