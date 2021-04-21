package app.artefactos;

import app.poderes.*;
import app.interfaces.IReliquiaMuerte;

public class PiedraResurreccion extends Artefacto implements IReliquiaMuerte {

    public PiedraResurreccion(String nombre, double amplificadorDeDanio, double amplificadorDeCuracion) {
        super(nombre, amplificadorDeDanio, amplificadorDeCuracion);

    }

    public int esReliquia = 1;

    @Override
    public boolean esReliquiaMuerte(int esReliquia) {
        if (esReliquia == 1) {
        }
        return true;
    }

}
