
package EjerciciosPracticosGuia03Extras;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        int A=22,B=33,C=44,D=55,aux=0;
        System.out.println("Valores ORIGINALES: A="+A+" B="+B+" C="+C+" D="+D);
        aux=B;
        B=C;
        C=A;
        A=D;
        D=aux;
        System.out.println("Valores INTERCAMBIADOS: A="+A+" B="+B+" C="+C+" D="+D);
        System.out.println("aux "+aux);
    }  
}
