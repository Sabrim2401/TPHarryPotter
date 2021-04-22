package app.artefactos;

import app.poderes.*;
import app.interfaces.IReliquiaMuerte;

public class PiedraResurreccion extends Artefacto implements IReliquiaMuerte {

    public PiedraResurreccion(String nombre, double amplificadorDeDanio, double amplificadorDeCuracion) {
        super(nombre, amplificadorDeDanio, amplificadorDeCuracion);

    }

    
    @Override
    public boolean esReliquiaMuerte() {
        return true;
    }

}
