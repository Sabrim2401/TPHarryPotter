package app.interfaces;

import app.poderes.Poder;

public interface IHaceMagia {
    
    int getEnergiaMagica();

    void setEnergiaMagica(int energiaMagica);

    int getPoderInicial();

    void setPoder(Poder poder);

    Artefacto getArtefacto();

    void aprender(Hechizo h);

    void atacar(Personaje personaje, Hechizo hechizo);

    void atacar(Personaje personaje, String hechizo);
    
}
