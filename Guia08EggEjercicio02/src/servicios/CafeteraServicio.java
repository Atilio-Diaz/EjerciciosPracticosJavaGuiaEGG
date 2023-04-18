package servicios;

import entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {

    Scanner leer = new Scanner(System.in);
    
    Cafetera cafe1 = new Cafetera();//

    public Cafetera LlenarCafetera() {
        System.out.println("CAFETERA AUTOMAC");
        System.out.println("INDIQUE CUAL SERA EL MAXIMO DE CAPACIDAD PERMITIDO DE LA CAFETERA");
        int llenar=leer.nextInt();
        cafe1.setCapacidadMaxima(llenar);
        System.out.println("LLENANDO CAFETERA");
        cafe1.setCantidadActual(cafe1.getCapacidadMaxima());
        return new Cafetera();
    }

    public void ServirTaza() {
        System.out.println("De que tamaño es la taza a llenar");
        int taza = leer.nextInt();
        if (cafe1.getCantidadActual()<taza) {
            System.out.println("La taza no se lleno por completo");
            System.out.println("La taza de: "+taza+ " mili Litros quedo con: "+cafe1.getCantidadActual()+" mili Litros de cafe");
            taza=cafe1.getCantidadActual();
            cafe1.setCantidadActual(0);
        }else if(taza>0){
            System.out.println("La taza de: "+taza+" mili Litros se lleno");
            cafe1.setCantidadActual(cafe1.getCantidadActual()-taza);
            System.out.println("QUEDAN APROXIMADAMENTE: "+cafe1.getCantidadActual()/taza+" TAZAS DE CAFE CON RELACION AL TAMAÑO DE LA ULTIMA TAZA");
        }else{
            System.out.println("TAMAÑO DE LA TAZA INCONGRUENTE");
        }
        
    }

    public void VaciarCafetera() {
        System.out.println("VACIANDO Y LIMPIADO DE LA CAFETERA(nose porque tirar el resto del cafe)");
        cafe1.setCantidadActual(0);
    }

    public void AgregarCafe() {
        System.out.println("CUANTO CAFE DESEA AGREGAR");
        int llenar=leer.nextInt();
        if (cafe1.getCapacidadMaxima()<=llenar) {
            System.out.println("SE ALCANSO EL MAXIMO DE LA CAFETERA ESTABLECIDO");
            cafe1.setCantidadActual(cafe1.getCapacidadMaxima());
        }else if (llenar>0 && llenar<cafe1.getCapacidadMaxima()) {
            System.out.println("LA CAFETERA SE CARGO CON: "+llenar+"  mili Litros");
            cafe1.setCantidadActual(llenar);
        }
        
    }
}
