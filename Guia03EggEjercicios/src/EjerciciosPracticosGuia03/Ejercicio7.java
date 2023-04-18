package EjerciciosPracticosGuia03;
import java.util.Scanner;
public class Ejercicio7{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        String  cadena;
        int contadorIncorrectas=0;
        int contadorCorrectas=0;
        do {
            System.out.println("Ingresar codigo:");
            cadena = teclado.next();
            if (cadena.length() <=5 && cadena.substring(0,1).equalsIgnoreCase("x") && cadena.substring(4).equalsIgnoreCase("o")) {
                contadorCorrectas ++;
            }else{
                contadorIncorrectas ++;
            }
        } while (!cadena.equals("&&&&&"));
        System.out.println("Los codigos correctos son:" + contadorCorrectas);
        contadorIncorrectas=contadorIncorrectas-1;
         System.out.println("Los codigos incorrectos son:" + contadorIncorrectas );
    }   
} 