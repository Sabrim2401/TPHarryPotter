package app.interfaces;

import app.poderes.Poder;

public interface IHaceMagia {
    
    int getEnergiaMagica();

    void setEnergiaMagica(int energiaMagica);

    int getPoderInicial();

    void setPoder(Poder poder);
    
}
