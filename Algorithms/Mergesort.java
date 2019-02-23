import java.util.*;

public class Mergesort
{
    public static void main (String[] args) {
        int[] arr = {4,7,3,9,6,5,7,3,0,9,2,7,0,1,2,1};
        print(arr);
        sort(arr, 0, arr.length);
        print(arr);
    }
    
    private static void merge (int[] arr, int l, int m, int r) {
        int[] p1 = Arrays.copyOfRange(arr, 0, (m-l+1));
        int[] p2 = Arrays.copyOfRange(arr, (m-l+2), (r-m));
        int i = 0, j = 0;
        int k = l;
        while (i<p1.length && j<p2.length) {
            if (p1[i] <= p2[j]) {
                arr[k] = p1[i];
                i++;
            } else {
                arr[k] = p2[j];
                j++;
            }
            k++;
        }
        while (i < p1.length) {
            arr[k] = p2[j];
            i++;
            k++;
        }
        while (j < p2.length) {
            arr[k] = p2[j];
            j++;
            k++;
        }
    }
    
    private static void sort (int[] arr, int l, int r) {
        if (l < r) {
            int m = (l+r)/2;
            sort(arr, l, m);
            sort(arr, m+1, r);
            merge(arr , l , m , r);
        }
    }
    
      private static void print(int[] arr) {
          System.out.print("{");
              for(int i=0;i<arr.length;i++) {
                  if ((i+1)%10 != 0) {
                      System.out.print(arr[i]+", ");
                    } else {System.out.println(arr[i]+", ");}
                }
          System.out.println("}");
    }
}