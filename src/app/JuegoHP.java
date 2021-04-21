package app;

import java.util.*;
import app.personajes.*;
import app.artefactos.*;
import app.poderes.hechizos.*;
import app.poderes.*;

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
        System.out.println(ANSI_PURPLE + "¡𝔊𝔯𝔞𝔠𝔦𝔞𝔰 𝔭𝔬𝔯 𝔧𝔲𝔤𝔞𝔯!¡ℌ𝔞𝔰𝔱𝔞 𝔩𝔞 𝔭𝔯𝔬́𝔵𝔦𝔪𝔞!");
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

    public Muggle crearPersonajeMuggle() {
        Muggle muggle = new Muggle("Muggle-Caro", 100, 10, "Rojo");
        this.personajes.add(muggle);
        return muggle;
    }

    public Elfo crearPersonajeElfo() {
        Elfo elfo = new Elfo("Elfo-Chabri", 50, 15, "Gris");
        elfo.setEnergiaMagica(150);//Revisar
        this.personajes.add(elfo);
        return elfo;
    }

    public Wizard crearPersonajeWizard() {
        Wizard wizard = new Wizard("Wizard-Mari", 75, 12, "Verde");
        wizard.setEnergiaMagica(150);//Revisar
        wizard.setArtefacto(CapaInvisibilidad());//falta instanciar
        wizard.aprenderHechizoRandom(); // Devuelve un hechizo random /// VERIFICAR
        this.personajes.add(wizard);
        return wizard;
    }

    public WizardOscuro crearWizardOscuro() {
        WizardOscuro wizardOscuro = new WizardOscuro("Wizard-Luli", 60, 42, "Azul");
        wizardOscuro.setEnergiaMagica(150);//Revisar
        wizardOscuro.setArtefacto(Horrocrux());//falta instanciar
        wizardOscuro.setHechizo(aprenderHechizoRandom());
        this.personajes.add(wizardOscuro);
        return wizardOscuro;
    }

    // Instanciamos Hechizos: Modelo del constructor:
    // public Hechizo(int nivelDanio, int nivelCuracion, int energiaMagica, int
    // energiaUtilizada)

    public SectumSempra SectumSempra() {
        SectumSempra SectumSempra = new SectumSempra(30, 0, 2, 3);// settear parámetros
        this.hechizos.add(SectumSempra);
        return SectumSempra;
    }

    public VulneraSanentur VulneraSanentur() {
        VulneraSanentur VulneraSanentur = new VulneraSanentur(0, 30, 1, 5);// settear parámetros
        this.hechizos.add(VulneraSanentur);
        return VulneraSanentur;
    }

    public WingwardumLeviosa WingwardumLeviosa() {
        WingwardumLeviosa WingwardumLeviosa = new WingwardumLeviosa(0, 30, 1, 5);// settear parámetros
        this.hechizos.add(WingwardumLeviosa);
        return WingwardumLeviosa;
    }

    public Cavelnimicum Cavelnimicum() {
        Cavelnimicum Cavelnimicum = new Cavelnimicum(0, 30, 1, 5);// settear parámetros
        this.hechizos.add(Cavelnimicum);
        return Cavelnimicum;
    }

    //Es un hechizo de curación
    public Hechizo Anapneo() {
        Hechizo Anapneo = new Hechizo(0, 30, 1, 5);// settear parámetros!
        //this.hechizos.add(Anapneo);
        return Anapneo;
    }

    //Alarte ascendare: Este hechizo eleva a su objetivo por los aires.
    public Hechizo Alarteascendare() {
        Hechizo Alarteascendare = new Hechizo(0, 30, 1, 5);// settear parámetros
       //this.hechizos.add(Alarteascendare);
        return Alarteascendare;
    }

    //Salvio hexia. Permite proteger de encantamientos oscuros una zona
    public HechizoDefensa Salviohexia() {
        HechizoDefensa Salviohexia = new HechizoDefensa(0, 30, 1, 5);// settear parámetros
        this.hechizos.add(Salviohexia);
        return Salviohexia;
    }

    //Melofors. Envuelve la cabeza del enemigo con una calabaza
    public HechizoAtaque Melofors() {
        HechizoAtaque Melofors = new HechizoAtaque(0, 30, 1, 5);// settear parámetros
        this.hechizos.add(Melofors);
        return Melofors;
    }

    //Cura heridas.
    public Hechizo Episkey() {
        Hechizo Episkey = new Hechizo(0, 30, 1, 5);// settear parámetros
        //this.hechizos.add(Episkey);
        return Episkey;
    }

     //Genera cosquillas en la víctima
    public Hechizo Rictusempra() {
        Hechizo Rictusempra = new Hechizo(0, 30, 1, 5);// settear parámetros
        //this.hechizos.add(Rictusempra);
        return Rictusempra;
    }

    //Método para aprender un hechizo random:

    public Hechizo aprenderHechizoRandom() {

        int max = this.hechizos.size();
        int min = 1;

        int random = (int) (Math.random() * ((max - min) + 1)) + min;
        return this.hechizos.get(random - 1);
    }

    // Se instancian los poderes:

    public Invisibilidad Invisibilidad() {
        Invisibilidad Invisibilidad = new Invisibilidad();// settear parámetros
        return Invisibilidad;
    }

    public ParseTongue ParseTongue() {
        ParseTongue ParseTongue = new ParseTongue();
        return ParseTongue;
    }

    public Metamorfosis Metamorfosis() {
        Metamorfosis Metamorfosis = new Metamorfosis();
        return Metamorfosis;
    }

    // Se instancian los artefactos
    //super(nombre, amplificadorDeDanio, amplificadorDeCuracion):

    public CapaInvisibilidad CapaInvisibilidad() {
        CapaInvisibilidad CapaInvisibilidad = new CapaInvisibilidad("Capa de invisibilidad", 0.1, 0.5);
        return CapaInvisibilidad;
    }
    
     public PiedraResurreccion PiedraResurreccion() {
        PiedraResurreccion PiedraResurreccion = new PiedraResurreccion("Piedra Resurrección", 0.1, 0.5);
        return PiedraResurreccion;
    }
    
    public VaritaSauco VaritaSauco() {
        VaritaSauco VaritaSauco = new VaritaSauco("VaritaSauco", 0.6,0.2);
        return VaritaSauco;
    }
     
    public Horrocrux Horrocrux() {
        Horrocrux Horrocrux= new Horrocrux("Horrocrux", 0.6, 0.2);
        return Horrocrux;
    }

    public String crearNombrePersonaje() {
        System.out.println(ANSI_CYAN
                + "═════════════════════════════════════════════════════════════════════════════════════════");
        System.out.println(ANSI_PURPLE + "𝐄𝐥𝐢𝐣𝐚 𝐮𝐧 𝐧𝐨𝐦𝐛𝐫𝐞 𝐩𝐚𝐫𝐚 𝐬𝐮 𝐩𝐞𝐫𝐬𝐨𝐧𝐚𝐣𝐞 𝐦𝐚𝐠𝐨:");
        System.out.println(ANSI_CYAN
                + "═════════════════════════════════════════════════════════════════════════════════════════");

        String nombreElegido;
        nombreElegido= Teclado.nextLine();
        return nombreElegido;
    }
   

    // Método que permite Jugar // FALTA DESARROLLO
    public void jugar() {
        System.out.println(ANSI_CYAN
                + "═════════════════════════════════════════════════════════════════════════════════════════");
        System.out.println(ANSI_PURPLE + "𝑰𝒏𝒊𝒄𝒊𝒂𝒍𝒊𝒛𝒂𝒏𝒅𝒐 𝒆𝒍 𝒋𝒖𝒆𝒈𝒐");
        System.out.println(ANSI_CYAN
                + "═════════════════════════════════════════════════════════════════════════════════════════");
        elegirPersonaje();
    }

    public void combate() {

        crearNombrePersonaje();
        Wizard p1 = new Wizard(crearNombrePersonaje(), 150, 12, ANSI_WHITE);
        p1.setEnergiaMagica(150);//Revisar
        p1.setArtefacto(CapaInvisibilidad());//falta instanciar
        p1.setHechizo(aprenderHechizoRandom()); // Devuelve un hechizo random


        Elfo p2 = new Elfo("Elfo-Chabri", 50, 15, ANSI_BLUE);
        p2.setEnergiaMagica(150);//Revisar

        boolean turnoP1 = true;

        System.out.println(ANSI_CYAN
                + "═════════════════════════════════════════════════════════════════════════════════════════");
        System.out.println(ANSI_PURPLE + "𝑪𝒐𝒎𝒊𝒆𝒏𝒛𝒂 𝒆𝒍 𝒄𝒐𝒎𝒃𝒂𝒕𝒆");
        System.out.println(ANSI_CYAN
                + "═════════════════════════════════════════════════════════════════════════════════════════");
        
        //mientras ambos tengan salud, pelear entre si
        //gameloop
        while(p1.getEnergiaMagica() > 0 && p2.getEnergiaMagica() > 0){
            
/*            Wizard p1;
            Elfo p2; */

            if (turnoP1){
                atacante = p1;
                oponente = p2;
            }
            else{
                atacante = p2;
                oponente = p1;
            }

            int max = 10;
            int min = 2;
            //genera un valor random entre 2 y 10
            int danio = (int) (Math.random() * ((max - min) + 1)) + min;

            System.out.println(atacante.color + atacante.nombre + " ataca a "+ oponente.nombre);
            
            atacante.atacarA(oponente, danio);
            
            System.out.println("A "+ oponente.nombre + " le queda "+ oponente.salud + " de salud");

            turnoP1 = !turnoP1;

            //Pausa el programa por 2 segundos(2000 milisegundos = 2 segundos)
            Thread.sleep(3000);
        }

        if (p1.getEnergiaMagica() > 0){
            System.out.println(p1.getColor()  + p1.getNombre() + " ganó!!!");
        }
        else{
            System.out.println(p2.getNombre()  + p2.getNombre()+ " ganó!!!");
        }

        public Artefacto obtenerArtefactoRandom() {

            int max = this.artefactos.size();
            int min = 1;
    
            int random = (int) (Math.random() * ((max - min) + 1)) + min;
            return this.artefactos.get(random - 1);





    }

}
