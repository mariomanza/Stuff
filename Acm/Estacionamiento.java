import java.util.*;

public class Estacionamiento
{
    static Queue<String> est = new LinkedList<String>();
    static Queue<String> aux = new LinkedList<String>();
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        Menu();
        String c = "";
        int ch = -1;
        do {
            ch = s.nextInt();
            switch(ch) {
                case 1: c = s.next(); in(c);
                    break;
                case 2: c = s.next(); out(c);
                    break;
                case 3: System.out.println(est);
                    break;
                case 0: System.exit(0);
                    break;
                default: Menu();
                    break;
            }
        } while(ch != 0);
    }
    
    private static void Menu() {
        System.out.println("Bienvenido al Sistema de Estacionamiento Digital,\ndigite:\n-1 para meter un auto\n-2 para sacar un auto\n-3 para listar todos los autos\n-0 para salir");
    }
    
    private static void in(String c) {
        if(est.size() < 10) {
            est.offer(c);
            System.out.println(c + " Metido al Estacionamiento");
        } else {System.out.println("Estacionamiento Lleno O-O");}
    }
    
    private static void out(String c) {
        while(!est.isEmpty()) {
            if (c.equals(est.peek())) {
                System.out.println(est.poll()+" Removido");
            } else {aux.offer(est.poll());}
        }
        while(!aux.isEmpty()) {
            est.offer(aux.poll());
        }
    }
}
