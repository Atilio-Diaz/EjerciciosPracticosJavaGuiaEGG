package EjerciciosPracticosGuia05;
public class Ejercicio04{
    public static void main(String[]args){
        System.out.println("Matriz transpuesta");
        int[][] matriz=new int[4][4];
        llenarImprimirMatriz(matriz);
        matrizTranspuesta(matriz);
        
    }
    public static void llenarImprimirMatriz(int[][] matriz){
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                matriz[i][j]=(int)(Math.random()*10);
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("*******");
    }
    public static void matrizTranspuesta(int[][] matriz){
        int[][] transpuesta=new int[4][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                transpuesta[j][i]=matriz[i][j];
                
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(transpuesta[i][j]+" ");
            }
            System.out.println("");
        }
    }
}