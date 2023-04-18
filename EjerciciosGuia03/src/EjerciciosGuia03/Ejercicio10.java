package EjerciciosGuia03;
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
       int num,contador=0;
       Scanner leer=new Scanner(System.in);
       while(contador<4){
                  num=leer.nextInt();
        if (num>=1 && num<=20) {
           for (int i=0;i<num;i++) {
           System.out.print("*");
        } 
           System.out.println("");
        }
        contador++;
       }
   }   
}
