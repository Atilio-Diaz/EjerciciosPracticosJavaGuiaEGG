package EjerciciosGuia05;
import java.util.Scanner;
public class Ejercicio13{
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de compañeros");
        int x=0,cantiComp=leer.nextInt();
        String[] Equipo=new String[cantiComp];
        System.out.println("A hora ingrese los nombres de los compañeros");
        while (cantiComp!=0) {
            System.out.println("en la pocicion "+x);
            Equipo[x]=leer.next();
            x++;
            cantiComp--;        
        }
        cantiComp=x;
        x=0;
        System.out.println("Todos los nombres del equipor son");
        while (cantiComp!=0) {
            System.out.print(Equipo[x]);
            System.out.print(" ");
            x++;
            cantiComp--; 
        }
    }
}