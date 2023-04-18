
package rectangulo;

public class Rectangulo {
    public int lado1,lado2;

    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    public void calcular_area(){
        int area=lado1*lado2;
        System.out.println("El area del rectangulo es: "+area);
    }
}
