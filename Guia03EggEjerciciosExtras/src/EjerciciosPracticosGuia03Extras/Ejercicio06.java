package EjerciciosPracticosGuia03Extras;
import java.util.Scanner;
public class Ejercicio06{
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        double altura,cant=0.0,cantT=0.0;
        int contador=0,contadorT=0;
        System.out.println("Ingrese la altura pulse 0 para calcular los promedios");
        while (true){
            altura=leer.nextDouble();
            if(altura>0.3 && altura<=1.6){
                contador++;
                cant+=altura;
            }else if(altura>1.6 && altura<2.5){
                contadorT++;
                cantT+=altura;
            }else if(altura==0){
                break;
            }else {
                System.out.println("Altura invalida");
            }
        }
        System.out.println("Los RESULTADOS SON: menores a 1.6 metros "+contador+" personas "+(cant/contador)+" de promedio");
        System.out.println("El RESULTADO TOTAL FUE "+(contador+contadorT)+" personas "+(cant+cantT)/(contador+contadorT)+" de promedio");
    } 
}
