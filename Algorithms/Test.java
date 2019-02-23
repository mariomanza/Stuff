import java.util.*;
public class Test
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] x = {0,1,2,3,4,5,6,7,8,9,10};
        int l = x.length/2;
        int r = x.length-l;
        int[] a = Arrays.copyOfRange(x, 0, l);
        int[] b = Arrays.copyOfRange(x, l, x.length);
        int[] y = new int[l];
        System.arraycopy(x, 0, y, 0, l);
        int[] z = new int[r];
        System.arraycopy(x, l, z, 0, r);
        System.out.println(System.nanoTime());
        System.out.printf("%.3f\n", System.nanoTime()/(Math.pow(10.0, 9)));
        for(int i=0; i<a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println("");
        for(int i=0; i<b.length; i++) {
            System.out.print(b[i]);
        }
        System.out.println("");
        for(int i=0; i<y.length; i++) {
            System.out.print(y[i]);
        }
        System.out.println("");
        for(int i=0; i<z.length; i++) {
            System.out.print(z[i]);
        }
    }
}
