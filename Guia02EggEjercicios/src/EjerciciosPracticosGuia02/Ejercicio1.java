package EjerciciosPracticosGuia02;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        int num_uno,num_dos;
        Scanner leer=new Scanner(System.in);
        System.out.println("Digita el primer numero para sumar ");
        num_uno=leer.nextInt();
        System.out.println("Digita el segundo numero para sumar ");
        num_dos=leer.nextInt();
        System.out.println("La suma de: "+num_uno+"+"+num_dos+" es: "+(num_uno+num_dos));
    }    
}
