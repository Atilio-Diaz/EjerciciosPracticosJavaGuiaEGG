package EjerciciosPracticosGuia05Extras;
import java.util.Scanner;
public class Ejercicio07{
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        System.out.println("Digite el largo del vector");
        int vTamaño=leer.nextInt();
        int[] vector=new int[vTamaño];
        llenarVector(vector,vTamaño);
        mostrarVector(vector,vTamaño);
    }
    public static void llenarVector(int[] vector,int vTamaño){
        int aux1=0,aux2=1,aux3=0;
        for(int i=0;i<vTamaño;i++){
            vector[i]=aux1;
            aux3=(aux1+aux2);
            aux1=aux2;
            aux2=aux3;
        }
    }
    public static void mostrarVector(int[] vector,int vTamaño){
        System.out.println("El codigo Fibonacci");
        for(int i=0;i<vTamaño;i++){
            if(i<vTamaño-1){
                System.out.print(vector[i]+",");
            }else{
                System.out.print(vector[i]);
            }
        }
    }
}