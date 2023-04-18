package EjerciciosPracticosGuia03Extras;
import java.util.Scanner;
public class Ejercicio14{
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        int familias,hijos,edades,totalH=0,edadesT=0;
        System.out.println("Digite la cantidad de familias que desea calcular");
        familias=leer.nextInt();
        for(int i=1;i<familias+1;i++){
            System.out.println("Cuantos hijos tiene la familia "+i);
            hijos=leer.nextInt();
            totalH+=hijos;
            for(int j=1;j<hijos+1;j++){
                System.out.println("Cual es la edad de el hijo "+j+" de la familia "+i);
                edades=leer.nextInt();
                edadesT+=edades;
            }
        }
        System.out.println("La edad media de los hijos de las familias es: "+edadesT/totalH);
    }
}