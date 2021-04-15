package app.transportes;
import app.interfaces.IEsMagico;

public class Escoba extends Transporte implements IEsMagico {

    public boolean esInvisibleAMuggles(){
        return true;
    }
 
    public boolean esInvisible() {
        return true;
    }

}
