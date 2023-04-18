package EjerciciosPracticosGuia05Extras;
import java.util.Scanner;
public class Ejercicio03{
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        System.out.println("Digite el tamaño del vector");
        int vTamaño=leer.nextInt();
        int[] vector=new int[vTamaño];
        llenarVector(vector,vTamaño);
        imprimirVector(vector,vTamaño);
    }
    public static int[] llenarVector(int vector[],int vTamaño){
        for(int i=0;i<vTamaño;i++){
            vector[i]=(int)(Math.random()*100);
        }
    return vector;
    }
    public static void imprimirVector(int vector[],int vTamaño){
        for(int i=0;i<vTamaño;i++){
            System.out.print(vector[i]+" ");
        }
        System.out.println("");
    }
}