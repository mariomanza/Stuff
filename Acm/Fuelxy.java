import java.util.Scanner;

public class Fuelxy
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int dist = s.nextInt();
        float fuel = s.nextFloat();
        double avg = Math.round((dist/fuel) * 1000) / 1000.0;
        System.out.println(avg + " km/l");
    }
}
