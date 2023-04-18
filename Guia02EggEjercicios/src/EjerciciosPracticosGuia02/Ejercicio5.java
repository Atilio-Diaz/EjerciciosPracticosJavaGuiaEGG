package EjerciciosPracticosGuia02;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        int numero;
        Scanner leer=new Scanner(System.in);
        System.out.println("Digite un numero entero para calcular");
        numero=leer.nextInt();
        System.out.println("El doble del numero es: "+numero*2);
        System.out.println("El triple del numero es: "+numero*3);
        System.out.println("La raiz cuadrada del numero es: "+(int)Math.sqrt(numero));
    }   
}
