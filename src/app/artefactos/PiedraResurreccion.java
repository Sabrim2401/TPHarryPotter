package app.artefactos;

import app.interfaces.IReliquiaMuerte;

public class PiedraResurreccion extends Artefacto implements IReliquiaMuerte {

    private int duracion; //en minutos
    private Artefacto artefacto = new Artefacto();
    private boolean IReliquiaMuerte;

    public int getDuracion() {
        return this.duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public in getArtefacto() {
        return this.artefacto;
    }
    public void setArtefacto(int artefacto) {
        this.artefacto = artefacto;
    }
    
    public int getIReliquiaMuerte() {
        return this.IRelquiaMuerte;
    }
    public void setEsReliquiaMuerte(boolean IReliquiaMuerte) {
        this.IReliquiaMuerte = IReliquiaMuerte;
    }

    
@Override

    @Override
    public boolean esReliquiaMuerte() {
        //
        return true;
    }

}
