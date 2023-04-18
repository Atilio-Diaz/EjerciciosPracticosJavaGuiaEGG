package EjerciciosPracticosGuia04;
import java.util.Scanner;
public class Ejercicio02{
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        boolean logic=true;
        int edad=0;
        String nombre="",respuesta;
        System.out.println("Recopilador de datos de personas");
        do{
            System.out.println("¿Recopilar datos?");
            respuesta=leer.nextLine();
            if(respuesta.equalsIgnoreCase("no")){
                logic=false;
            }else if(respuesta.equalsIgnoreCase("si")){
            datos(nombre,edad);
            }else{
                System.out.println("si/no");
            }
        }while(logic);
    }
    public static void datos(String nombre,int edad){
        Scanner leer=new Scanner(System.in);
        System.out.println("Escriba el nombre");
        nombre=leer.nextLine();
        System.out.println("Digite la edad");
        edad=leer.nextInt();
        if(edad<=17){
            System.out.println(nombre+" es menor de edad");
            System.out.println("**************");
        }else{
            System.out.println(nombre+" esc mayor de edad");
            System.out.println("**************");
        }
    }      
}