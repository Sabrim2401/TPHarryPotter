package app.artefactos;

import app.poderes.*;
import app.interfaces.IReliquiaMuerte;

public class VaritaSauco extends Varita implements IReliquiaMuerte {

    public VaritaSauco(String nombre, double amplificadorDeDanio, double amplificadorDeCuracion) {
        super(nombre, amplificadorDeDanio, amplificadorDeCuracion);
    }

    @Override
    public boolean esReliquiaMuerte() {
        return true;
    }

}
