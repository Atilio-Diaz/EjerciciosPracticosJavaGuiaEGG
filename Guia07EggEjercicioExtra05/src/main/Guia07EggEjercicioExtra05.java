
package main;

import empleado.Empleado;

public class Guia07EggEjercicioExtra05 {
    public static void main(String[] args) {
        Empleado empleado=new Empleado("Aprendiz", 18, 350000);
        Empleado ms=empleado.calcular_aumento();
        System.out.println(empleado);
    }
}
