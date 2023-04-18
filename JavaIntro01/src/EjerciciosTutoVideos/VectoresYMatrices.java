/* Realizar la multipicacion de un vector por una matriz
        Dado un vector 1xN * una matriz de 2x3 = producto 1x3
        v=[3,5]*m=[4,8,6] = [3*4+5*2,3*8+5*1,3*6+5*7] = [22,29,53]
                  [2,1,7]     
        */
package EjerciciosTutoVideos;
import java.util.Scanner;
public class VectoresYMatrices{
    public static void main(String[]args){
        //Desclaracion y creacion de un vector
        //tipo[] nombreVector = new tipo[Tamaño];
        //declarar un arreglo de una dimension
        int[] vector;
        //crear enmemoria (contruir/dimensionar)con el valor por defecto(cero para los enteros)
        vector=new int[2];
        //los dos pasos en una linea
        int[] producto=new int[3];
        
        
        //Declaracion y creacion de una matriz
        //tipo[][] nombreMatriz=new tipo[Filas][Columnas]
        //declaracion einicializacion con valores predeterminados
        int[][] matriz={{4,8,6},{2,1,7}};
        
        //Declaracion y creacion de arreglos genericos
        //tipo[][]...[] nombreArreglo=new tipo[cardinalidad 1][cardinalidad 2]...[cardinalidad N];
        System.out.println("Ingrese los calores del vector de tamaño"+vector.length+":");
        Scanner leer=new Scanner(System.in);
        //int=0, porque los subindices de los arreglos en java inician en cero
        for(int i=0;i<vector.length;i++){
            System.out.println("v["+i+"]=");
            //acceder al valor i del vector
            vector[i]=leer.nextInt();
        }
        //multiplica vector por matriz
        int sum;
        //...para cada columna de la matriz...
        for(int i=0;i<matriz[0].length;i++){
            sum=0;
            //...recorro el vector y multiplico
            for(int j=0;j<vector.length;j++){
                sum+=vector[i]*matriz[i][j];
            }
            producto[i]=sum;
        }
        String aux="";
        //Mostrar vector
        System.out.println("* Vector:");
        //bucle for "mejorado" (enhanced)
        //for (tipo elemento : arreglo)
        for(int elemento:vector){
            aux=aux+"  "+elemento;
        }
        System.out.println(aux);
        //Mostrar matriz
        System.out.println("/n* Matriz:");
        //para cada fila de la matriz
        for (int[]fila:matriz){
            aux="";
            //para cada elemento de la fila
            for (int elemento:fila) {
                aux+="  "+elemento;
            }
            System.out.println(aux);
        }
        //Mostrar resultado
        aux="";
        System.out.println("/n* Vector x Matriz:");
        for (int elemento:producto){
            aux+="  "+elemento;
        }
        System.out.println(aux);
    }
}
