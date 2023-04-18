package EjerciciosPracticosGuia03Extras;
import java.util.Scanner;
public class Ejercicio08{
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        int num,contP=0,contI=0;
        boolean logic=true;
        System.out.println("Digite numeros enteros si multiplo de 5 termina y calcula");
        while (logic){
            num=leer.nextInt();
            if (num>=0){
                if (num%2==0) {
                    contP++;
                }else if(num%5==0){
                    logic=false;
                }else{
                    contI++;
                }
            }
        }
        System.out.println("se encontro un multiplo de 5 los numeros pares fueron: "+contP+" Los Inpares fueron: "+contI);
    }
}
