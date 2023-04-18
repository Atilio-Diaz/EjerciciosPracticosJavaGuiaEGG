package EjerciciosPracticosGuia02;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        float temperatura;
        Scanner leer=new Scanner(System.in);
        System.out.println("Digite un valor de la temperatura que sera en selcius");
        temperatura=leer.nextFloat();
        System.out.println("La temperatura de: "+temperatura+"°"+" grados CELCIUS"+" sera de: "+(9*temperatura/5)+" FAHRENHEIT");
    }   
}
