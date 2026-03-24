import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> c= new LinkedList();
        boolean continuar=true;
        while (continuar){
            System.out.println("ingrese un numero");
            c.offer(sc.nextInt());
            System.out.println("desea continuar? 1=si, 2=no");
            int opcion = sc.nextInt();
            if (opcion == 2) {
                System.out.println("hasta luego");

                continuar = false;
            }
        }
        System.out.println(c);
        System.out.println("tope: " + c.peek());
        System.out.println("eliminar tope");
        c.remove();
        System.out.println(c);
    }


}
