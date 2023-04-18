
package empleado;

import java.util.Scanner;


public class Empleado {
    private String nombre;
    private int edad;
    private float salario;


    public Empleado(String nombre, int edad, float salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    public Empleado calcular_aumento(){
        System.out.println("Calculo para el empleado "+nombre);
        if (edad>=30 && edad<=65) {
            salario=(salario/100)*110;
        }else if(edad<30 && edad>=18){
            salario=(salario/100)*105;
        }else{
            System.out.println("Edad ivalida");
            salario=0;
        }
        return new Empleado(nombre, edad, salario);
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + '}';
    }
    
}
