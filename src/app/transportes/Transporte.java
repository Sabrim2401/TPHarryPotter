package app.transportes;

import java.util.*;

public class Transporte {

    public Transporte(int duracionDelRecorrido, String nombre) {
        this.nombre = nombre;
        this.duracionDelRecorrido = duracionDelRecorrido;
    }
    private String nombre;
    private int duracionDelRecorrido;
    public List<Transporte> transportes = new ArrayList<>();

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracionDelRecorrido() {
        return this.duracionDelRecorrido;
    }

    public void setDuraciondelRecorrido(int duracionDelRecorrido) {
        this.duracionDelRecorrido = duracionDelRecorrido;

    }

}
