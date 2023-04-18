package main;

import libro.Libro;

public class Guia07EggEjercicio01 {

    public static void main(String[] args) {
        Libro lib = new Libro();
        Libro l1 = lib.cargarLibro();
        l1.MostrarLibro();
    }
}
