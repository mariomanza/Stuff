import java.util.Scanner;

public class Test
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Linklist l = new Linklist();
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
                            l.add(nam);
                     break;
                case "addf": System.out.println("Name..");
                             nam = s.next();
                             l.addfirst(nam);
                     break;
                case "del": System.out.println("Name..");
                            nam = s.next();
                            l.delete(nam);
                     break;
                case "addin": System.out.println("Name and Number..");
                              nam = s.next();
                              dex = s.nextInt();
                              l.add(nam, dex);
                     break;
                case "delin": System.out.println("Number..");
                               dex = s.nextInt();
                               l.delete(dex);
                     break;
                case "print": System.out.println("Student list..");
                              l.print();
                     break;
                case "exit": System.exit(0);
                     break;
            }
        }
    }
    
}
