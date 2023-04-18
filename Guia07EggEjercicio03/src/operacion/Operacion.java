package operacion;

import java.util.Scanner;

public class Operacion {
    private int numero1,numero2;
    public Operacion(int numero1,int numero2){
        this.numero1=numero1;
        this.numero2=numero2;
    }
    public Operacion(){
    }
    public void setNumero1(int numero1){
        this.numero1=numero1;
    }
    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    public int getNumero1() {
        return numero1;
    }
    public int getNumero2() {
        return numero2;
    }
    public Operacion CrearOperacion(){
    Scanner leer=new Scanner(System.in);
    System.out.println("Ingrese el primer numero");
    numero1=leer.nextInt();
    System.out.println("Ingrese el segundo numero");
    numero2=leer.nextInt();
    return new Operacion(numero1,numero2);
    }
    public void Sumar(){
        getNumero1();
        getNumero2();
        System.out.print("La suma es: "+(numero1+numero2));
        System.out.println("");
    }
    public void Restar(){
        getNumero1();
        getNumero2();
        System.out.print("La resta es: "+(numero1-numero2));
        System.out.println("");
    }
    public void Multiplicacion(){
        getNumero1();
        getNumero2();
        if (numero1==0 || numero2==0) {
            System.out.print("Error por multiplicacion por CERO resultado: "+0);
        }else{
        System.out.print("La multiplicacion es: "+(numero1*numero2));
        }
        System.out.println("");
    }
    public void Dividir(){
        getNumero1();
        getNumero2();
        if (numero1==0 || numero2==0) {
            System.out.print("Error por divicion por CERO resultado: "+0);
        }else{
        System.out.print("La divicion es: "+((float)numero1/numero2));
        }
        System.out.println("");
    }
}
