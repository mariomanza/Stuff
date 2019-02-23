import java.util.*;

public class Average3 {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        float n1 = s.nextFloat(), n2 = s.nextFloat(), n3 = s.nextFloat(), n4 = s.nextFloat(), avg, exam, res;
        avg = ((n1*2)+(n2*3)+(n3*4)+(n4*1))/10;
        System.out.printf("Media: %.1f \n", avg);
        if (avg >= 7.0) {
            System.out.print("Aluno aprovado. \n");
        } else if (avg >= 5.0 && avg <= 6.9) {
            System.out.print("Aluno em exame. \n");
            exam = s.nextFloat();
            System.out.printf("Nota do exame: %.1f \n", exam);
            res = (exam+avg)/2;
            if (res >= 5.0) {
                System.out.print("Aluno aprovado. \n");
            } else {System.out.print("Aluno reprovado. \n");}
            System.out.printf("Media final: %.1f \n", res);
        } else if (avg < 5.0){
            System.out.print("Aluno reprovado. \n");
        }
    }
}
