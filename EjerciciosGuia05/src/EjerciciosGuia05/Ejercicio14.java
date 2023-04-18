package EjerciciosGuia05;
import java.util.Scanner;
public class Ejercicio14{
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de compañeros");
        int cantiComp=leer.nextInt();
        String[] Equipo=new String[cantiComp];
        System.out.println("A hora ingrese los nombres de los compañeros");
        for(int i=0;i<cantiComp;i++){
            System.out.println("Ingrese el nombre del compañero en la pocicion "+i);
            Equipo[i]=leer.next();
        }
        String aux="";
        for(String elemento:Equipo){
            aux=aux+"  "+elemento;
        }
        System.out.println("Todos los compañeros son");
        System.out.println(aux);
    }
}