package EjerciciosPracticosGuia03Extras;
import java.util.Scanner;
public class Ejercicio07{
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        float cont=0,num,compMayor=0,compMenor=0;
        int vIni,t=0;
        System.out.println("Primero digite la cantidad de numeros");
        vIni=leer.nextInt();
        System.out.println("Con bucle WHILE Digite numeros al azar para calcular el menor y el myor y el promedio");
        while(vIni!=t){
            num=leer.nextFloat();
            cont+=num;
            if (t==0){ 
                compMenor=num;
                compMayor=num;
            }else if (num<compMenor) {
                compMenor=num;
            }
            if(num>compMayor){
            compMayor=num;
            }
            t++;
        }
        System.out.println("El numero maximo ingresado fue: "+compMayor+" el menor fue: "+compMenor+" el promedio fue: "+(cont/vIni));
        System.out.println("Con bucle DO WHILE Digite numeros al azar para calcular el menor y el myor y el promedio");
        cont=0;
        t=0;
        compMayor=0;
        compMenor=0;
        do {
            num=leer.nextFloat();
            cont+=num;
            if (t==0){ 
                compMenor=num;
                compMayor=num;
            }else if (num<compMenor) {
                compMenor=num;
            }
            if(num>compMayor){
            compMayor=num;
            }
            t++;
        } while (vIni!=t);
        System.out.println("El numero maximo ingresado fue: "+compMayor+" el menor fue: "+compMenor+" el promedio fue: "+(cont/vIni));
    }
}