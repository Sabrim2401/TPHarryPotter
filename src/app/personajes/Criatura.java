package app.personajes;
import app.interfaces.IEsMagico;
public class Criatura extends Personaje implements IEsMagico {
  //  ¿ revisar super constructor ?
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