package circunferencia;
import java.util.Scanner;
public class Circunferencia{
   private float radio;
   public Circunferencia(){
   }
   public Circunferencia(float radio){
       this.radio=radio;
   }
   public void setRadio(float radio){
        this.radio=radio;
    }
   public float getRadio(){
        return radio;
    }
    Scanner leer=new Scanner(System.in);
    public Circunferencia crearRadio(){
        System.out.println("Introducir el radio");
        radio=leer.nextFloat();
        return new Circunferencia(radio);
    }
   public void Area(){
       getRadio();
       System.out.print("El area es: "+Math.PI*(Math.pow(radio,2)));
       System.out.println("");
   }
   public void Perimetro(){
       getRadio();
       System.out.print("El Perimetro es: "+2*Math.PI*radio);
       System.out.println("");
   }

    @Override
    public String toString(){
        return "Circunferencia{" + "radio=" + radio + '}';
    }
}