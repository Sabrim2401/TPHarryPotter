package app.transportes;

import app.interfaces.*;

public class TrenExpresoHowards extends Transporte implements IEsMagico {

    public TrenExpresoHowards(int duracionDelRecorrido, String nombre) {
        super(duracionDelRecorrido, nombre);
    }

    @Override
    public boolean esInvisibleAMuggles() {
        return true;
    }

    @Override
    public boolean esInvisible() {
        return false;
    }
}
