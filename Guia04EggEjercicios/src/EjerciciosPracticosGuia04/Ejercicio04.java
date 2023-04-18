package EjerciciosPracticosGuia04;
import java.util.Scanner;
public class Ejercicio04{
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        int num;
        boolean conf=false;
        System.out.println("Digite un numero entero para identificar si es primo");
        num=leer.nextInt();
        identificar(num,conf);
    }
    public static void identificar(int num,boolean conf){
        int contador=0;
        for(int i=1;i<num+1;i++){
            if (num%i==0){
                contador++;
            }
        }
        if(contador==2){
            conf=true;
            System.out.println("¿El numero es primo?: "+conf);
        }else{
            conf=false;
            System.out.println("¿El numero es primo?: "+conf);
        }
    }
}