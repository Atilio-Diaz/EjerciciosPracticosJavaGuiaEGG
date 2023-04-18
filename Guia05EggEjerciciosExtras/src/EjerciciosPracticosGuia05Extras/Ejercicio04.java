package EjerciciosPracticosGuia05Extras;
import java.util.Scanner;
public class Ejercicio04 {
    public static void main(String[] args) {
        int cAlumnos=2;
        float[] pAlumnos=new float[cAlumnos];
        String[] nAlumnos=new String[cAlumnos];
        llenarVectores(pAlumnos,cAlumnos,nAlumnos);
        mostrarResultados(pAlumnos,cAlumnos,nAlumnos);
    }
    public static void llenarVectores(float[] pAlumnos,int cAlumnos,String[] nAlumnos){
        for(int i=0;i<cAlumnos;i++){
            nAlumnos[i]=nombreAlumnos(i);
            pAlumnos[i]=promediosAlumnos(nAlumnos,i);
        }
    }
    public static float promediosAlumnos(String nAlumnos[],int i){
        Scanner leer=new Scanner(System.in);
        float promedio,nota1=-1,nota2=-1,nota3=-1,nota4=-1;
        System.out.println("notas para el alumno "+nAlumnos[i]);
        while (nota1<0 || nota1>10) {
            System.out.println("Cual es la nota del Primer trabajo preactico evaluativo");
        nota1=leer.nextInt();
        }
        while (nota2<0 || nota2>10) {
            System.out.println("Cual es la nota del segundo trabajo preactico evaluativo");
        nota2=leer.nextInt();
        }
        while (nota3<0 || nota3>10) {
            System.out.println("Cual es la nota del primer integrador");
        nota3=leer.nextInt();
        }
        while (nota4<0 || nota4>10) {
            System.out.println("Cual es la nota del segundo integrador");
        nota4=leer.nextInt();
        }
        promedio=(10*(nota1/100))+(15*(nota2/100))+(25*(nota3/100))+(50*(nota4/100));
    return promedio;
    }
    public static String nombreAlumnos(int i){
        Scanner leer=new Scanner(System.in);
        String nombre;
        System.out.println("Cual es el nombre del alumno "+i);
        nombre=leer.nextLine();
    return nombre;
    }
    public static void mostrarResultados(float[] pAlumnos,int cAlumnos,String[] nAlumnos){
        int aprobados=0,desaprobados=0;
        for(int i=0;i<cAlumnos;i++){
            if (pAlumnos[i]>=7){
                aprobados++;
            }else
            desaprobados++;
        }
        System.out.println("CANTIDAD DE ALUMNOS APROBADOS ES: "+aprobados);
        System.out.println("CANTIDAD DE ALUMNOS DESAROBADOS ES: "+desaprobados);
    }
}