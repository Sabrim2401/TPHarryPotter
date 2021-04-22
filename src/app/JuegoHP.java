package app;

import java.util.*;
import app.personajes.*;
import app.artefactos.*;
import app.interfaces.IHaceMagia;
import app.poderes.hechizos.*;
import app.poderes.*;

public class JuegoHP {
    public List<Personaje> personajes = new ArrayList<>();
    public List<Artefacto> artefactos = new ArrayList<>();
    public List<Hechizo> hechizos = new ArrayList<>();
    public List<IHaceMagia> hacenmagia = new ArrayList<>();

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
        System.out.println(ANSI_GREEN + " 𝘑𝘶𝘦𝘨𝘰 𝘥𝘦𝘴𝘢𝘳𝘳𝘰𝘭𝘭𝘢𝘥𝘰 𝘱𝘰𝘳:");
        System.out.println(ANSI_GREEN + " ■ 𝑆𝑎𝑏𝑟𝑖𝑛𝑎 𝑀𝑒𝑙𝑖");
        System.out.println(ANSI_GREEN + " ■ 𝐵𝑟𝑒𝑛𝑑𝑎 𝑀𝑜𝑛𝑡𝑒𝑎𝑔𝑢𝑑𝑜");
        System.out.println(ANSI_GREEN + " ■ 𝐶𝑎𝑟𝑜𝑙𝑖𝑛𝑎 𝑃𝑜𝑟𝑡𝑖𝑙𝑙𝑜");
        System.out.println(ANSI_GREEN + " ■ 𝐿𝑢𝑙𝑖 𝑁𝑖𝑒𝑣𝑎");
        System.out.println(ANSI_GREEN + " ■ 𝑀𝑎𝑟𝑖𝑎𝑛𝑎 𝐴𝑣𝑖𝑙𝑎𝑛𝑜");
        System.out.println(ANSI_CYAN
                + "═════════════════════════════════════════════════════════════════════════════════════════");
        volverMenuPrincipal();
    }

    // Método que permite salir del juego.
    public static void salirDelJuego() {
        System.out.println(ANSI_CYAN
                + "═════════════════════════════════════════════════════════════════════════════════════════");
        System.out.println(ANSI_PURPLE + "¡𝐺𝑟𝑎𝑐𝑖𝑎𝑠 𝑝𝑜𝑟 𝑗𝑢𝑔𝑎𝑟! ¡𝐻𝑎𝑠𝑡𝑎 𝑙𝑎 𝑝𝑟𝑜́𝑥𝑖𝑚𝑎!");
        System.out.println(ANSI_CYAN
                + "═════════════════════════════════════════════════════════════════════════════════════════");
    }

    // Método que sirve para el menú inicial
    public static void listarMenu() {
        System.out.println(ANSI_CYAN
                + "═════════════════════════════════════════════════════════════════════════════════════════");
        System.out.println(ANSI_PURPLE + "𝐽𝑈𝐸𝐺𝑂 𝐻𝐴𝑅𝑅𝑌 𝑃𝑂𝑇𝑇𝐸𝑅");
        System.out.println(ANSI_PURPLE + " 1- ■ 𝐽𝑢𝑔𝑎𝑟");
        System.out.println(ANSI_PURPLE + " 2- ■ 𝘝𝘦𝘳 𝘩𝘪𝘴𝘵𝘰𝘳𝘪𝘢");
        System.out.println(ANSI_PURPLE + " 3- ■ 𝐿𝑖𝑠𝑡𝑎𝑟 𝑐𝑟𝑒́𝑑𝑖𝑡𝑜𝑠");
        System.out.println(ANSI_PURPLE + " 4- ■ 𝑆𝑎𝑙𝑖𝑟");
        System.out.println(ANSI_CYAN
                + "═════════════════════════════════════════════════════════════════════════════════════════");

    }

    // Método para validar elección del usuario
    public static int ingresoOpcionMenu() {

        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println(ANSI_PURPLE + "𝐼𝑛𝑔𝑟𝑒𝑠𝑒 𝑢𝑛𝑎 𝑜𝑝𝑐𝑖𝑜́𝑛 ---->");
            System.out.println(ANSI_CYAN
                    + "═════════════════════════════════════════════════════════════════════════════════════════");
            while (!sc.hasNextInt()) {
                System.out.println(ANSI_PURPLE + "𝐿𝑎 𝑜𝑝𝑐𝑖𝑜́𝑛 𝑖𝑛𝑔𝑟𝑒𝑠𝑎𝑑𝑎 𝑛𝑜 𝑒𝑠 𝑢𝑛 𝑛𝑢́𝑚𝑒𝑟𝑜.");
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
        System.out.println(ANSI_PURPLE + "𝑃𝑟𝑒𝑠𝑖𝑜𝑛𝑒 1 𝑝𝑎𝑟𝑎 𝑣𝑜𝑙𝑣𝑒𝑟 𝑎𝑙 𝑚𝑒𝑛𝑢́ 𝑝𝑟𝑖𝑛𝑐𝑖𝑝𝑎𝑙.");
        System.out.println(ANSI_PURPLE + "𝑃𝑟𝑒𝑠𝑖𝑜𝑛𝑒 2 𝑝𝑎𝑟𝑎 𝑠𝑎𝑙𝑖𝑟 𝑑𝑒𝑙 𝑗𝑢𝑒𝑔𝑜");
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
            System.out.printf("𝐿𝑎 𝑜𝑝𝑐𝑖𝑜́𝑛 " + opcion + " 𝑛𝑜 𝑒𝑠 𝑢𝑛𝑎 𝑜𝑝𝑐𝑖𝑜́𝑛 𝑣𝑎́𝑙𝑖𝑑𝑎");
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
            System.out.printf("𝐿𝑎 𝑜𝑝𝑐𝑖𝑜́𝑛 " + opcion + " 𝑛𝑜 𝑒𝑠 𝑢𝑛𝑎 𝑜𝑝𝑐𝑖𝑜́𝑛 𝑣𝑎́𝑙𝑖𝑑𝑎");
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
        // this.personajes.add(muggle);
        return muggle;
    }

    public Elfo crearPersonajeElfo() {
        Elfo elfo = new Elfo("Elfo-Chabri", 50, 15, "Gris");
        elfo.setEnergiaMagica(150);// Revisar
        this.personajes.add(elfo);
        return elfo;
    }

    public Wizard crearPersonajeWizard() {
        Wizard wizard = new Wizard("Wizard-Mari", 75, 12, "Verde");
        wizard.setEnergiaMagica(150);// Revisar
        wizard.setArtefacto(CapaInvisibilidad());// falta instanciar
        // wizard.aprenderHechizoRandom(); // Devuelve un hechizo random /// VERIFICAR
        // this.personajes.add(wizard);
        return wizard;
    }

    public WizardOscuro crearWizardOscuro() {
        WizardOscuro wizardOscuro = new WizardOscuro("Wizard-Luli", 60, 42, "Azul");
        wizardOscuro.setEnergiaMagica(150);// Revisar
        wizardOscuro.setArtefacto(Horrocrux());// falta instanciar
        // wizardOscuro.setHechizo(aprenderHechizoRandom());
        // this.personajes.add(wizardOscuro);
        return wizardOscuro;
    }

    // Instanciamos Hechizos: Modelo del constructor:
    // public Hechizo(int nivelDanio, int nivelCuracion, int energiaMagica, int
    // energiaUtilizada)

    public SectumSempra SectumSempra() {
        SectumSempra SectumSempra = new SectumSempra(30, 0, 15, 24);
        SectumSempra.setDescripcionDelPoder("Su efecto es el equivalente al de un cuchillo invisible");
        this.hechizos.add(SectumSempra);
        return SectumSempra;
    }

    public VulneraSanentur VulneraSanentur() {
        VulneraSanentur VulneraSanentur = new VulneraSanentur(0, 30, 10, 10);
        VulneraSanentur.setDescripcionDelPoder("Sana heridas profundas");
        this.hechizos.add(VulneraSanentur);
        return VulneraSanentur;
    }

    public WingwardumLeviosa WingwardumLeviosa() {
        WingwardumLeviosa WingwardumLeviosa = new WingwardumLeviosa(10, 0, 1, 5);
        WingwardumLeviosa.setDescripcionDelPoder("Hace que el enemigo vuele o levite");
        return WingwardumLeviosa;
    }

    public Cavelnimicum Cavelnimicum() {
        Cavelnimicum Cavelnimicum = new Cavelnimicum(25, 5, 5, 10);
        Cavelnimicum.setDescripcionDelPoder("Hace que el enemigo sienta que se está cayendo por un precipicio");
        this.hechizos.add(Cavelnimicum);
        return Cavelnimicum;
    }

    public HechizoCuracion Anapneo() {
        HechizoCuracion Anapneo = new HechizoCuracion(5, 30, 5, 6);
        Anapneo.setDescripcionDelPoder("Despeja las vías respiratorias de una persona");
        // this.hechizos.add(Anapneo);
        return Anapneo;
    }

    public Hechizo Alarteascendare() {
        Hechizo Alarteascendare = new Hechizo(0, 30, 1, 5);
        Alarteascendare.setDescripcionDelPoder("Este hechizo eleva a su objetivo por los aires");
        // this.hechizos.add(Alarteascendare);
        return Alarteascendare;
    }

    public HechizoDefensa Salviohexia() {
        HechizoDefensa Salviohexia = new HechizoDefensa(0, 30, 15, 20);
        Salviohexia.setDescripcionDelPoder("Permite proteger de encantamientos oscuros una zona");
        this.hechizos.add(Salviohexia);
        return Salviohexia;
    }

    public HechizoAtaque Melofors() {
        HechizoAtaque Melofors = new HechizoAtaque(20, 0, 10, 10);
        Melofors.setDescripcionDelPoder("Envuelve la cabeza del enemigo con una calabaza");
        this.hechizos.add(Melofors);
        return Melofors;
    }

    public HechizoCuracion Episkey() {
        HechizoCuracion Episkey = new HechizoCuracion(2, 17, 1, 5);
        Episkey.setDescripcionDelPoder("Cura heridas");
        // this.hechizos.add(Episkey);
        return Episkey;
    }

    public HechizoOcio Rictusempra() {
        HechizoOcio Rictusempra = new HechizoOcio(10, 0, 1, 5);
        Rictusempra.setDescripcionDelPoder("Genera cosquillas en la víctima");
        // this.hechizos.add(Rictusempra);
        return Rictusempra;
    }

    // Método para aprender un hechizo random:

    public Hechizo obtenerHechizoRandom() {

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
    // super(nombre, amplificadorDeDanio, amplificadorDeCuracion):

    public CapaInvisibilidad CapaInvisibilidad() {
        CapaInvisibilidad CapaInvisibilidad = new CapaInvisibilidad("Capa de invisibilidad", 0.1, 0.5);
        return CapaInvisibilidad;
    }

    public PiedraResurreccion PiedraResurreccion() {
        PiedraResurreccion PiedraResurreccion = new PiedraResurreccion("Piedra Resurrección", 0.1, 0.5);
        return PiedraResurreccion;
    }

    public VaritaSauco VaritaSauco() {
        VaritaSauco VaritaSauco = new VaritaSauco("VaritaSauco", 0.6, 0.2);
        return VaritaSauco;
    }

    public Horrocrux Horrocrux() {
        Horrocrux Horrocrux = new Horrocrux("Horrocrux", 0.6, 0.2);
        return Horrocrux;
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

    // Método que permite Jugar // FALTA DESARROLLO
    public void jugar() {
        System.out.println(ANSI_CYAN
                + "═════════════════════════════════════════════════════════════════════════════════════════");
        System.out.println(ANSI_PURPLE + "𝑰𝒏𝒊𝒄𝒊𝒂𝒍𝒊𝒛𝒂𝒏𝒅𝒐 𝒆𝒍 𝒋𝒖𝒆𝒈𝒐");
        System.out.println(ANSI_CYAN
                + "═════════════════════════════════════════════════════════════════════════════════════════");
        elegirPersonaje();
    }

    public Hechizo elegirHechizo() {
        System.out.println(
                ANSI_CYAN + "𝐄𝐥𝐢𝐣𝐚 𝐞𝐥 𝐧𝐮́𝐦𝐞𝐫𝐨 𝐝𝐞 𝐡𝐞𝐜𝐡𝐢𝐳𝐨 𝐪𝐮𝐞 𝐪𝐮𝐢𝐞𝐫𝐞 𝐮𝐭𝐢𝐥𝐢𝐳𝐚𝐫:");

        int contador = 1;
        for (Hechizo hechizo : this.hechizos) {
            System.out.println(contador + ")" + hechizo.getNombreDelPoder());
            contador++;
        }

        int opcion = 0;
        opcion = Teclado.nextInt();
        Teclado.nextLine();
        return this.hechizos.get(opcion - 1);
    }

    public Wizard crearWizard() {
        Wizard p1 = new Wizard("Julieta", 100, 12, ANSI_WHITE);
        p1.setEnergiaMagica(150);
        p1.setArtefacto(CapaInvisibilidad());
        // p1.setPoderInicial(Metamorfosis());
        p1.aprender(Melofors());
        return p1;
    }

    public Elfo crearElfo() {
        Elfo p2 = new Elfo("Elfo-Chabri", 100, 15, ANSI_BLUE);
        p2.setEnergiaMagica(150);// Revisar
        // p2.setPoderInicial(Invisibilidad());
        p2.setArtefacto(CapaInvisibilidad());
        p2.aprender(Rictusempra());
        return p2;
    }

    public void combate() {
        // crear variable atacante oponente
        Personaje personaje1 = crearWizard();
        Personaje personaje2 = crearElfo();

        Personaje atacante;
        Personaje oponente;

        boolean turnoP1 = true;

        System.out.println(ANSI_CYAN
                + "═════════════════════════════════════════════════════════════════════════════════════════");
        System.out.println(ANSI_PURPLE + "𝑪𝒐𝒎𝒊𝒆𝒏𝒛𝒂 𝒆𝒍 𝒄𝒐𝒎𝒃𝒂𝒕𝒆");
        System.out.println(ANSI_CYAN
                + "═════════════════════════════════════════════════════════════════════════════════════════");
        // while(personaje1.estaVivo() && personaje2.estaVivo()) {
        do {

            if (turnoP1) {
                atacante = personaje1;
                oponente = personaje2;
            } else {
                atacante = personaje2;
                oponente = personaje1;
            }

            // System.out.println(atacante.getColor() + atacante.getNombre() + " ataca a " +
            // oponente.getNombre());
            // aca se atacan
            /*
             * if (atacante instanceof IHaceMagia){ IHaceMagia magico =
             * (IHaceMagia)atacante; // esta linea es castear magico.atacar(oponente,
             * obtenerHechizoRandom()); } // equivalente a las lineas de 478 a 486
             */
            if (atacante instanceof Wizard) {
                Wizard magico = (Wizard) atacante; // esta linea es castear
                magico.atacar(oponente, elegirHechizo());
                System.out.println(ANSI_YELLOW + magico.getNombre() + " utilizó " + elegirHechizo().getNombreDelPoder());
                
            }

            if (atacante instanceof Elfo) {
                Elfo magico = (Elfo) atacante; // esta linea es castear
                magico.atacar(oponente, obtenerHechizoRandom());
                System.out.println(ANSI_RED + magico.getNombre() + " utilizó " + obtenerHechizoRandom().getNombreDelPoder());
                
            }

            System.out.println("A " + oponente.getNombre() + " le queda " + oponente.getSalud() + " de salud");
            // CAMBIAR TURNO
            turnoP1 = !turnoP1; // Aca cambia turno

            // chabri
            boolean turnoP2 = true; // chabri

            if (turnoP2) {
                atacante = personaje2;
               oponente = personaje1;
            } else {
                atacante = personaje1;
                oponente = personaje2;
            }

            System.out.println(atacante.getColor() + atacante.getNombre() + " ataca a " +
             oponente.getNombre());
            // aca se atacan
            if (atacante instanceof Wizard) {
                Wizard magico = (Wizard) oponente; // esta linea es castear
                magico.atacar(oponente, elegirHechizo());
            }

            if (atacante instanceof Elfo) {
                Elfo magico = (Elfo) atacante; // esta linea es castear
                magico.atacar(oponente, obtenerHechizoRandom());
            }
            System.out.println("A " + oponente.getNombre() + " le queda " + oponente.getSalud() + " de salud");
            turnoP2 = !turnoP2;
            // chabri
            // Pausa el programa por 2 segundos(2000 milisegundos = 2 segundos)
            // Thread.sleep(3000);

            /*
             * if (personaje1.getSalud() > 0) { System.out.println(personaje1.getColor() +
             * personaje1.getNombre() + " ganó!!!"); } else {
             * System.out.println(personaje2.getColor() + personaje2.getNombre() +
             * " ganó!!!"); }
             */

        } while (personaje1.estaVivo() && personaje2.estaVivo());

        if (personaje1.getSalud() == 0) { // modificado por sabri era: personaje1.getSalud > 0
            System.out.println(personaje2.getColor() + personaje2.getNombre() + " ganó!!!");
        } else if (personaje2.getSalud() == 0) { // agrego else if
            System.out.println(personaje1.getColor() + personaje1.getNombre() + " ganó!!!");
        }
    }

    public Artefacto obtenerArtefactoRandom() {

        int max = this.artefactos.size();
        int min = 1;

        int random = (int) (Math.random() * ((max - min) + 1)) + min;
        return this.artefactos.get(random - 1);

    }

}
