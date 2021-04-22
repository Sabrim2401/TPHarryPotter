package app.personajes;

import app.interfaces.IEsMagico;

public abstract class Criatura extends Personaje implements IEsMagico {

    public Criatura(String nombre, int salud, int golpe, String color) {
        super(nombre, salud, golpe, color);
    }

    @Override
    public boolean esInvisibleAMuggles() {
        return false;
    }

    @Override
    public boolean esInvisible() {
        return false;
    }
}