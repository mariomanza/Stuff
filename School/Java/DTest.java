import java.util.Scanner;

public class DTest
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DLinklist dl = new DLinklist();
        String ch = null;
        String nam = null;
        int dex = 0;
        System.out.println("Welcome to the Student Management System!"+
                            "\nType Add to add a new Student, or Addin, to specify his number on the list"+
                            "\nType Del to delete a Student by name, or Delin, to delete by number"+
                            "\nType Print to show all the Students, or Exit to close the system");
                            
        while (ch != "exit") {
            ch = s.next();
            ch = ch.toLowerCase();
            switch(ch) {
                case "add": System.out.println("Name..");
                            nam = s.next();
                            dl.add(nam);
                     break;
                case "print": System.out.println("Student list..");
                              dl.print();
                     break;
                case "printrv": System.out.println("Student list rv..");
                                dl.printrv();
                     break;
                case "exit": System.exit(0);
                     break;
            }
        }
    }
}
