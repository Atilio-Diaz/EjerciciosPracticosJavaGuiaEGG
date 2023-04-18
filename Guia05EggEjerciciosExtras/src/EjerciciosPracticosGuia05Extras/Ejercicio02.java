package EjerciciosPracticosGuia05Extras;
import java.util.Scanner;
public class Ejercicio02{
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        int vTamaño;
        System.out.println("Elija el tamaño de los vectores");
        vTamaño=leer.nextInt();
        System.out.println("Los vectores son iguales: "+compararVectores(vTamaño));
    }
    public static boolean compararVectores(int vTamaño){
        int[] vector1=new int[vTamaño];
        int[] vector2=new int[vTamaño];
        boolean resultado=true;
        for (int i=0;i<vTamaño;i++){
            vector1[i]=(int)(Math.random()*2);
            vector2[i]=(int)(Math.random()*2);
        }
        for (int i=0;i<vTamaño;i++){
            if (vector1[i]!=vector2[i]){
                System.out.println("Cardinalidad: "+i+" NO COINCIDEN");
                resultado=false;
                break;
            }
        }
    return resultado;
    }
}