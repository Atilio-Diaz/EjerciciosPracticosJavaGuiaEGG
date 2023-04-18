package EjerciciosPracticosGuia03Extras;
import java.util.Scanner;
public class Ejercicio12{
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        String letra;
        System.out.println("contador de 3 digitos");
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                for (int k=0;k<10;k++){
                    if (i!=3&&j!=3&&k==3) {
                        System.out.println(i+"-"+j+"-E");
                    }else if(i!=3&&j==3&&k!=3){
                        System.out.println(i+"-E-"+k);
                    }else if(i==3&&j!=3&&k!=3){
                        System.out.println("E-"+j+"-"+k);
                    }else if(i==3&&j==3&&k==3){
                        System.out.println("E-E-E");
                    }else if(i!=3&&j==3&&k==3){
                        System.out.println(i+"-E-E");
                    }else if(i==3&&j!=3&&k==3){
                        System.out.println("E-"+j+"-E");
                    }else if(i==3&&j==3&&k!=3){
                        System.out.println("E-E-"+k);
                    }else{
                        System.out.println(i+"-"+j+"-"+k);
                    }
                }
            }
        }
    }
}