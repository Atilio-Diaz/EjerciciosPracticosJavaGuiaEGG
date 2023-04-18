package EjerciciosPracticosGuia04;
import java.util.Scanner;
public class Ejercicio03{
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        float euros;
        String moneda;
        System.out.println("Indique la cantidad de euros a calcular");
        euros=leer.nextFloat();
        System.out.println("Que tipo de intercambio quiere dolares,yenes o libras");
        moneda=leer.next();
        cambio(euros,moneda);
    }  
    public static void cambio(float euros,String moneda){
        if (moneda.equalsIgnoreCase("dolares")) {
            System.out.println("la cantidad de: "+euros+"€ es: "+(euros/1.28611)+"$ "+moneda);
        }else if(moneda.equalsIgnoreCase("yenes")){
            System.out.println("la cantidad de: "+euros+"€ es: "+(euros/129.852)+" "+moneda);
        }else if(moneda.equalsIgnoreCase("libras")){
            System.out.println("la cantidad de: "+euros+"€ es: "+(euros/0.86)+" "+moneda);
        }else{
            System.out.println("MONEDA NO IDENTIFICADA solo dolares,yenes o libras");
        }
    } 
}