package main;

import servicios.PersonaServicio;
import entidades.Persona;

public class Guia08EggEjercicio03 {

    public static void main(String[] args) {

        PersonaServicio servP = new PersonaServicio();

        Persona persona1 = servP.crearPersona();

        servP.esMayorDeEdad();
        servP.calcularIMC();
        System.out.println(persona1.toString());

    }
}
