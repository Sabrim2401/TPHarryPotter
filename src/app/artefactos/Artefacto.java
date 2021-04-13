package app.artefactos;
import app.poderes.Poder;

public class Artefacto {
    private String nombre;
    private double amplificadorDeDanio;
    private double amplificadorDeCuracion;
    private Poder poder; // ¿ get y set ? sabri


    //nombre
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    //amplificador de danio
    public double getAmplificadorDeDanio (){
        return this.amplificadorDeDanio;
    }

    public void setAmplificadorDeDanio(double amplificadorDeDanio){
        this.amplificadorDeDanio = amplificadorDeDanio;
    }

    //amplificador de curacion
    public double getAmplificadorDeCuracion(){
        return this.amplificadorDeCuracion;
    }

    public void setAmplificadorDeCuracion (double amplificadorDeCuracion) {
        this.amplificadorDeCuracion = amplificadorDeCuracion;
    }

}
