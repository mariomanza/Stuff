import java.util.*;

public class Bankcoins {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double m = s.nextDouble();
        System.out.println("NOTAS:");
        System.out.printf("%.0f nota(s) de R$ 100.00\n", (m-(m%100))/100);
        m = (m%100);
        System.out.printf("%.0f nota(s) de R$ 50.00\n", ((m-(m%50))/50));
        m = (m%50);
        System.out.printf("%.0f nota(s) de R$ 20.00\n", ((m-(m%20))/20));
        m = (m%20);
        System.out.printf("%.0f nota(s) de R$ 10.00\n", ((m-(m%10))/10));
        m = (m%10);
        System.out.printf("%.0f nota(s) de R$ 5.00\n", ((m-(m%5))/5));
        m = (m%5);
        System.out.printf("%.0f nota(s) de R$ 2.00\n", ((m-(m%2))/2));
        m = (m%2);
        System.out.println("MOEDAS:");
        System.out.printf("%.0f moeda(s) de R$ 1.00\n", ((m-(m%1))/1));
        m = (m%1);
        System.out.printf("%.0f moeda(s) de R$ 0.50\n", ((m-(m%.5))/.5));
        m = (m%.5);
        System.out.printf("%.0f moeda(s) de R$ 0.25\n", ((m-(m%.25))/.25));
        m = (m%.25);
        System.out.printf("%.0f moeda(s) de R$ 0.10\n", ((m-(m%.10))/.10));
        m = (m%.10);
        System.out.printf("%.0f moeda(s) de R$ 0.05\n", ((m-(m%.05))/.05));
        m = (m%.05);
        System.out.printf("%.0f moeda(s) de R$ 0.01\n", ((m-(m%.01))/.01));
    }
}
