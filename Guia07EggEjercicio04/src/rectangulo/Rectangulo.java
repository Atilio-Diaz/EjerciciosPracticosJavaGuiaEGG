package rectangulo;

import java.util.Scanner;

public class Rectangulo {

    private int base, altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public Rectangulo CrearRectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese ancho de la base");
        base = leer.nextInt();
        System.out.println("Ingrese la altura");
        altura = leer.nextInt();
        return new Rectangulo(base, altura);
    }

    public void SuperficieRectangulo() {
        System.out.println("La superficie del rectangulo es: "+base*altura);
    }
    public void PerimetroRectangulo() {
        System.out.println("El perimetro es: "+(base+altura)*2);
    }
    public void MostrarRectangulo(){
        System.out.println("El dibujo del rectangulo:");
        for(int i=0;i<altura;i++){
            for(int j=0;j<base;j++){
                if(i>0 && i<altura-1 && j>0 && j<base-1){
                    System.out.print("  ");
                }else{
                    System.out.print(" *");
                }
            }
            System.out.println("");
        }
    }
}
