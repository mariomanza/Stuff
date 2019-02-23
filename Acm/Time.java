import java.util.Scanner;

public class Time
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int time = s.nextInt();
        int sc, mn, hr;
        hr = time/3600;
        mn = time/60 - (hr*60);
        sc = time - (mn*60) - (hr*3600);
        System.out.println(hr+":"+mn+":"+sc);
    }
}
