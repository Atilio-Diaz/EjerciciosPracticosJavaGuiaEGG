package EjerciciosPracticosGuia04;
import java.util.Scanner;
public class Ejercicio01{

    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        int num1,num2,opcion;
        boolean logic=true;
        System.out.println("Digite dos numeros para calcular");
        num1=leer.nextInt();
        num2=leer.nextInt();
        while(logic){
            System.out.println("****************************");
            System.out.println("MENU elija el operador de calculo");
            System.out.println("1-para SUMAR");
            System.out.println("2-para RESTAR");
            System.out.println("3-para MULTIPLICAR");
            System.out.println("4-para DIVIDIR");
            System.out.println("5-para SALIR");
            System.out.println("****************************");
            opcion=leer.nextInt();
            switch(opcion){
            case 1:
                suma(num1,num2);
                break;
            case 2:
                resta(num1,num2);
                break;
            case 3:
                multi(num1,num2);
                break;
            case 4:
                divi(num1,num2);
                break;
            case 5:
                System.out.println("CERRANDO PROGRAMA");
                logic=false;
                break;    
            default:
                System.out.println("Opcion incorrecta elije denuevo");
            }
        }
    }
    public static void suma(int num1,int num2){
        System.out.println("La suma de: "+num1+" + "+num2+" es "+(num1+num2));
    }
    public static void resta(int num1,int num2){
        System.out.println("La resta de: "+num1+" - "+num2+" es "+(num1-num2));
    }
    public static void multi(int num1,int num2){
        System.out.println("La multiplicacion de: "+num1+" * "+num2+" es "+(num1*num2));
    }
    public static void divi(int num1,int num2){
        System.out.println("La divicion de: "+num1+" / "+num2+" es "+(num1/num2));
    }
}