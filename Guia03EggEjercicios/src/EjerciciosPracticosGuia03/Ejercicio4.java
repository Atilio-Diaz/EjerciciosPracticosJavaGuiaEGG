package EjerciciosPracticosGuia03;
import java.util.Scanner;
public class Ejercicio4{
    public static void main(String[]args){
   String frase,letra; 
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese una frase");
         frase=leer.nextLine();
         letra=frase.substring(0,1);
        if (letra.equalsIgnoreCase("a")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
}