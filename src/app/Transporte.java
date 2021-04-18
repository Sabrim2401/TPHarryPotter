package app.transportes;

import java.util.*;

public class Transporte {

    public Transporte(int duracionDelRecorrido, String nombre) {

        this.nombre = nombre;
        this.duracionDelRecorrido = duracionDelRecorrido;
    }

    public Transporte() {

    }

    private String nombre;
    private int duracionDelRecorrido;

    private List<Transporte> transportes = new ArrayList<>();

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracionDelrecorrido() {
        return this.duracionDelRecorrido;
    }

    public void setDuraciondelRecorrdio(int duracionDelRecorrido) {
        this.duracionDelRecorrido = duracionDelRecorrido;

    }

}
