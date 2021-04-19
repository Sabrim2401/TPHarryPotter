package app.interfaces;

import app.personajes.*;
import app.poderes.hechizos.*;
import app.poderes.Poder;
import app.artefactos.*;
// SOLO PUEDE ATACAR
public interface IHaceMagia {

    int getEnergiaMagica();

    void setEnergiaMagica(int energiaMagica);

    Poder getPoderInicial();

    void setPoder(Poder poder);

    Artefacto getArtefacto();

    void aprender(Hechizo h);

    void atacar(Personaje personaje, Hechizo hechizo);

    void atacar(Personaje personaje, String hechizo);

}
