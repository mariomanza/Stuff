import java.util.*;

public class Juego
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c=-1;
        while(c!=0){
            c=s.nextInt();
            if(c!=0){
                s.nextLine();
                String [] n = s.nextLine().split(" ");
                int a [] = new int[n.length+2];
                for (int j=0; j<a.length; j++){
                    if(j<=n.length-1){
                        a[j]=Integer.parseInt(n[j]);
                    }
                    if(j==a.length-2){
                        a[j]=Integer.parseInt(n[0]);
                    }
                    if(j==a.length-1){
                        a[j]=Integer.parseInt(n[1]);
                    }
                }
                int nn=0;
                for(int i=1; i<=c;i++){
                    if (a[i]>a[i-1]&&a[i]>a[i+1]||a[i]<a[i+1]&&a[i]<a[i-1]){
                        nn++;
                    }
                }
                System.out.println(nn);
            }
        }
    }
}
