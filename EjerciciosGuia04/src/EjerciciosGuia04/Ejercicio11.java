package EjerciciosGuia04;
import java.util.Scanner;
public class Ejercicio11{
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase par codificarla");
        frase=leer.nextLine();
        System.out.println(codificador(frase));
    } 
    public static String codificador(String frase){
        String vocal,fraseMod; 
        fraseMod="";
        for(int i=0;i<frase.length();i++){
            vocal=frase.substring(i,i+1).toLowerCase();
            switch (vocal){
                case "a":
                    fraseMod=fraseMod.concat("@");
                    break;
                case "e":  
                    fraseMod=fraseMod.concat("#");
                    break;
                case "i":  
                    fraseMod=fraseMod.concat("$");
                    break;
                case "o":   
                    fraseMod=fraseMod.concat("%");
                    break;
                case "u":   
                    fraseMod=fraseMod.concat("*");
                    break;    
                default:
                    fraseMod=fraseMod.concat(vocal);
            }
        }
        return fraseMod;
    }
}