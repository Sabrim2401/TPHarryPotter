
package app.personajes;

import app.artefactos.*;
import app.interfaces.IHaceMagia;
import app.poderes.Poder;
import app.poderes.hechizos.*;
import app.transportes.*;
import java.util.*;

public class Wizard extends Persona implements IHaceMagia {

    private int energiaMagica;
    private List<Hechizo> hechizos = new ArrayList<>();
    private Escoba escoba; // bren lo modifica
    private Poder poderInicial; // get y set en clase Poder
    private Artefacto artefacto;
    private boolean magoOscuro;

    // Salud Hecho por Bren

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

    // mago oscuro x Bren


    public Boolean getMagoOscuro() {
        return this.magoOscuro;
    }

    public void setMagoOscuro(Boolean magoOscuro) {
        this.magoOscuro = magoOscuro;
    }

    /* /*    abstract int getEnergiaMagica(); HECHO

    abstract void setEnergiaMagica(int energiaMagica); HECHO

    abstract int getPoderInicial(); HECHO

    abstract void setPoder(Poder poder);

    abstract Artefacto getArtefacto();

    abstract void aprender(Hechizo h);

    abstract void atacar(Personaje personaje, Hechizo hechizo);

    abstract void atacar(Personaje personaje, String hechizo);  */
    
}