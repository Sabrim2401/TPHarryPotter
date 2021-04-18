package app.artefactos;
import app.poderes.*;
import app.interfaces.IReliquiaMuerte;

public class CapaInvisibilidad extends Artefacto implements IReliquiaMuerte {

    public CapaInvisibilidad (String nombre, double amplificadorDeDanio, double amplificadorDeCuracion, Poder poder)  {
        super(nombre, amplificadorDeDanio, amplificadorDeCuracion, poder);
    }


    public boolean esReliquiaMuerte() {
        // funcion para definir si es reliquia -- revisar
        return true;
    }

}
