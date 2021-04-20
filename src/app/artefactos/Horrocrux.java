package app.artefactos;
import app.poderes.*;
import app.interfaces.IReliquiaMuerte;

public class Horrocrux extends Artefacto implements IReliquiaMuerte {

    public Horrocrux (String nombre, double amplificadorDeDanio, double amplificadorDeCuracion)  {
        super(nombre, amplificadorDeDanio, amplificadorDeCuracion);
    }

    // ¿ @Override ? consultar
    public boolean esReliquiaMuerte() {
        // generar funcion
        return true;
    }

}
