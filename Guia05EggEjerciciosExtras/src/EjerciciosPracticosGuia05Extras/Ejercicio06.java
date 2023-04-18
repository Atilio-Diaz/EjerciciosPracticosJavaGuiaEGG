package EjerciciosPracticosGuia05Extras;
import java.util.Scanner;
public class Ejercicio06{
    public static void main(String[]args){
        String[] vector=new String[5];
        String[][] matriz=new String[20][20];
        vector=llenarVector();
        matriz=llenarMatriz(vector);
        mostrarVector(vector);
        mostrarMatriz(matriz);
    }
    public static String[] llenarVector(){
        Scanner leer=new Scanner(System.in);
        String vector[]=new String[5];
        for(int i=0;i<5;i++){
            do {
                System.out.print("Ingrese nombre de entre 3 a 5 caracteres: ");
                vector[i] = leer.nextLine();
            } while(vector[i].length()<3 || vector[i].length()>5);
        }
        System.out.println("");
        return vector;
    }
    public static void mostrarVector(String[] vector){
        for(int i=0;i<5;i++){
            System.out.print("\t ("+vector[i]+")");
        }
        System.out.println("");
    }
    public static String[][] llenarMatriz(String[] vector){
        String matriz[][]=new String[20][20];
        int f,c,l=0;
        for(int i=0;i<20;i++){
            for(int j=0;j<20;j++){
                matriz[i][j]="-";
            }
        }
        System.out.println("\t CARDINALIDADES");
        System.out.println("\t FILAS de 0 a 20 COLUMNAS de 0 a 20");
        for(int k=0;k<5;k++){
            f=(int)(Math.random()*20);
            c=(int)(Math.random()*15);
            System.out.print("\t fila: "+f);
            System.out.print("\t columna: "+c);
            System.out.println("");
            for(int i=0;i<20;i++){
                for(int j=0;j<20;j++){
                    if(i==f && j==c){
                        while(l<vector[k].length()){
                            matriz[i][j+l]=vector[k].substring(l,l+1);
                            l++;
                        }
                       j=c+l;
                    }
                    if(matriz[i][j].equals("-")){
                         matriz[i][j]=Integer.toString((int)(Math.random()*10));
                    } 
                }
                l=0;
            }
        }
        return matriz;
    }
    public static void mostrarMatriz(String[][] matriz){
        System.out.println("");
        for(int i=0;i<20;i++){
            for(int j=0;j<20;j++){
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println("");
        }  
    }
}