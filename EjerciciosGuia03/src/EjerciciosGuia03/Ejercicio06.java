package EjerciciosGuia03;
import java.util.Scanner;
public class Ejercicio06 {
    public static void main(String[] args) {
        int num_uno,num_dos;
        Scanner leer=new Scanner(System.in);
        System.out.println("Digite un primer numero entero para calcular");
        num_uno=leer.nextInt();
        System.out.print("\033");
        System.out.flush();
        System.out.println("Digite un segundo numero entero para calcular");
        num_dos=leer.nextInt();
        if(num_uno>=26 && num_dos<=25){
           System.out.println("El primer numero digitado es mayor a 25"); 
        }else if(num_dos>=26 && num_uno<=25){
            System.out.println("El segundo numero digitado es mayor a 25");
        }else if(num_uno>=26 && num_dos>=26){
            System.out.println("Ambos numeros digitados son mayores a 25");
        }else{
            System.out.println("Ningun numero es mayor a 25");
        }
    }          
 }    