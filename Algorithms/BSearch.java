import java.util.*;

public class BSearch
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        int n = s.nextInt();
        int x = binarysearch(arr, n, 0, arr.length-1);
        System.out.println((x != -1) ? ("Elemento en indice: "+x) : "Elemento no Encontrado");
    }
    
    private static int binarysearch(int[] arr, int n, int s, int f) {
        if(f >= s) {
            int p = s + (f - s) / 2;
            int x = arr[p];
            if (x == n) {
                return p;
            } else if(x<n) {
                return binarysearch(arr, n, p+1, f);
            } else {
                return binarysearch(arr, n, s, p-1);
            }
        }
        return -1;
    }
}
