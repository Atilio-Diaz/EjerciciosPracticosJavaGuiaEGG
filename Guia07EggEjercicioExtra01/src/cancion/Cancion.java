package cancion;

import java.util.Scanner;

public class Cancion {

    public String titulo, autor;

    public Cancion() {
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Cancion CrearCancion() {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el nombre del titulo de la cancion");
        titulo=leer.next();
        System.out.println("Ingrese el nombre del autor");
        autor=leer.next();
        return new Cancion(titulo, autor);
    }

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", autor=" + autor + '}';
    }
    
}
