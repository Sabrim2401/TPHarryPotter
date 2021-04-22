package app.artefactos;

import app.interfaces.IReliquiaMuerte;

public class CapaInvisibilidad extends Artefacto implements IReliquiaMuerte {

    public CapaInvisibilidad(String nombre, double amplificadorDeDanio, double amplificadorDeCuracion) {
        super(nombre, amplificadorDeDanio, amplificadorDeCuracion);
    }

    @Override
    public boolean esReliquiaMuerte() {
        return true;

    }

}
