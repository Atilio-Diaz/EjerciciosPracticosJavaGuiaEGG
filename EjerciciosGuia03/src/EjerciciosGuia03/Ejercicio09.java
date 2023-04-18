package EjerciciosGuia03;
import java.util.Scanner;
public class Ejercicio09 {
    public static void main(String[] args) {
      int num,suma=0,contador=0;
      Scanner leer=new Scanner(System.in);
      System.out.println("Digite hasta 20 numeros para sumar pulse cero para generar la suma");
      do{
          num=leer.nextInt();
          if (num>=1) {
            suma+=num;
          }else if (num<0) {
              System.out.println("Los numeros negativos seraningnorados");
          }else{
              break;
          }
          contador++;
         }while(contador<20);
          System.out.println("La suma de los numeros es: "+suma);
     } 
}