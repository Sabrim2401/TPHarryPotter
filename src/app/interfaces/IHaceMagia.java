package app.interfaces;
import app.personajes.*;
import app.poderes.hechizos.*;
import app.poderes.Poder;
import app.artefactos.*;

public interface IHaceMagia {
    
    abstract int getEnergiaMagica();

    abstract void setEnergiaMagica(int energiaMagica);

    abstract int getPoderInicial();

    abstract void setPoder(Poder poder);

    abstract Artefacto getArtefacto();

    abstract void aprender(Hechizo h);

    abstract void atacar(Personaje personaje, Hechizo hechizo);

    abstract void atacar(Personaje personaje, String hechizo);
    
}
