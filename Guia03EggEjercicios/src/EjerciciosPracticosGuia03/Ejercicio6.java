package EjerciciosPracticosGuia03;
import java.util.Scanner;
public class Ejercicio6{
    public static void main(String[] args) {
        int num1,num2,opcion;
        String respuesta;
        boolean logic=true;
        Scanner leer=new Scanner(System.in);
        do{
            System.out.println("Digite un numero entero positivo");
            num1=leer.nextInt();
            System.out.println("Digite otro numero entero positivo");
            num2=leer.nextInt();
            if (num1>0 && num2>0){ 
                while (logic){  
                    System.out.println("MENU");
                    System.out.println("****");
                    System.out.println("1-SUMAR");
                    System.out.println("2-RESTAR");
                    System.out.println("3-MULTIPLICAR");
                    System.out.println("4-DIVIDIR");
                    System.out.println("5-SALIR");
                    opcion=leer.nextInt();
                    switch(opcion){
                        case 1:
                            System.out.println("La suma de: "+num1+" + "+num2+"="+(num1+num2));
                            break;
                        case 2:
                            System.out.println("La resta de: "+num1+" - "+num2+"="+(num1-num2));
                            break;
                        case 3:
                            System.out.println("La multiplicacion de: "+num1+" * "+num2+"="+(num1*num2));
                            break;
                        case 4:
                            System.out.println("La divicion de: "+num1+" / "+num2+"="+(num1/num2));
                            break;
                        case 5:
                            System.out.println("¿Estas seguro de salir S/N?");
                            respuesta=leer.next(); 
                            if (respuesta.equalsIgnoreCase("s")) {
                                logic=false;
                            }else
                            break;
                        default:
                            System.out.println("Opcion incorrecta");
                            break;                      
                    }
                }
            }
        } while (num1<0 || num2<0);
    }   
}