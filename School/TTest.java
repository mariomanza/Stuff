import java.util.Scanner;

public class TTest
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Tree cl = new Tree();
        String ch = null;
        String nam = null;
        System.out.println("Welcome to the String File Management System!"+
                            "\nType addr or addl followed by a name to add a new dir"+
                            "\nType chg and a name to change the current dir name"+
                            "\nType print to show all the dir or sons to show the current dirs sons"+
                            "\nor exit to close the system");
        while (ch != "exit") {
            ch = s.next();
            ch = ch.toLowerCase();
            switch(ch) {
                case "addl": nam = s.next();
                             cl.addl(nam);
                     break;
                case "addr": nam = s.next();
                             cl.addr(nam);
                     break;
                case "chg": nam = s.next();
                            cl.change(nam);
                     break;
                  case "current": cl.curr();
                     break;
                  case "movel": cl.movel();
                     break;
                  case "mover": cl.mover();
                     break;
                  case "moveup": cl.moveup();
                     break;
                  case "sons": cl.sons();
                     break;
                  case "parent": cl.parent();
                     break;
                case "print": cl.print(cl.root);
                     break;
                case "exit": System.exit(0);
                     break;
            }
        }
    }
}
