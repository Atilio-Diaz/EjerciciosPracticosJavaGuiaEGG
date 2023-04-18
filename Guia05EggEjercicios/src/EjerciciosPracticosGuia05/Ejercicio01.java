package EjerciciosPracticosGuia05;
public class Ejercicio01{
    public static void main(String[]args){
        System.out.println("Generador de numeros decendentes");
        int[] vector=new int[101];
        llenarVector(vector);
        System.out.println(mostrarVector(vector));
    }
    public static void llenarVector(int[] vector){
        for(int i=0;i<101;i++){
            vector[i]=i;
        }
    }
    public static int[] mostrarVector(int[] vector){
        for (int i=100;i>=0;i--){
            System.out.println(vector[i]); 
        }
        return vector;
    }
}