package EjerciciosPracticosGuia03Extras;
import java.util.Scanner;
public class Ejercicio03{
    public static void main(String[]args){
        String letra;
        Scanner leer=new Scanner(System.in);
        System.out.println("Escriba una letra para analizar");
        letra=leer.nextLine();
        boolean A=letra.equalsIgnoreCase("a"),E=letra.equalsIgnoreCase("e");
        boolean I=letra.equalsIgnoreCase("i"),O=letra.equalsIgnoreCase("O");
        boolean U=letra.equalsIgnoreCase("u");
        if (A||E||I||O||U){
            System.out.println("Vocal encontrada");
        }else{
            System.out.println("No es una Vocal");
        }
    } 
}