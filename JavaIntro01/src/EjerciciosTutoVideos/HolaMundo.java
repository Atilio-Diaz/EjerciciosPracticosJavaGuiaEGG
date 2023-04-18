package EjerciciosTutoVideos;

import java.util.Scanner;
public class HolaMundo {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in); // SE CREA UNA VARIABLE Scanner QUE SE UTILIZA PARA LEER DATOS DEL USUARIO
        String nombre; // SE CREA UNA VARIABLE CADENA (String) QUE SE UTILIZA PARA LEER DATOS DE USUARIO
        System.out.println("Infresa tu nombre"); //MUESTRA UN MENSAJE POR PANTALLA
        nombre=leer.next(); //LEEMOS EL NOMBRE DE LA PERSONA EN LA VARIABLE NOMBRE
        System.out.println("Hola Mundo! Soy "+nombre+" y estoy programando en java");
    }
    
}
