import java.util.Scanner;

public class TestHanoi
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tower = 1;
          while (tower > 0) {
            System.out.println("Size of the tower?");
            tower = s.nextInt();
            if(tower>0) {
                Hanoi h = new Hanoi(tower);
                h.move(tower, h.src, h.hlp, h.trg);
                h.show();
            } else System.out.println("BYE");
        }
    }
    
}
