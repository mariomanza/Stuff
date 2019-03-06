import java.util.Scanner;

public class CTest
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        CLinklist cl = new CLinklist();
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
                            cl.add(nam);
                     break;
                case "del": System.out.println("Number..");
                            dex = s.nextInt();
                            cl.delete(dex);
                     break;
                case "addf": System.out.println("Name..");
                             nam = s.next();
                             cl.addfirst(nam);
                     break;
                /*case "delin": System.out.println("Number..");
                               dex = s.nextInt();
                               cl.delete(dex);
                     break;*/
                case "print": System.out.println("Student list..");
                              cl.print();
                     break;
                case "exit": System.exit(0);
                     break;
            }
        }
    }
    
}
