package app.artefactos;

import app.interfaces.IReliquiaMuerte;

public class Horrocrux extends Artefacto implements IReliquiaMuerte {

    @Override

    public boolean esReliquiaMuerte() {
        //
        return true;
    }

}
