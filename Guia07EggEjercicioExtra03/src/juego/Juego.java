package juego;

import java.util.Scanner;

public class Juego {

    public String jugador1, jugador2;
    public int intentos, ganadas1, ganadas2, numero, puntos;

    public Juego() {
    }

    public Juego(String jugador1, String jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public Juego(String jugador1, String jugador2, int intentos, int ganadas1, int ganadas2, int numero, int puntos) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.intentos = intentos;
        this.ganadas1 = ganadas1;
        this.ganadas2 = ganadas2;
        this.numero = numero;
        this.puntos = puntos;
    }

    public Juego CargarJugadores() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cual es el nombre del jugador 1");
        jugador1 = leer.next();
        System.out.println("Cual es el nombre del jugador 2");
        jugador2 = leer.next();
        return new Juego(jugador1, jugador2);
    }

    public Juego IniciarJuego() {
        Scanner leer = new Scanner(System.in);
        boolean seguir = true;
        while (seguir) {
            System.out.println("*************************************");
            System.out.println("INICIANDO JUEGO DE ADIVINAR UN NUMERO");
            System.out.println("*************************************");
            System.out.println("Elije la dificultad para el otro jugador ");
            System.out.println("*************************************");
            System.out.println("1-FACIL 0-10 con 3 intentos , 1 punto por acertar");
            System.out.println("2-NORMAL 0-100 con 10 intentos , 3 puntos por acertar");
            System.out.println("3-DIFICIL 0-1000 con 20 intentos , 5 puntos por acertar");
            System.out.println("4-EXTREMO 0-10000 con 20 intentos  , 10 puntos por acertar");
            System.out.println("5-SALIR DEL JUEGO");
            int opcion;
            String dificultad = "";
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    numero = (int) (Math.random() * 10);
                    intentos = 3;
                    puntos = 1;
                    dificultad = "FACIL";
                    break;
                case 2:
                    numero = (int) (Math.random() * 100);
                    intentos = 10;
                    puntos = 5;
                    dificultad = "NORMAL";
                    break;
                case 3:
                    numero = (int) (Math.random() * 1000);
                    intentos = 50;
                    puntos = 10;
                    dificultad = "DIFICIL";
                    break;
                case 4:
                    numero = (int) (Math.random() * 10000);
                    intentos = 50;
                    puntos = 20;
                    dificultad = "EXTREMO";
                    break;
                case 5:
                    System.out.println("GRACIAS POR JUGAR");
                    intentos = 0;
                    seguir = false;
                    break;
                default:
                    if (opcion <= 0) {
                        System.out.println("Mas facil ¡ENSERIO! elije denuevo");
                        opcion = leer.nextInt();
                    } else if (opcion >= 6) {
                        System.out.println("SE PODRIA ACER MAS DIFICIL PERO... Mejor elije denuevo");
                        opcion = leer.nextInt();
                    }
            }
            if (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4) {
                System.out.println("Ya selecciono la dificultad: " + dificultad + " tientes " + intentos + " intentos, buena suerte");
            }
            while (intentos >= 1 && opcion != 5) {
                System.out.println("Que numero elijes");
                System.out.println("numero " + numero);
                System.out.println("intentos " + intentos);
                System.out.println("puntos " + puntos);
                int numeroE;
                numeroE = leer.nextInt();
                if (numeroE == numero) {
                    System.out.println("¡ACERTASTE! ganaste: " + puntos + " puntos por dificultad " + dificultad);
                    ganadas2 += puntos;
                    break;
                } else if (numeroE != numero && intentos >= 1) {
                    intentos--;
                }
                if (intentos == 0) {
                    System.out.println("Se te acabaron los intentos");
                    break;
                } else if (numeroE < numero && intentos >= 1) {
                    System.out.println("Sigue intentando prueba uno mas ALTO");
                } else if (numeroE > numero && intentos >= 1) {
                    System.out.println("Sigue intentando prueba uno mas BAJO");
                }

            }
        }
        return new Juego(jugador1, jugador2, intentos, ganadas1, ganadas2, numero, puntos);
    }

    @Override
    public String toString() {
        return "Juego {" + jugador1 + " GANADAS=" + ganadas1 + "*************" + jugador2 + " GANADAS=" + ganadas2 + '}';
    }

}
