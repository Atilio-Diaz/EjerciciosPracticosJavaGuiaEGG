package EjerciciosPracticosGuia03Extras;
import java.util.Scanner;
public class Ejercicio05{
    public static void main(String[] args){
        String socio;
        float costo;
        Scanner leer=new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("ELIJA SU TIPO DE SOCIO");
        System.out.println("A-Alta categoria");
        System.out.println("B-Media categoria");
        System.out.println("C-Baja caategoria");
        socio=leer.nextLine();
        switch (socio){
            case "A":
            case "a":  
                System.out.println("Ingrese el costo del tratamiento");
                costo=leer.nextFloat();
                System.out.println("El costo del tratamiento con los descuentos es: "+costo/100*50+" $");
                break;
            case "B":
            case "b":  
                System.out.println("Ingrese el costo del tratamiento");
                costo=leer.nextFloat();
                System.out.println("El costo del tratamiento con los descuentos es: "+costo/100*65+" $");
                break; 
            case "C":
            case "c":  
                System.out.println("Ingrese el costo del tratamiento");
                costo=leer.nextFloat();
                System.out.println("Los socios de tipo C no reciven descuentos: "+costo+" $");
                break;    
            default:
                System.out.println("OPCION INCORRECTA EPERE A UNA ACTUALIZACION");
        }
    }
}