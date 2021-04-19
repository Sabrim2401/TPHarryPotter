package app.personajes;
import app.artefactos.*;
public class Squibs extends Persona {

    //SOLO PUEDE RECIBIR ATAQUE


    public Squibs (String nombre, int salud, int golpe, String color) {
        super(nombre, salud, golpe, color);
    }
   
    private Artefacto artefacto; 

    //Getter y Setter
    public Artefacto getArtefacto() {
        return this.artefacto;
    }

    public void setArtefacto(Artefacto artefacto) {
        this.artefacto = artefacto;
    }
}    