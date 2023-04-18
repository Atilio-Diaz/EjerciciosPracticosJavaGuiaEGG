package EjerciciosPracticosGuia03Extras;
import java.util.Scanner;
public class Ejercicio04{
    public static void main(String[] args){
        int num,cont=0;
        Scanner leer=new Scanner(System.in);
        System.out.println("Digite un numero de 1 al 10 pra cambiarlo a ROMANO");
        num=leer.nextInt();
        if (num>=1 && num<=3){
            System.out.print("En numero ROMANO es: ");
            while (cont<num) {
                System.out.print("I");
                cont++;
            }
            System.out.println("");
        }else if(num==4){
            System.out.println("En numero ROMANO es: IV");
        }else if(num==5){
            System.out.println("En numero ROMANO es: V");
        }else if(num==6){
            System.out.println("En numero ROMANO es: VI");
        }else if(num==7){
            System.out.println("En numero ROMANO es: VII");
        }else if(num==8){
            System.out.println("En numero ROMANO es: VIII");
        }else if(num==9){
            System.out.println("En numero ROMANO es: IX");
        }else if(num==10){
            System.out.println("En numero ROMANO es: X");
        }
    } 
}