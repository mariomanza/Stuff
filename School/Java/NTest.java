import java.util.Scanner;

public class NTest
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Ntree tr = new Ntree();
        String ch = null;
        int data = 0;
        menu();
        while (ch != "exit") {
            ch = s.next();
            ch = ch.toLowerCase();
            switch(ch) {
                case "add": data = s.nextInt();
                             tr.root = tr.add(tr.point, data);
                     break;
                case "del": data = s.nextInt();
                            tr.root = tr.delete(tr.root, data);
                     break;
                  case "current": tr.curr();
                     break;
                  case "movel": tr.movel();
                     break;
                  case "mover": tr.mover();
                     break;
                  case "reset": tr.reset();
                     break;
                case "find":
                     data = s.nextInt(); System.out.println("Looking...");
                     if(tr.contains(tr.root, data) == true) {
                         System.out.println("Data Found! :)");
                     } else {System.out.println("Data not found :(");}
                     break;
                case "print": tr.inorder(tr.root);
                     break;
                case "preprint": tr.preorder(tr.root);
                     break;
                case "posprint": tr.posorder(tr.root);
                     break;
                case "lvlprint": tr.lvlorder();
                     break;
                case "help": menu();
                      break;
                case "exit": System.exit(0);
                     break;
            }
        }
    }
    
    public static void menu() {
        System.out.println("Welcome to the String File Management System!"+
                            "\nadd/del- adds/deletes given number"+
                            "\nmovel/mover- moves the pointer"+
                            "\ncurrent- shows current pointer position"+
                            "\nfind- looks for given number"+
                            "\nprint/preprint/posprint/lvlprint- prints all the tree"+
                            "\nor exit to close the system, type HELP to repeat instructions");
    }
}
