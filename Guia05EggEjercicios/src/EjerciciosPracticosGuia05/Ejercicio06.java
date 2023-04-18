package EjerciciosPracticosGuia05;
import java.util.Scanner;
public class Ejercicio06{
    public static void main(String[]args){
        System.out.println("ANALIZADOR DE MATRIZ MAGICA");
        int mTamaño=3;
        llenarMatriz(mTamaño);
        
    }
    public static void llenarMatriz(int mTamaño){
        int[][] matriz=new int[mTamaño][mTamaño];
        int datoIn=0;
        for(int i=0;i<mTamaño;i++){
            for(int j=0;j<mTamaño;j++){
                System.out.println("DIgite el dato en matriz cardinalidad "+i+" "+j);
                matriz[i][j]=comprobarDato(datoIn);
            }
        }
        analizarMatriz(matriz,mTamaño);
    }
    public static int comprobarDato(int datoIn){
        Scanner leer=new Scanner(System.in);
        boolean logic=true;
        int aux;
        while(logic){
            aux=leer.nextInt();
            if (aux>0&&aux<10) {
                datoIn=aux;
                logic=false;
            }else{
                System.out.println("Solo de 1 a 9");
               logic=true; 
            }
        }
        return datoIn;
    }
    public static void analizarMatriz(int[][] matriz,int mTamaño){
        int sumaFila=0,sumaColumna=0,suma=0,diagonal1=0,diagonal2=0;
        for(int i=0;i<mTamaño;i++){
            for(int j=0;j<mTamaño;j++){
               System.out.print(matriz[i][j]+" ");
               sumaFila+=matriz[i][j];
               sumaColumna+=matriz[j][i];
                if(i==j){
                    diagonal1+=matriz[i][j];
                }
                if(i+j==mTamaño-1){
                    diagonal2+=matriz[i][j];
                }
            }
            if (sumaFila==sumaColumna) {
                    suma+=sumaFila+sumaColumna;
                }
            System.out.println("");
            sumaFila=0;
            sumaColumna=0;
        }
        if (diagonal1==diagonal2 && suma/(mTamaño*2)==diagonal1) {
            System.out.println("LA MATRIZ ES MAGICA");
        }else{
            System.out.println("LA MATRIZ NO ES MAGICA");
        }
    }
}