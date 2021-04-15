package app.transportes;

public class Escoba extends Transporte implements IEsMagico {

    @Override

    boolean esInvisibleAMuggles() {
        // logica
        return true;
    }

    @Override

    boolean esInvisible() {
        // logica
        return true;

    }
    // Hacen falta ambos esInvisible?
}
