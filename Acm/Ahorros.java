import java.util.*;

public class Ahorros
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] price = new int[3];
        double[] disco = new double[2];
        int i;
        for(i=0; i<3; i++) {
            price[i] = s.nextInt();
        }
        double disc = s.nextDouble();
        for(i=0; i<2; i++) {
            disco[i] = (100-s.nextDouble())/100;
        }
        Arrays.sort(price);
        Arrays.sort(disco);
        double tot1 = (price[0]+price[1]+price[2])*(disc/100);
        double tot2 = (price[0]*disco[0])+(price[1]*disco[1]) + price[2];
        if(tot1>tot2) {
            System.out.printf("one %.2f\n",tot1);
        } else System.out.printf("two %.2f\n",tot2);
    }
}
