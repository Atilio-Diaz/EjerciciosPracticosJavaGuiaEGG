package EjerciciosTutoVideos;
import java.util.Scanner;
public class Condicionales{
    public static void main(String[] args){
      int opinion;
      Scanner leer=new Scanner(System.in);
      opinion=leer.nextInt();
        if (opinion>=1 && opinion<=5){
            switch (opinion){
                case 1:
                case 2:
                    System.out.println("Nos sentimos apenados de que no hayas disfrutado de la peli...");
                    break;
                case 3:
                    System.out.println("Has calificado la peli como buena");
                    break;
                case 4:
                    System.out.println("Has calificado la peli como muy buena");
                    break;
                case 5:
                    System.out.println("Fantastico que hayas difrutado de gran entretenimiento");
                    break;
            }
        }else if(opinion<0){
            System.out.println("¿Una opinion negativa? ¿Taaaan mala fue la pelicua?");
        }else if (opinion==0){
            System.out.println("El valor "+opinion+" no es valido y no se tomara en cuenta");
        }else{
            System.out.println("!Wow se te fue la mano con la calificacion :D");
        }
        System.out.println("Hasta la proxima");
    }  
}