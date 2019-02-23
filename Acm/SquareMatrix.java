import java.util.*;

public class SquareMatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();
        int size = 0, j, x, i;
        for(i=1; i<=cases; i++) {
            size = s.nextInt();
            long[][] arr = new long[size][size];
            int[] space = new int[size];
            for(j=0; j<size; j++) {
                for(x=0; x<size; x++) {
                    arr[j][x] = (long)Math.pow(s.nextInt(), 2);
                    if(space[x] < String.valueOf(arr[j][x]).length()) {
                        space[x] = String.valueOf(arr[j][x]).length();
                    }
                }
            }
            System.out.println("Quadrado da matriz #"+i+":");
            for(j=0; j<size; j++) {
                for(x=0; x<size; x++) {
                    System.out.printf("%"+space[x]+"d ", arr[j][x]);
                } System.out.println("");
            }
        }
    }
}
