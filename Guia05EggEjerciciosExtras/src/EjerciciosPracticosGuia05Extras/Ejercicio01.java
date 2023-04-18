package EjerciciosPracticosGuia05Extras;
import java.util.Scanner;
public class Ejercicio01{
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        System.out.println("Digite el tamaño del vector");
        int vTamaño=leer.nextInt();
        llenarVector(vTamaño);
    }
    public static void llenarVector(int vTamaño){
        Scanner leer=new Scanner(System.in);
        int[] vector=new int[vTamaño];
        int suma=0;
        for(int i=0;i<vTamaño;i++){
            System.out.println("Digite el dato en la cardinalidad "+i);
            vector[i]=leer.nextInt();
            suma+=vector[i];
        }
        System.out.println("La suma de los elementos del vector fue: "+suma);
    }
}