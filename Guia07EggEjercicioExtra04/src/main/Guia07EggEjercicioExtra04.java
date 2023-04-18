
package main;

import cuentas.Cuenta;

public class Guia07EggEjercicioExtra04 {
    public static void main(String[] args) {
        Cuenta retiro=new Cuenta();
        while (true) {
            retiro.Retirar_dinero();
            System.out.println("El estado de la cuenta es: "+retiro);
        }
    }
}
