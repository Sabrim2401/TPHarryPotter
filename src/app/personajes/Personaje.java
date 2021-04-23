package app.personajes;
import java.util.*;


public class Personaje {
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

    public Personaje(String nombre, int salud, int golpe, String color) {
        this.nombre = nombre;
        this.salud = salud;
        this.golpe = golpe;
        this.color = color;
    }
   
    private String nombre;
    private int salud;
    private int edad;
    private int golpe; 
    private String color; 

    // Nombre
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Salud
    public int getSalud() {
        return this.salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    // Edad
    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Golpe
    public int getGolpe() {
        return this.golpe;
    }

    public void setGolpe(int golpe) {
        this.golpe = golpe;
    }

    // Golpe
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean estaVivo() {
        int saludMinima = 1;
        int saludMaxima= 100;
            return true;
    }

    public String crearNombrePersonaje() {
        System.out.println(ANSI_CYAN
                + "═════════════════════════════════════════════════════════════════════════════════════════");
        System.out.println(ANSI_PURPLE + "𝐄𝐥𝐢𝐣𝐚 𝐮𝐧 𝐧𝐨𝐦𝐛𝐫𝐞 𝐩𝐚𝐫𝐚 𝐬𝐮 𝐩𝐞𝐫𝐬𝐨𝐧𝐚𝐣𝐞 𝐦𝐚𝐠𝐨:");
        System.out.println(ANSI_CYAN
                + "═════════════════════════════════════════════════════════════════════════════════════════");

        String nombreElegido;
        nombreElegido = Teclado.nextLine();
        return nombreElegido;
    }
    

       


}