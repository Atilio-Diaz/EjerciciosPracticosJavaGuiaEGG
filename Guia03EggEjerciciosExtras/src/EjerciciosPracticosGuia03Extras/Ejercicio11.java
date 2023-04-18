package EjerciciosPracticosGuia03Extras;
import java.util.Scanner;
public class Ejercicio11{
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        int num,contador=0;
        System.out.println("Digite un numero para analizar");
        num=leer.nextInt();
        while (num!=0){
           num=Math.round(num/10);
           contador++;
        }
        System.out.println("El numero tiene "+contador+" Digitos");
    }
}