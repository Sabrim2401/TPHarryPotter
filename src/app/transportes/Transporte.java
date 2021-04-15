package app.transportes;

import app.Tansporte.transportes;
public class Transporte  {

    public Transporte(int duracionDelRecorrido, String nombre){

        this.nombre = nombre;
        this.duracionDelRecorrdio = duracionDelRecorrido;
    }

    private String nombre;
    private int duracionDelRecorrido;

    private List<Transporte>transportes = new ArrayList<>();

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getDuracionDelrecorrido(){
        return this.duracinDelRecorrido;
    }

    public void setDuraciondelRecorrdio(int duracionDelRecorrido){
        this.duracionDelRecorrdo = duracionDelRecorrdio;

    }


     

}
