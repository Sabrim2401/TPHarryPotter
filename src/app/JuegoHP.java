package app;

import java.util.*;
import app.personajes.Personaje;
import app.artefactos.*;
import app.poderes.hechizos.*;

public class JuegoHP {
    public List<Personaje> personajes = new ArrayList<>();
    public List<Artefacto> artefactos = new ArrayList<>();
    public List<Hechizo> hechizos = new ArrayList<>();



    // Agrego colores para menú

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static Scanner Teclado = new Scanner(System.in);

    // Método que permite ver la Historia creada.

    public static void verHistoria() {
        System.out.println(ANSI_CYAN
                + "═════════════════════════════════════════════════════════════════════════════════════════");
        System.out.println(ANSI_PURPLE
                + "Años después de la muerte de Lord Voldermort, la comunidad mágica se ve amenazada por un nuevo terror.");
        System.out.println(ANSI_PURPLE + "Continuar historia");
        System.out.println(ANSI_CYAN
                + "══════════════════════════════════════════════════════════════════════════════════════════");
    }

    // Método que da lista los créditos del juego.
    public void listarCreditos() {
        System.out.println(ANSI_CYAN
                + "═════════════════════════════════════════════════════════════════════════════════════════");
        System.out.println(ANSI_GREEN + " Juego desarrollado por:");
        System.out.println(ANSI_GREEN + " ■ Sabrina Meli");
        System.out.println(ANSI_GREEN + " ■ Brenda Monteagudo");
        System.out.println(ANSI_GREEN + " ■ Carolina Portillo");
        System.out.println(ANSI_GREEN + " ■ Luli Nieva");
        System.out.println(ANSI_GREEN + " ■ Mariana Avilano");
        System.out.println(ANSI_CYAN
                + "═════════════════════════════════════════════════════════════════════════════════════════");
    }

    // Método que permite salir del juego.
    public static void salirDelJuego() {
        System.out.println(ANSI_CYAN
                + "═════════════════════════════════════════════════════════════════════════════════════════");
        System.out.println(ANSI_PURPLE + "Gracias por jugar HPAda");
        System.out.println(ANSI_CYAN
                + "═════════════════════════════════════════════════════════════════════════════════════════");
    }

    // Método que permite Jugar // FALTA DESARROLLO
    public static void jugar() {
        System.out.println("═════════════════════════════════════════════════════════════════════════════════════════");
        System.out.println("IncializandoJuego");
        System.out.println("═════════════════════════════════════════════════════════════════════════════════════════");
    }

    // Método que sirve para el menú inicial
    public static void listarMenu() {
        System.out.println(ANSI_CYAN
                + "═════════════════════════════════════════════════════════════════════════════════════════");
        System.out.println(ANSI_PURPLE + "JUEGO HDP");
        System.out.println(ANSI_PURPLE + " 1- ■ Jugar");
        System.out.println(ANSI_PURPLE + " 2- ■ Ver historia");
        System.out.println(ANSI_PURPLE + " 3- ■ Listar créditos");
        System.out.println(ANSI_PURPLE + " 4- ■ Salir");
        System.out.println(ANSI_CYAN
                + "═════════════════════════════════════════════════════════════════════════════════════════");

    }

    // Método para validar elección del usuario //WORKING PROGRESS
    public static int ingresoOpcionMenu() {

        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println(ANSI_PURPLE + "Ingrese una opción ---->");
            System.out.println(ANSI_CYAN
                    + "═════════════════════════════════════════════════════════════════════════════════════════");
            while (!sc.hasNextInt()) {
                System.out.println(ANSI_PURPLE + "La opción ingresada no es un número.");
                sc.next();
            }
            opcion = sc.nextInt();
            sc.nextLine();
        } while (opcion < 0 || opcion > 4);

        return opcion;
    }

    // Método que sirve para volver al Menú principal

    public void volverMenuPrin() {

    }

    // Método que sirve para inicializar Menú// DEBE MEJORARSE

    public void inicializarMenu() {

        listarMenu();
        int opcion = 0;
        opcion = ingresoOpcionMenu();

        switch (opcion) {
        case 1:
            jugar();
            break;
        case 2:
            verHistoria();
            break;
        case 3:
            listarCreditos();
            break;
        case 4:
            salirDelJuego();
            break;
        default:
            System.out.printf("La opción  " + opcion + " no es una opción válida");
            break;

        }
        while (opcion > 0 && opcion <= 4)
            ;

    }

    public void inicializarPersonajes() {

    // muggle
    Personaje muggle = new Personaje("Muggle-Caro", 100, 10, "Rojo");

    this.personajes.add(muggle);

    // elfo

    Personaje elfo = new Personaje("Elfo-Chabri", 50 , 15 , "Gris"); 

    this.personajes.add(elfo);

    // wizard

    Personaje wizard = new Personaje("Wizard-Bren", 75, 12, "Verde" ); 

    this.personajes.add(wizard);

    // squibs

    Personaje squibs = new Personaje("Squibs-Mariana", 90, 10, "Purpura"); 
 this.personajes.add(squibs);

   // wizard oscuro

    Personaje wizardOscuro = new Personaje("Wizard-LuLI", 60, 42, "Azul" ); 

    this.personajes.add(wizardOscuro);

} 

}
