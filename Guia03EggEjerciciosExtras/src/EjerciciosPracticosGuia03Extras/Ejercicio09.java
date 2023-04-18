package EjerciciosPracticosGuia03Extras;
import java.util.Scanner;
public class Ejercicio09{
    public static void main(String[]args){
        int num1,num2,resta,cont=1;
        boolean logic=true;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese 2 numeros enteros para la division con restas");
        num1=leer.nextInt();
        num2=leer.nextInt();
        resta=num1-num2;
        while (logic){
            if(num2<=resta){
               resta=resta-num2;
               cont++;
            }else if(resta<=num2){
                logic=false;
            }
        }
        System.out.println("resultado el residuo es: "+resta+" el cociente es: "+cont);
    }
}
