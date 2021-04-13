package app.interfaces;

import app.poderes.Poder;

public interface IEsMagico {
    
    int getEnergiaMagica();

    void setEnergiaMagica(int energiaMagica);

    int getPoderInicial();

    void setPoder(Poder poder);
}
