import java.util.*;

public class BubSort
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[3];
        int a,b,c;
        a = arr[0] = s.nextInt();
        b = arr[1] = s.nextInt();
        c = arr[2] = s.nextInt();
        bubbleSort(arr);
        System.out.println(arr[0]+"\n"+arr[1]+"\n"+arr[2]+"\n");
        System.out.println(a+"\n"+b+"\n"+c);
    }
    
    static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i<n; i++) {
            for(int j=1; j<(n-i); j++) {
               if(arr[j-1] > arr[j]) {
                   temp = arr[j-1];  
                   arr[j-1] = arr[j];  
                   arr[j] = temp;  
               }    
            }
         }
    }
}
