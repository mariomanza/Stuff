import java.util.Scanner;

public class Sortbylength {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nc = s.nextInt();
        String[] res = new String[nc];
        String full;
        int x, i, j;
        for(x=0; x<nc; x++) {
            full = s.nextLine();
            String[] name = full.split(" ");
            String temp = "";
            for (i=1; i<name.length; i++) {
                temp = name[i];
                for (j=i-1; j>-1 && name[j].length() > temp.length(); j--) {
                    name[j+1] = name[j]; 
                }
                name[j+1] = temp;
                res[x] += name[i-1];
            }
        }
        for(x=0; x<nc; x++) {
            System.out.println(res[x]);
        }
    }
}
