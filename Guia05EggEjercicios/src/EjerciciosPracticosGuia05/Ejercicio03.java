package EjerciciosPracticosGuia05;
import java.util.Scanner;
public class Ejercicio03{
    public static void main(String[]args){
       Scanner leer=new Scanner(System.in);
       System.out.println("Establesca el largo de el vector");
       int largo=leer.nextInt();
       int[] vector=new int[largo];
       llenarVector(vector,largo);
       mostrarResultados(vector,largo);
    }
    public static void llenarVector(int[] vector,int largo){
        for(int i=0;i<largo;i++){
            vector[i]=(int)(Math.random()*99999);
        }
    }
    public static void mostrarResultados(int[] vector,int largo){
        int con1=0,con2=0,con3=0,con4=0,con5=0;
        for(int i=0;i<largo;i++){
            int contador=0;
            while(vector[i]!=0){
                vector[i]=(int)Math.round(vector[i]/10);
                contador++;
            }
            switch(contador){
                case 1:
                    con1++;
                    break;
                case 2:
                    con2++;
                    break;
                case 3:
                    con3++;
                    break;
                case 4:
                    con4++;
                    break;
                case 5:
                    con5++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("Con 1 digito "+con1);
        System.out.println("Con 2 digitos "+con2);
        System.out.println("Con 3 digitos "+con3);
        System.out.println("Con 4 digitos "+con4);
        System.out.println("Con 5 digitos "+con5);
    }
}