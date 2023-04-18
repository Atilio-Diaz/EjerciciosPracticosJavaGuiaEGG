package EjerciciosPracticosGuia03Extras;
import java.util.Scanner;
public class Ejercicio01 {
    public static void main(String[] args) {
        int tiempo;
        Scanner leer=new Scanner(System.in);
        System.out.println("Digite una cantidad de minutos para calcular");
        tiempo=leer.nextInt();
        System.out.println("la cantidad de dias y horas equivalentes son: "+Math.round(tiempo/60/24)+" dia y "+((tiempo/60)-(24*Math.round(tiempo/60/24)))+" horas");
    } 
}
