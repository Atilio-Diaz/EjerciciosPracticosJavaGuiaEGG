package EjerciciosPracticosGuia03;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
       String frase;
        Scanner leer=new Scanner(System.in);
      System.out.println("Ingrese una frase");
      frase=leer.nextLine();
      boolean logic=frase.length()==8;
         if (logic){
             System.out.println("Correcto");
         }else{
             System.out.println("Incorrecto");
         } 
    }
}
