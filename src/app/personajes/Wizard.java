
package app.personajes;

import app.artefactos.*;
import app.interfaces.IHaceMagia;
import app.poderes.Poder;
import app.poderes.hechizos.*;
import app.transportes.*;
import java.util.*;

// SOLO PUEDE ATACAR y USAR ARTEFACTO

/*Cada vez que un Wizard ataca a otro personaje, el daño total 
del hechizo que utilice se incrementara según el atributo
amplificadorDeDanio del artefacto que posea el atacante(si posee). 
El daño final a infligir en el atacado se vera afectado
por el atributo amplificadorDeCuracion del artefacto que posea
la victima del ataque(si posee). El calculo de ello y otros
factores se deja a libre creatividad.*/

/* ● Debe poder haber una pelea entre Wizard y Elfo. 
La forma de atacar de un Elfo se deja a libre interpretación.
 */

public class Wizard extends Persona implements IHaceMagia {

    public Wizard(String nombre, int salud, int golpe, String color) {
        super(nombre, salud, golpe, color);
    }

    private int energiaMagica;
    private List<Hechizo> hechizos = new ArrayList<>();
    private Escoba escoba;
    private Poder poderInicial;
    private Poder poder;
    private Artefacto artefacto;
    private boolean magoOscuro;



    @Override
    public int getEnergiaMagica() {
        return this.energiaMagica;
    }

    @Override
    public void setEnergiaMagica(int energiaMagica) {
        this.energiaMagica = energiaMagica;
    }

    // ESCOBA
    public Escoba getEscoba() {
        return this.escoba;
    }

    public void setEscoba(Escoba escoba) {
        this.escoba = escoba;
    }

    // ARTEFACTO
    @Override
    public Artefacto getArtefacto() {
        return this.artefacto;
    }

    public void setArtefacto(Artefacto artefacto) {
        this.artefacto = artefacto;
    }

    // poder
    @Override
    public Poder getPoderInicial() {
        return this.poderInicial;
    }

    public void setPoderInicial(Poder poderInicial) {
        this.poderInicial = poderInicial;
    }

    // mago oscuro
    public Boolean getMagoOscuro() {
        return this.magoOscuro;
    }

    public void setMagoOscuro(Boolean magoOscuro) {
        this.magoOscuro = magoOscuro;
    }

    public List<Hechizo> getHechizo() {
        return this.hechizos;
    }

    public void setHechizo(List<Hechizo> hechizos) {
        this.hechizos = hechizos;
    }

    // poder
    public Poder getPoder() {
        return this.poder;
    }

    @Override
    public void setPoder(Poder poder) {
        this.poder = poder;
    }

    @Override
    public void aprender(Hechizo h) {
        
    }

    @Override
    public void atacar(Personaje personaje, Hechizo hechizo) {
        int saludEnCombate = personaje.getSalud();
        int saludDuranteCombate = 0;
        int danioHechizo = hechizo.getNivelDanio();
      //  danioHechizo = (int) (danioHechizo * artefacto.getAmplificadorDeCuracion()); //calculos 115
        saludDuranteCombate = saludEnCombate - danioHechizo;
        personaje.setSalud(saludDuranteCombate);
    }


    /*public int CalcularDanioHechizo(){
        int dañoHechizo = elegirHechizo().getNivelDanio();
        double amplificadorDeCuracion = obtenerArtefactoRandom().getAmplificadorDeCuracion();
        int daniototal = (int) (dañoHechizo * amplificadorDeCuracion);
        System.out.println(obtenerArtefactoRandom().getNombre()+ "logró mitigar el impacto del ataque");
        return daniototal;
    }*/

    @Override
    public void atacar(Personaje personaje, String hechizo) {

     }

 
    /*
     * public Boolean esMagoOscuro(){ if
     * (Wizard.hechizo.septumSempra.equals(esMagoOscuro())); return true; }
     */

}