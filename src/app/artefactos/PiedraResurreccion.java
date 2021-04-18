package app.artefactos;
import app.poderes.*;
import app.interfaces.IReliquiaMuerte;

public class PiedraResurreccion extends Artefacto implements IReliquiaMuerte {
  
    public PiedraResurreccion (String nombre, double amplificadorDeDanio, double amplificadorDeCuracion, Poder poder)  {
        super(nombre, amplificadorDeDanio, amplificadorDeCuracion, poder);
    }

    public boolean esReliquiaMuerte() {
        // generar metodo para definir si es reliquia
        return true;
    }

}
