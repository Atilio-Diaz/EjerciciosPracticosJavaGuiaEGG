package EjerciciosPracticosGuia03Extras;
import java.util.Scanner;
public class Ejercicio10{
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        int num=0,num1,num2,resultado;
        num1=(int)(Math.random()*10);
        num2=(int)(Math.random()*10);
        resultado=num1*num2;
        System.out.println("Intenta encontrar el resultado de la multiplicacion"
                + "ente 0 y 100");
        while (num!=resultado){
            num=leer.nextInt();
            if (num==8080){
                System.out.println("Que miras "+num+" resultado= "+resultado);
            }else if(num==resultado){
                System.out.println("ACERTASTE");
            }
        }
    }
}