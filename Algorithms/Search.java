import java.util.*;

public class Search {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = {2,6,4,8,6,7,9,2,1,4,6,4,3};
        int n = s.nextInt();
        int t = -1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == n) {
                t = i;
            }
        }
        System.out.println(t);
    }
}
