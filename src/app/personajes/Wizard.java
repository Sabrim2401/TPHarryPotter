
package app.personajes;

import app.artefactos.*;
import app.interfaces.IHaceMagia;
import app.poderes.Poder;
import app.poderes.hechizos.*;
import app.transportes.*;
import java.util.*;

public class Wizard extends Persona implements IHaceMagia {

    public Wizard (String nombre, int salud, int golpe, String color) {
        super(nombre, salud, golpe, color);
    }

    private int energiaMagica;
    private List<Hechizo> hechizos = new ArrayList<>();
    private Escoba escoba; 
    private Poder poderInicial; 
    private Poder poder;
    private Artefacto artefacto;
    private boolean magoOscuro;

    public int getEnergiaMagica() {
        return this.energiaMagica;
    }
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

    public Artefacto getArtefacto() {
        return this.artefacto;
    }

    public void setArtefacto(Artefacto artefacto) {
        this.artefacto = artefacto;
    }
    // poder

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

    public void setPoder(Poder poder) {
        this.poder = poder;
    }

    public void aprender(Hechizo h) {

    }

    public void atacar(Personaje personaje, Hechizo hechizo) {
        
    }

    public void atacar(Personaje personaje, String hechizo) {

    }

}