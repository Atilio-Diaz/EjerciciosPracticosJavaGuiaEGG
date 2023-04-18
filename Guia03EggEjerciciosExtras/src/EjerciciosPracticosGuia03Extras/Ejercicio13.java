package EjerciciosPracticosGuia03Extras;
import java.util.Scanner;
public class Ejercicio13{
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        System.out.println("ELija la cantidad de numer para mostrar la escalera");
        int num=leer.nextInt();
        for(int i=1;i<num+1;i++){
            for(int j=1;j<i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }       
}