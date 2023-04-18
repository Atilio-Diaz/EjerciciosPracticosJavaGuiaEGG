package EjerciciosPracticosGuia03;
import java.util.Scanner;
public class Ejercicio2{
    public static void main(String[]args){
String frase;
      Scanner leer=new Scanner(System.in);
      System.out.println("Ingrese una frase");
      frase=leer.nextLine();
      boolean acierto=frase.equalsIgnoreCase("eureka");
        if (acierto){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        } 
    }
}