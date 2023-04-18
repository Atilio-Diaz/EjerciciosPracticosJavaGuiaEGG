package libro;

import java.util.Scanner;

public class Libro{
    public int ISBN;
    public String titulo;
    public String autor;
    public int paginas;
    public Libro(){
    } 
    public Libro(int ISBN,String titulo,String autor,int paginas){
        this.ISBN=ISBN;
        this.titulo=titulo;
        this.autor=autor;
        this.paginas=paginas;
    }
    public Libro cargarLibro(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Introduce el numero del ISBN");
        int ISBN=leer.nextInt();
        System.out.println("Introduce el titulo del libro");
        String titulo=leer.next();
        System.out.println("Introduce el nombre del autor");
        String autor=leer.next();
        System.out.println("Introduce el numero de paginas");
        int paginas=leer.nextInt();
        return new Libro(ISBN,titulo,autor,paginas);
    }
    public void MostrarLibro(){
        System.out.println("El ISBN= "+ISBN);
        System.out.println("El Titulo="+titulo);
        System.out.println("El autor es="+autor);
        System.out.println("Las paginas son="+paginas);
    }
}