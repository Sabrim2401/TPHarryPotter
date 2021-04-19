package app.personajes;
import app.interfaces.IEsMagico;
public abstract class Criatura extends Personaje implements IEsMagico {

    public Criatura (String nombre, int salud, int golpe, String color) {
        super(nombre, salud, golpe, color);
    }

    public boolean esInvisibleAMuggles(){
        return true;
    }
 
    public boolean esInvisible() {
        return true;
    }
 }