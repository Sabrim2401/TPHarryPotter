
package app.personajes;

import app.artefactos.*;
import app.interfaces.IHaceMagia;
import app.poderes.Poder;
import app.poderes.hechizos.*;
import app.transportes.*;
import java.util.*;

public class Wizard extends Persona implements IHaceMagia {

    public void Aprender(Hechizo h) {

    }

    public void Atacar(Personaje personaje, Hechizo hechizo) {
        
    }

    public void Atacar(Personaje personaje, String hechizo) {

    }

    private int energiaMagica;
    private List<Hechizo> hechizos = new ArrayList<>();
    private Escoba escoba; // bren lo modifica
    private Poder poderInicial; // get y set en clase Poder
    private Poder poder;
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

    // mago oscuro

    public Boolean getMagoOscuro() {
        return this.magoOscuro;
    }

    public void setMagoOscuro(Boolean magoOscuro) {
        this.magoOscuro = magoOscuro;
    }

    // poder ARREGLAR
    public void setPoder(Poder poder) {
        this.poder = poder;
    }

}