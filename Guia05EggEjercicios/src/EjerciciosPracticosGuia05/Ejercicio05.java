package EjerciciosPracticosGuia05;
import java.util.Scanner;
public class Ejercicio05{
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        System.out.println("Digite el numeros de filas");
        int filas=leer.nextInt();
        System.out.println("Digite el numero de columnas");
        int columnas=leer.nextInt();
        int[][] matriz=new int[filas][columnas];
        llenarMostrarMatriz(matriz,filas,columnas);
        compararMostrarMatrises(matriz,filas,columnas);
    }
    public static void llenarMostrarMatriz(int[][] matriz,int filas, int columnas){
        Scanner leer=new Scanner(System.in);
    for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.println("Digite el valor de matriz en la cardinalidad: "+i+" "+j);
                matriz[i][j]=leer.nextInt();
            }
        }
    }
    public static void compararMostrarMatrises(int[][] matriz,int filas,int columnas){
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("*****");
        for(int i=0;i<columnas;i++){
            for(int j=0;j<filas;j++){
                System.out.print(matriz[j][i]+" ");
            }
            System.out.println("");
        }
        analizarMatrices(matriz,filas,columnas);
    }
    public static void analizarMatrices(int[][] matriz,int filas,int columnas){
        int contador=0;
        if(filas==columnas){
            for(int i=0;i<filas;i++){
                for(int j=0;j<columnas;j++){
                    if (matriz[i][j]==-matriz[j][i]) {
                        contador++;
                    }
 
                }
            }
            if (contador==(filas*columnas)) {
                System.out.println("La matriz es ANTISIMETRICA");
            }else{
                System.out.println("La matriz NO es ANTISIMETRICA");
            }
        }else{
            System.out.println("La matriz no es SIMETRICA y menos ANTISIMETRICA");
        }
    }
}
