package main;
import entidades.CuentaBancaria;
import java.util.Scanner;
import servicios.CuentaBancariaServicio;
public class Guia08EggEjercicio01 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        CuentaBancariaServicio cuenta1 = new CuentaBancariaServicio();
        
        CuentaBancaria nuevo=cuenta1.CrearCuenta();
        
        int opcion;
        boolean logic = true;
        while (logic) {
            MostrarMenu();
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    cuenta1.IngresoDeSaldo();
                    break;
                case 2:
                    cuenta1.RetirarSaldo();
                    break;
                case 3:
                    cuenta1.ExtraccionRapida();
                    break;
                case 4:
                    cuenta1.ConsuldaSaldo();
                    break;
                case 5:
                    cuenta1.ConsultDatos();
                    break;
                case 6:
                    System.out.println("Gracias por elejirnos");
                    logic = false;
                    break;
                default:
                    System.out.println("OPCION INCORRECTA");
            }
        }

    }

    public static void MostrarMenu() {
        System.out.println("*****************************");
        System.out.println("MENU DE OPERACIONES BANCARIAS");
        System.out.println("*****************************");
        System.out.println("1-PARA DEPOSITOS");
        System.out.println("2-PARA EXTRAXIONES DE SALDO");
        System.out.println("3-PARA EXTRAXIONES RAPIDAS maximo 20% del saldo");
        System.out.println("4-PARA CONSULTA DE SALDO");
        System.out.println("5-PARA ESTADO DE LA CUENTA");
        System.out.println("6-PARA CERRAR SESION");
    }
}
