import java.util.Scanner;

public class Gas
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int time = s.nextInt();
        int speed = s.nextInt();
        double dist = speed * time;
        dist /= 12;
        System.out.printf("%.3f", dist);
    }
}
