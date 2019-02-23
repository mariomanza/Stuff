import java.util.Scanner;

public class Parcial_1
{
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        String full = s.nextLine();
        String[] name = full.split(" ");
        String temp = "";
        for (int i=1; i<name.length; i++) {
            temp = name[i];
            int j;
            for (j=i-1; j>-1 && name[j].length() > temp.length(); j--) {
               name[j+1] = name[j]; 
            }
            name[j+1] = temp;
        }
        Print(name);
    }
    private static void Print(String[] arr) {
      for(int i=0;i<arr.length;i++) {
          System.out.print(arr[i]+" ");
      }
      System.out.println("");
    }
}
