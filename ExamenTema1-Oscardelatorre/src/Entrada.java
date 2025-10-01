import controler.Plataforma;
import model.Accion;
import model.Estrategia;
import model.Rpg;
import model.Videojuego;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Plataforma plataforma = new Plataforma();
        plataforma.anadirJuego(new Accion( "CS2", "Valve", "18", 2016, 16.99, 5, true));
        plataforma.anadirJuego(new Accion( "Valorant", "Riot", "18", 2020, 0.00, 5, true));
        plataforma.anadirJuego(new Estrategia( "LOL", "Riot", "10", 2016, 5.99, 5, 30));
        plataforma.anadirJuego(new Estrategia( "CoC", "Sueprcell", "3", 2005, 16.99, 5, 10));
        plataforma.anadirJuego(new Rpg( "POE", "poe", "10", 2023, 40.00, true, 200));
        plataforma.anadirJuego(new Rpg( "POE2", "Valve", "18", 2024, 49.99, true, 100));
        int opcion = 0;
        do {
            System.out.println("----MENU----");
            System.out.println("1. Ver Juegos");
            System.out.println("2. Fitrar juegos por tipo");
            System.out.println("3. Fitrar juegos por edad");
            System.out.println("4. Ver detalles");
            System.out.println("5. Calcular tiempo de descarga");
            System.out.println("6. Calcular precio total de los juegos");
            System.out.println("7. Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    plataforma.mostrar();
                    break;
                case 2:

                    break;
                case 3:
                    System.out.println("De que edad quieres ver los juegos");
                    String edad = scanner.nextLine();
                    plataforma.filtroEdad(edad);
                    break;
                case 4:
                    System.out.println("Que tipo de videojuegos quieres ver");
                    String tipo = scanner.nextLine();
                   // plataforma.listaJuego(tipo,);
                    break;
                case 5:

                    break;
                case 6:
                    plataforma.calcualarPrecio();
                    break;
                case 7:
                    System.out.println("Saliedo...");
                    break;
            }
        } while (opcion != 6);
    }
}