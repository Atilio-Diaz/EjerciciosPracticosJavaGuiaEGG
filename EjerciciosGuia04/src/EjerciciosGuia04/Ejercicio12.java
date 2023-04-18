package EjerciciosGuia04;
import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int num1,num2;
        System.out.println("Digite numeros para analizar");
        num1=leer.nextInt();
        num2=leer.nextInt();
        esMultiplo(num1,num2);
    }  
    public static void esMultiplo(int num1,int num2){
        if (num1%num2==0) {
            System.out.println("El numero: "+num2+" es multiplo de: "+num1);
        }else{
            System.out.println("El numero: "+num2+" NO es multiplo de: "+num1);
        }
    }
}