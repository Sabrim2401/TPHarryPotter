package app.artefactos;

import app.artefactos.Artefacto;
import app.interfaces.IReliquiaMuerte;

public class Horrocrux extends Artefacto implements IReliquiaMuerte {

    private int duracion; // en minutos
    private Artefacto artefacto = new Artefacto();
    private boolean IReliquiaMuerte;

    public int getDuracion() {
        return this.duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Artefacto getArtefacto() {
        return this.artefacto;
    }

    public void setArtefacto(Artefacto artefacto) {
        this.artefacto = artefacto;
    }

    public boolean getIReliquiaMuerte() {
        return true;
    }

    public void setIReliquiaMuerte(boolean IReliquiaMuerte) {
        this.IReliquiaMuerte = IReliquiaMuerte;
    }

    @Override

    public boolean esReliquiaMuerte() {
        //
        return true;
    }

}
