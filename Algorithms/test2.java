import java.util.*;

public class test2
{
    public static void main(String[] args) {
        int[] a = {1};
        int[] b = {0};
        int[] c = combine(a,b);
        System.out.println(Arrays.toString(a)+Arrays.toString(b));
        System.out.println(Arrays.toString(c));
    }
    
    public static int[] combine(int[] a, int[] b){
        int[] result = new int[a.length + b.length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        return result;
    }
}
