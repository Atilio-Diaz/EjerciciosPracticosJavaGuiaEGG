
package servicios;

import entidades.CuentaBancaria;
import java.util.Scanner;


public class CuentaBancariaServicio2 {
    Scanner leer = new Scanner(System.in);
    

    public CuentaBancaria CrearCuenta() {
        System.out.println("*****************************");
        System.out.println("Sistema de creacion de cuenta");
        System.out.println("*****************************");
        System.out.println("Digite el que va a ser su numero de cuenta");
        int numeroCuenta=leer.nextInt();
        System.out.println("DIgite su DNI");
        long dniCliente=leer.nextLong();
        double saldoActual=0;
        return new CuentaBancaria(numeroCuenta,dniCliente,saldoActual);
    }

    public CuentaBancaria IngresoDeSaldo(int saldoActual) {
        System.out.println("INGRESE EL SALDO PARA AGREGAR A SU CUENTA");
        double saldoEntrante = leer.nextDouble();
        if (saldoEntrante >= 1 && saldoEntrante <= 999999999 && saldoActual < 999999999) {
            saldoActual += saldoEntrante;
            System.out.println("Operacion exitosa");
            System.out.println("Retire su comprobante y dirijase a ventanilla para el deposito");
        } else if (saldoActual >= 999999999) {
            System.out.println("MAXIMO DE DEPOSITOS ALCANSADO");
        } else {
            System.out.println("MONTO INVALIDO");
        }
        return new CuentaBancaria(saldoActual);
    }

    public CuentaBancaria RetirarSaldo(int saldoActual) {
        if (saldoActual == 0) {
            System.out.println("NO TIENE SALDO EN SU CUENTA");
            System.out.println("Para prestamos dirijase a atencion de clientes");
        } else if (saldoActual > 0) {
            System.out.println("Cuanto desea retirar");
            double retiro = leer.nextDouble();
            if (saldoActual - retiro < 0) {
                System.out.println("NO ES POSiBLE COMPLETAR LA OPERACION SALDO INSUFICIENTE");
            } else {
                saldoActual -= retiro;
                System.out.println("Operacion exitosa");
            }

        }
        return new CuentaBancaria(saldoActual);
    }

    public CuentaBancaria ExtraccionRapida(int saldoActual) {
        if (saldoActual == 0) {
            System.out.println("NO TIENE SALDO EN SU CUENTA");
            System.out.println("Para prestamos dirijase a atencion de clientes");
        } else if (saldoActual > 0) {
            System.out.println("Cuanto desea retirar");
            double retiro = leer.nextDouble();
            if (retiro <= saldoActual * .2) {
                saldoActual -= retiro;
                System.out.println("Operacion exitosa");
            } else {
                System.out.println("NO ES POSiBLE COMPLETAR LA OPERACION SOLO 20% del saldo total para extraxiones rapidas");
            }

        }
        return new CuentaBancaria(saldoActual);
    }

    public void ConsuldaSaldo(int saldoActual) {
        System.out.println("SU saldo actual es: " +saldoActual );
    }

    public void ConsultDatos(int saldoActual) {
        System.out.println("El ESTADO DE LA CUENTA ES: " +toString());
    }
}
