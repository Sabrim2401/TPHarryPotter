package app.artefactos;

import app.poderes.*;
import app.interfaces.IReliquiaMuerte;

public class CapaInvisibilidad extends Artefacto implements IReliquiaMuerte {

    public CapaInvisibilidad(String nombre, double amplificadorDeDanio, double amplificadorDeCuracion) {
        super(nombre, amplificadorDeDanio, amplificadorDeCuracion);
    }

    // Se plantean dos opciones de metodos para esReliquiaMuerte
    // Revisar cual es correcta
    @Override
    public boolean esReliquiaMuerte(boolean esReliquia) {
        esReliquia = true;
        if (esReliquia == true) {

            return true;
        }

    }

    // @Override
    // public boolean esReliquiaMuerte(String nombre) {
    //// boolean esReliquia = true;
    // if (getNombre().equals(Horrocrux)) {

    // return false;
    // }
    // return true;

    // }

}
