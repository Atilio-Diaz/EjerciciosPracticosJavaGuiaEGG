package EjerciciosPracticosGuia03;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        int numMax,numIn=0,suma=0;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un valor que sera un limite para la operacion");
        numMax=leer.nextInt();
        while(suma<numMax){
            System.out.println("Ingrese valores para sumar");
            numIn=leer.nextInt();
            suma+=numIn;
            System.out.println("la suma es: "+suma);
        }
        System.out.println("Se alcanzo al limite establesido");
        System.out.println("Elvalor limite fue: "+numMax);
    }
}
