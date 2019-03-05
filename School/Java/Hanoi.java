import java.util.Stack;
import java.util.Scanner;

public class Hanoi
{
    Stack src = new Stack();
    Stack hlp = new Stack();
    Stack trg = new Stack();
    int t; int c;
    
    public Hanoi(int tower)
    {
        t = tower;
        c = 0;
        for (int i=tower; i>0; i--) {
            src.push(i);
        }
        System.out.println(src);
    }
    
    public void move (int t, Stack src, Stack hlp, Stack trg) {
        if (t == 1) {
            trg.push(src.pop());
        } else {
            move(t-1, src, trg, hlp);
            show();
            trg.push(src.pop());
            show();
            move(t-1, hlp, src, trg);
        }
    }
    
    public void show() {
        System.out.println(src+""+hlp+""+trg);
    }
}





