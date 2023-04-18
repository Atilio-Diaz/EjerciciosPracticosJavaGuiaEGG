package EjerciciosPracticosGuia05;
import java.util.Scanner;
public class Ejercicio02{
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        System.out.println("Digite el tamaño del vector");
        int largo=leer.nextInt();
        int[] vector=new int[largo];
        llenarVector(vector,largo);
        System.out.println("Ingrese un numero entero para buscar en el vector");
        int numero=leer.nextInt();
        buscarNumero(vector,numero,largo);
        
    }
    public static void llenarVector(int[] vector,int largo){
        for(int i=0;i<largo;i++){
            vector[i]=(int)(Math.random()*largo);
        }
    }
    public static void buscarNumero(int[] vector,int numero,int largo){
        int contador=0;
        for(int i=0;i<largo;i++){
            if(vector[i]==numero){
                contador++;
                System.out.println("se encontro el numero "+numero+" en la pocicion: "+i);
            }
        }
        if(contador==0){
                System.out.println("Del numero "+numero+" nino ninoticia");
            }
    }
}