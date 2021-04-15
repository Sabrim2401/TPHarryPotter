package app.personajes;
import app.interfaces.IEsMagico;
import app.poderes.Poder;



public class Criatura extends Personaje implements IEsMagico {

    private int energiaMagica;
    private Object Poder;

    public boolean esInvisibleAMuggles(){
        return true;
    }
 
    public boolean esInvisible() {
        return true;
    }


 }