package servicios;

import entidades.CuentaBancaria;

import java.util.Scanner;

public class CuentaBancariaServicio {

    Scanner leer = new Scanner(System.in);

    CuentaBancaria cuenta1 = new CuentaBancaria();

    public CuentaBancaria CrearCuenta() {
        System.out.println("*****************************");
        System.out.println("Sistema de creacion de cuenta");
        System.out.println("*****************************");
        System.out.println("Digite el que va a ser su numero de cuenta");
        cuenta1.setNumeroCuenta(leer.nextInt());
        System.out.println("DIgite su DNI");
        cuenta1.setDniCliente(leer.nextLong());
        return new CuentaBancaria();
    }

    public void IngresoDeSaldo() {
        System.out.println("INGRESE EL SALDO PARA AGREGAR A SU CUENTA");
        double saldoEntrante = leer.nextDouble();
        if (saldoEntrante >= 1 && saldoEntrante <= 999999999 && cuenta1.getSaldoActual() < 999999999) {
            cuenta1.setSaldoActual(cuenta1.getSaldoActual() + saldoEntrante);
            System.out.println("Operacion exitosa");
            System.out.println("Retire su comprobante y dirijase a ventanilla para el deposito");
        } else if (cuenta1.getSaldoActual() >= 999999999) {
            System.out.println("MAXIMO DE DEPOSITOS ALCANSADO");
        } else {
            System.out.println("MONTO INVALIDO");
        }

    }

    public void RetirarSaldo() {
        if (cuenta1.getSaldoActual() == 0) {
            System.out.println("NO TIENE SALDO EN SU CUENTA");
            System.out.println("Para prestamos dirijase a atencion de clientes");
        } else if (cuenta1.getSaldoActual() > 0) {
            System.out.println("Cuanto desea retirar");
            double retiro = leer.nextDouble();
            if (cuenta1.getSaldoActual() - retiro < 0) {
                System.out.println("NO ES POSiBLE COMPLETAR LA OPERACION SALDO INSUFICIENTE");
            } else {
                cuenta1.setSaldoActual(cuenta1.getSaldoActual() - retiro);
                System.out.println("Operacion exitosa");
            }

        }

    }

    public void ExtraccionRapida() {
        if (cuenta1.getSaldoActual() == 0) {
            System.out.println("NO TIENE SALDO EN SU CUENTA");
            System.out.println("Para prestamos dirijase a atencion de clientes");
        } else if (cuenta1.getSaldoActual() > 0) {
            System.out.println("Cuanto desea retirar");
            double retiro = leer.nextDouble();
            if (retiro <= cuenta1.getSaldoActual() * .2) {
                cuenta1.setSaldoActual(cuenta1.getSaldoActual() - retiro);
                System.out.println("Operacion exitosa");
            } else {
                System.out.println("NO ES POSiBLE COMPLETAR LA OPERACION SOLO 20% del saldo total para extraxiones rapidas");
            }

        }
    }

    public void ConsuldaSaldo() {
        System.out.println("SU saldo actual es: " + cuenta1.getSaldoActual());
    }

    public void ConsultDatos() {
        System.out.println("El ESTADO DE LA CUENTA ES: " + cuenta1.toString());
    }
}
