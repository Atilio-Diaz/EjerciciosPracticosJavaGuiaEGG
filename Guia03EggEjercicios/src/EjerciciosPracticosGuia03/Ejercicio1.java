package EjerciciosPracticosGuia03;
import java.util.Scanner;
public class Ejercicio1{
    public static void main(String[]args){
      int num;
        Scanner leer=new Scanner(System.in);
      System.out.println("Ingrese un numero");
        num=leer.nextInt();
        if (num%2==0){
            System.out.println("El numero ingresado es par");
        }else{
            System.out.println("El numero ingresado es impar");
        }  
    }
}