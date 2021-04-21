package app.transportes;

import app.interfaces.IEsMagico;

public class Escoba extends Transporte implements IEsMagico {

    public Escoba(int duracionDelRecorrido, String nombre) {
        super(duracionDelRecorrido, nombre);
    }

    @Override
    public boolean esInvisibleAMuggles() {
        return true;
    }

    @Override
    public boolean esInvisible() {
        return true;
    }

}
