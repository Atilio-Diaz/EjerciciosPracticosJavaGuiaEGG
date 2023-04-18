package servicios;

import entidades.Persona;
import java.util.Scanner;

public class PersonaServicio {

    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {
        System.out.println("Cual es el nombre de la persona");
        String nombre = leer.nextLine();
        boolean logic = true;
        int edad;
        do {
            System.out.println("Cual es la edad de la persona");
            edad = leer.nextInt();
            if (edad > 0 && edad < 120) {
                logic = false;
            } else {
                System.out.println("DIGITE UNA EDAD VALIDA");
            }
        } while (logic);
        logic = true;
        String sexo;
        do {
            System.out.println("Cual es el sexo de la persona H-hombre M-mujer O-otros");
            sexo = leer.next();
            if (sexo.equalsIgnoreCase("h") || sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("o")) {
                logic = false;
            } else {
                System.out.println("GENERO NO PROGRAMADO");
            }
        } while (logic);
        logic = true;
        float peso;
        do {
            System.out.println("Cual es el peso de la persona");
            peso = leer.nextFloat();
            if (peso > 0 && peso < 600) {
                logic = false;
            } else {
                System.out.println("DIGITE UN PESO VALIDO");
            }
        } while (logic);
        logic = true;
        float altura;
        do {
            System.out.println("Cual es la altura de la persona");
            altura = leer.nextFloat();
            if (altura > 0 && altura < 3) {
                logic = false;
            } else {
                System.out.println("DIGITE UNA ALTURA VALIDA");
            }
        } while (logic);
        return new Persona(nombre, edad, sexo, peso, altura);
    }
    public void esMayorDeEdad() {
        crearPersona();
        boolean confirmar;
        if (es.getEdad() < 18 && es.getEdad() > 1) {
            confirmar = false;
            System.out.println("La persona es mayor de edad: " + confirmar);
        } else if (es.getEdad() > 18) {
            confirmar = true;
            System.out.println("La persona es mayor de edad: " + confirmar);
        } else {
            System.out.println("ERROR EDAD IMPOSIBLE");
        }
    }

    public int calcularIMC() {
        Persona cal=new Persona();
        int IMC;
        if ((cal.getPeso() / Math.pow(cal.getAltura(), 2)) < 20) {
            IMC = -1;
            System.out.println("La persona esta por debajo de su peso ideal ");
        } else if ((cal.getPeso() / Math.pow(cal.getAltura(), 2)) >= 20 && (cal.getPeso() / Math.pow(cal.getAltura(), 2)) <= 25) {
            IMC = 0;
            System.out.println("La persona esta en su peso ideal");
        } else {
            IMC = 1;
            System.out.println("La persona tiene sobrepeso");
        }
        return IMC;
    }

}
