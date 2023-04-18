package EjerciciosPracticosGuia02;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        String frase;
        Scanner leer=new Scanner(System.in);
        System.out.println("Escriba una frace");
        frase=leer.nextLine();
        System.out.println("La frase con mayusculas es: "+frase.toUpperCase());
        System.out.println("La frase con minuBsculas es: "+frase.toLowerCase());
    }
}
