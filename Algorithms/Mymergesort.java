import java.util.*;

public class Mymergesort
{
    public static void main(String[] args) {
        int[] x = {6,3,7,9,2,3,0,1,4,7,5,8,9,4,2,1,10,5,4};
        x = merge(x);
        print(x);
    }
    
    public static int[] merge(int[] arr) {
        if(arr.length>1) {
            int x = arr.length/2;
            int[] a = Arrays.copyOfRange(arr, 0, x);
            int[] b = Arrays.copyOfRange(arr, x, arr.length);
            return sort(merge(a), merge(b));
        }
        return arr;
    }
    
    public static int[] sort(int[] a, int[] b) {
        int[] arr = new int[(a.length+b.length)];
        int i=0, j=0, k=0;
        while(i<a.length && j<b.length) {
            if(a[i] <= b[j]) {
                arr[k] = a[i]; i++;
            } else {
                arr[k] = b[j]; j++;
            } k++;
        }
        
        while(i<a.length) {
            arr[k] = a[i];
            i++; k++;
        }
        while(j<b.length) {
            arr[k] = b[j];
            j++; k++;
        }
        return arr;
    }
    
    private static void print(int[] arr) {
      for(int i=0;i<arr.length;i++) {
          System.out.print(arr[i]+"-");
      }
      System.out.println("");
    }
}
