
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

    }

    @Override
    public void atacar(Personaje personaje, String hechizo) {

    }
    /// no se si esta bien brenda
    /*
     * public Boolean esMagoOscuro(){ if
     * (Wizard.hechizo.septumSempra.equals(esMagoOscuro())); return true; }
     */

}