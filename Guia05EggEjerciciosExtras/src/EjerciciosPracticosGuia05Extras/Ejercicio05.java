package EjerciciosPracticosGuia05Extras;
import java.util.Scanner;
public class Ejercicio05{
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        int filas,columnas,suma=0;
        System.out.println("Dijite el tamaño de las filas de la matriz");
        filas=leer.nextInt();
        System.out.println("Dijite el tamaño de las columnas de la matriz");
        columnas=leer.nextInt();
        int[][] matriz=new int[filas][columnas];
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                matriz[i][j]=(int)(Math.random()*10);
                System.out.print(matriz[i][j]+" ");
                suma+=matriz[i][j];
            }
            System.out.println("");
        }
        System.out.println("La suma de los elementos de la matriz es: "+suma);
    }
}