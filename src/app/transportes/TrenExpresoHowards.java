package app.transportes;

import app.interfaces.*;

public class TrenExpresoHowards extends Transporte implements IEsMagico {

    public TrenExpresoHowards(int duracionDelRecorrido, String nombre) {
        super(duracionDelRecorrido,nombre);
    }
    
    public boolean esInvisibleAMuggles() {
        return true;
    }

    public boolean esInvisible() {
        return true;
    }
}
