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

    public void verHistoria() {
        System.out.println(ANSI_CYAN
                + "═════════════════════════════════════════════════════════════════════════════════════════");
        System.out.println(ANSI_PURPLE
                + "Años después de la muerte de Lord Voldermort, la comunidad mágica se ve amenazada por un nuevo terror.");
        System.out.println(ANSI_PURPLE + "Continuar historia");
        System.out.println(ANSI_CYAN
                + "══════════════════════════════════════════════════════════════════════════════════════════");
        volverMenuPrincipal();
    }

    // Método que da la bienvenida al jugador
    public void msjBienvenida() {
        System.out.println(ANSI_CYAN
                + "█╗░░██╗░█████╗░██████╗░██████╗░██╗░░░██╗  ██████╗░░█████╗░████████╗████████╗███████╗██████╗░██╗");
        System.out.println(ANSI_CYAN
                + "██║░░██║██╔══██╗██╔══██╗██╔══██╗╚██╗░██╔╝  ██╔══██╗██╔══██╗╚══██╔══╝╚══██╔══╝██╔════╝██╔══██╗╚═╝");
        System.out.println(ANSI_CYAN
                + "███████║███████║██████╔╝██████╔╝░╚████╔╝░  ██████╔╝██║░░██║░░░██║░░░░░░██║░░░█████╗░░██████╔╝░░░");
        System.out.println(ANSI_CYAN
                + "██╔══██║██╔══██║██╔══██╗██╔══██╗░░╚██╔╝░░  ██╔═══╝░██║░░██║░░░██║░░░░░░██║░░░██╔══╝░░██╔══██╗░░░");
        System.out.println(ANSI_CYAN
                + "██║░░██║██║░░██║██║░░██║██║░░██║░░░██║░░░  ██║░░░░░╚█████╔╝░░░██║░░░░░░██║░░░███████╗██║░░██║██╗");
        System.out.println(ANSI_CYAN
                + "╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░░╚═╝░░░╚═╝░░░  ╚═╝░░░░░░╚════╝░░░░╚═╝░░░░░░╚═╝░░░╚══════╝╚═╝░░╚═╝╚═╝");

        System.out.println(ANSI_CYAN
                + "███████╗██╗░░░░░  ██████╗░███████╗░██████╗░██████╗░███████╗░██████╗░█████╗░  ██████╗░███████╗██╗░░░░░");
        System.out.println(ANSI_CYAN
                + "██╔════╝██║░░░░░  ██╔══██╗██╔════╝██╔════╝░██╔══██╗██╔════╝██╔════╝██╔══██╗  ██╔══██╗██╔════╝██║░░░░░");
        System.out.println(ANSI_CYAN
                + "█████╗░░██║░░░░░  ██████╔╝█████╗░░██║░░██╗░██████╔╝█████╗░░╚█████╗░██║░░██║  ██║░░██║█████╗░░██║░░░░░");
        System.out.println(ANSI_CYAN
                + "██╔══╝░░██║░░░░░  ██╔══██╗██╔══╝░░██║░░╚██╗██╔══██╗██╔══╝░░░╚═══██╗██║░░██║  ██║░░██║██╔══╝░░██║░░░░░");
        System.out.println(ANSI_CYAN
                + "███████╗███████╗  ██║░░██║███████╗╚██████╔╝██║░░██║███████╗██████╔╝╚█████╔╝  ██████╔╝███████╗███████╗");
        System.out.println(ANSI_CYAN
                + "╚══════╝╚══════╝  ╚═╝░░╚═╝╚══════╝░╚═════╝░╚═╝░░╚═╝╚══════╝╚═════╝░░╚════╝░  ╚═════╝░╚══════╝╚══════╝");

        System.out.println(ANSI_CYAN + "███╗░░░███╗░█████╗░██╗░░░░░");
        System.out.println(ANSI_CYAN + "████╗░████║██╔══██╗██║░░░░░");
        System.out.println(ANSI_CYAN + "██╔████╔██║███████║██║░░░░░");
        System.out.println(ANSI_CYAN + "██║╚██╔╝██║██╔══██║██║░░░░░");
        System.out.println(ANSI_CYAN + "██║░╚═╝░██║██║░░██║███████╗");
        System.out.println(ANSI_CYAN + "╚═╝░░░░░╚═╝╚═╝░░╚═╝╚══════╝");

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
        volverMenuPrincipal();
    }

    // Método que permite salir del juego.
    public static void salirDelJuego() {
        System.out.println(ANSI_CYAN
                + "═════════════════════════════════════════════════════════════════════════════════════════");
        System.out.println(ANSI_PURPLE + "Gracias por jugar HPAda");
        System.out.println(ANSI_CYAN
                + "═════════════════════════════════════════════════════════════════════════════════════════");
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

    // Método para validar elección del usuario
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

    public void volverMenuPrincipal() {

        System.out.println(ANSI_CYAN
                + "═════════════════════════════════════════════════════════════════════════════════════════");
        System.out.println(ANSI_PURPLE + "Presione 1 para volver al menú principal.");
        System.out.println(ANSI_PURPLE + "Presione 2 para salir del juego.");
        System.out.println(ANSI_CYAN
                + "═════════════════════════════════════════════════════════════════════════════════════════");
        Scanner sc = new Scanner(System.in);
        int opcion;
        opcion = sc.nextInt();
        /*
         * while (opcion > 0 && opcion <= 2) { System.out.
         * println("La opcion ingresada no es correcta, vuelva a ingresar la opcion");
         * opcion = sc.nextInt(); FALTA CORREGIR
         */

        switch (opcion) {
        case 1:
            inicializarMenu();
            break;
        case 2:
            salirDelJuego();
            break;
        default:
            System.out.printf("La opción  " + opcion + " no es una opción válida");
            break;
        }
        while (opcion > 0 && opcion <= 2)
            ;
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

    // hecho por chabri y luli
    public void elegirPersonaje() {
        System.out.println("Seleccione su personaje: ");

        System.out.println(ANSI_CYAN
                + "═════════════════════════════════════════════════════════════════════════════════════════");
        System.out.println(ANSI_YELLOW + " 1- ■ Muggle-Caro");
        System.out.println(ANSI_YELLOW + " 2- ■ Elfo-Chabri");
        System.out.println(ANSI_YELLOW + " 3- ■ Wizard-Mari");
        System.out.println(ANSI_YELLOW + " 4- ■ Wizard Oscuro-Luli");
        System.out.println(ANSI_CYAN
                + "═════════════════════════════════════════════════════════════════════════════════════════");

        int opcion = 0;
        opcion = Teclado.nextInt();

        switch (opcion) {
        case 1:
            crearPersonajeMuggle();
            System.out.println("¡Muggle-Caro ha sido elegido!");
            break;
        case 2:
            crearPersonajeElfo();
            System.out.println("¡Elfo-Chabri ha sido elegido!");
            break;
        case 3:
            crearPersonajeWizard();
            System.out.println("¡Wizard-Mari ha sido elegido!");
            break;
        case 4:
            crearWizardOscuro();
            System.out.println("¡Wizard Oscuro-Luli ha sido elegido!");
            break;
        default:
            System.out.printf("La opción  " + opcion + " no es una opción válida");
            break;

        }

    }

    // hecho por chabri y luli

    public Personaje crearPersonajeMuggle() {
        Personaje muggle = new Personaje("Muggle-Caro", 100, 10, "Rojo");
        this.personajes.add(muggle);
        return muggle;
    }

    public Personaje crearPersonajeElfo() {
        Personaje elfo = new Personaje("Elfo-Chabri", 50, 15, "Gris");
        this.personajes.add(elfo);
        return elfo;
    }

    public Personaje crearPersonajeWizard() {
        Personaje wizard = new Personaje("Wizard-Mari", 75, 12, "Verde");
        this.personajes.add(wizard);
        return wizard;
    }

    public Personaje crearWizardOscuro() {
        Personaje wizardOscuro = new Personaje("Wizard-Luli", 60, 42, "Azul");
        this.personajes.add(wizardOscuro);
        return wizardOscuro;
    }

    // Instanciamos Hechizos: Modelo del constructor:
    // public Hechizo(int nivelDanio, int nivelCuracion, int energiaMagica, int
    // energiaUtilizada)

    public Hechizo SectumSempra() {
        Hechizo SectumSempra = new Hechizo(30, 0, 2, 3);// settear parámetros
        this.hechizos.add(SectumSempra);
        return SectumSempra;
    }

    public Hechizo VulneraSanentur() {
        Hechizo VulneraSanentur = new Hechizo(0, 30, 1, 5);// settear parámetros
        this.hechizos.add(VulneraSanentur);
        return VulneraSanentur;
    }

    public Hechizo WingwadumLeviosa() {
        Hechizo WingwadumLeviosa = new Hechizo(0, 30, 1, 5);// settear parámetros
        this.hechizos.add(WingwadumLeviosa);
        return WingwadumLeviosa;
    }

    public Hechizo Cavelnimicum() {
        Hechizo Cavelnimicum = new Hechizo(0, 30, 1, 5);// settear parámetros
        this.hechizos.add(Cavelnimicum);
        return Cavelnimicum;
    }

    // Método que permite Jugar // FALTA DESARROLLO
    public void jugar() {
        System.out.println("═════════════════════════════════════════════════════════════════════════════════════════");
        System.out.println("IncializandoJuego");
        System.out.println("═════════════════════════════════════════════════════════════════════════════════════════");
        elegirPersonaje();
    }

}
