package app.transportes;

import app.interfaces.IEsMagico;

public class Escoba extends Transporte implements IEsMagico {

    public Escoba(int duracionDelRecorrido, String nombre) {
        super(duracionDelRecorrido,nombre);
    }

    public boolean esInvisibleAMuggles() {
        return true;
    }
    public boolean esInvisible() {
        return true;
    }

}
