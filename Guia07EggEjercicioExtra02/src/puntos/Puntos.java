
package puntos;

import java.util.Scanner;

public class Puntos {
    public int x1,y1,x2,y2;

    public Puntos() {
    }
    public Puntos(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }
    
    public Puntos CrearPuntos(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la primera cordenada");
        System.out.print("para X:");
        x1=leer.nextInt();
        System.out.print("para Y:");
        y1=leer.nextInt();
        System.out.println("Ingrese la segunda cordenada");
        System.out.print("para X:");
        x2=leer.nextInt();
        System.out.print("para Y:");
        y2=leer.nextInt();
        return new Puntos(x1,y1,x2,y2);
    }
    public void calcularDevolver(){
        int cateto1=x2-x1;
        int catero2=y2-y1;
        double hipotenusa=Math.sqrt((int)Math.pow(cateto1,2)+(int)Math.pow(catero2,2));
        System.out.println("La distancia entre las dos cordenadas es:");
        System.out.println(hipotenusa);
    }

    @Override
    public String toString() {
        return "Puntos{" + "x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2=" + y2 + '}';
    }
    
}