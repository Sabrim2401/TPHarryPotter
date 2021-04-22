package app.transportes;

import org.graalvm.compiler.phases.common.FloatingReadPhase;

import app.interfaces.IEsMagico;

public class Escoba extends Transporte implements IEsMagico {

    public Escoba(int duracionDelRecorrido, String nombre) {
        super(duracionDelRecorrido, nombre);
    }

    @Override
    public boolean esInvisibleAMuggles() {
        return false;
    }

    @Override
    public boolean esInvisible() {
        return false;
    }

}
