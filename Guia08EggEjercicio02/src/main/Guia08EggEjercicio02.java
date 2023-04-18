package main;

import java.util.Scanner;
import servicios.CafeteraServicio;

public class Guia08EggEjercicio02 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        CafeteraServicio cafe = new CafeteraServicio();
        cafe.LlenarCafetera();
        boolean logic=true;
        while (logic) {
            menu();
            int opcion=leer.nextInt();
            switch (opcion) {
                case 1:
                    cafe.ServirTaza();
                    break;
                case 2:
                    cafe.VaciarCafetera();
                    break;
                case 3:
                    cafe.AgregarCafe();
                    break;
                case 4:
                    System.out.println("SALIENDO DEL MENU");
                    logic=false;
                    break;
                default:
                    throw new AssertionError();
            }

        }
    }
    public static void menu(){
        System.out.println("1-PARA LLENAR TAZA");
        System.out.println("2-PARA VACIAR Y LIMPIAR CAFETERA");
        System.out.println("3-PARA AGREGAR MAS CAFE");
        System.out.println("4-PARA SALIR DEL MENU DEJAR EN STANDBY Y"
                + " CALENTAR EL CAFE");
    }
}
