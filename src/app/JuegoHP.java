package app;
import java.util.*;


public class JuegoHP {

    public static Scanner Teclado = new Scanner(System.in);

    // Método que permite ver la Historia creada.

    public static void verHistoria() {
        System.out.println("═════════════════════════════════════════════════════════════════════════════════════════");
        System.out.println("Años después de la muerte de Lord Voldermort, la comunidad mágica se ve amenazada por un nuevo terror.");
        System.out.println("Continuar historia");
        System.out.println("═════════════════════════════════════════════════════════════════════════════════════════");
    }

    // Método que da lista los créditos del juego.
    public void listarCreditos() {
        System.out.println("═════════════════════════════════════════════════════════════════════════════════════════");
        System.out.println(" Juego desarrollado por:");
        System.out.println(" ■ Sabrina Meli");
        System.out.println(" ■ Brenda Monteagudo");
        System.out.println(" ■ Carolina Portillo");
        System.out.println(" ■ Luli Nieva");
        System.out.println(" ■ Mariana Avilano");
        System.out.println("═════════════════════════════════════════════════════════════════════════════════════════");
    }

    // Método que permite salir del juego.
    public static void salirDelJuego() {
        System.out.println("═════════════════════════════════════════════════════════════════════════════════════════");
        System.out.println("Gracias por jugar HPAda");
        System.out.println("═════════════════════════════════════════════════════════════════════════════════════════");
    }

    // Método que permite Jugar // FALTA DESARROLLO
    public static void jugar() {
        System.out.println("═════════════════════════════════════════════════════════════════════════════════════════");
        System.out.println("IncializandoJuego");
        System.out.println("═════════════════════════════════════════════════════════════════════════════════════════");
    }

    // Método que sirve para el menú inicial
    public int elegirMenu() {
        System.out.println("═════════════════════════════════════════════════════════════════════════════════════════");
        System.out.println(" Ingrese una opción ---->");
        System.out.println(" 1- ■ Jugar");
        System.out.println(" 2- ■ Ver historia");
        System.out.println(" 3- ■ Listar créditos");
        System.out.println(" 4- ■ Salir");
        System.out.println("═════════════════════════════════════════════════════════════════════════════════════════");

        int respuestaUsuario = Teclado.nextInt();
        Teclado.nextLine();

        return respuestaUsuario;

    }
    

    // Método que sirve para inicializar Menú

    public void inicializarMenu(){

        int opcion = 0;
        opcion = elegirMenu();

        switch (opcion){
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
                System.out.printf( "La opción  " + opcion  +  " no es una opción válida");
                break;
                
        }while (opcion != 0);
    }
    
}
