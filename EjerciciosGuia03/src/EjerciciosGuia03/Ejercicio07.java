package EjerciciosGuia03;
import java.util.Scanner;
public class Ejercicio07 {
    public static void main(String[] args) {
        int tipoMotor;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el tipo de motor");
        System.out.println("************************");
        System.out.println("1-bombeo de productos alimenticio");
        System.out.println("2-bombeo de agua");
        System.out.println("3-bombeo de combustible");
        System.out.println("4-bombeo de hormigon");
        tipoMotor=leer.nextInt();
        switch(tipoMotor){
            case 1:
            System.out.println("EL tipo de bomba debe ser estirilizada presurisacion baja");
            break;
            case 2:
            System.out.println("EL tipo de bomba debe ser estirilizada presurisacion media");  
            break;
            case 3:
            System.out.println("EL tipo de bomba debe ser de polimeros anti cortos presurisacion media");    
            break;
            case 4:
            System.out.println("EL tipo de bomba debe ser de reforzada presurisacion muy alta");
            break;
            default:
            System.out.println("Tipo de motor ingresado no se encuentra espera a una actualizacion");
        }
    }    
}
