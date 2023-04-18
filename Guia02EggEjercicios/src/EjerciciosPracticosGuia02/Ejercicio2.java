package EjerciciosPracticosGuia02;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        String nombre;
        Scanner leer=new Scanner(System.in);
        System.out.println("Escribe tu nombre");
        nombre=leer.nextLine();
        System.out.println("Hola "+nombre+" en hora buena por programar");
    }
}
