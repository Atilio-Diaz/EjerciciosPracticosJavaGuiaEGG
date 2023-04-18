package EjerciciosGuia03;
import java.util.Scanner;
public class Ejercicio08 {
    public static void main(String[] args) {
        int nota;
        Scanner leer=new Scanner(System.in);
        System.out.println("Digite una nota entre 0 a 10");
        nota=leer.nextInt();
        while(nota<0 || nota>10 ){
            System.out.println("Digite una nota entre 0 a 10");
            nota=leer.nextInt();
        }
        System.out.println("Nota valida "+nota);
    }
}
