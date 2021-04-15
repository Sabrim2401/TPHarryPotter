package app.personajes;

public abstract class Personaje {

    private String nombre;
    private int salud;// max 100
    private int edad;
    private int golpe; // fuerza con la que golpea
    private String color; // color del personaje para diferenciarlo

    // Método. Habría que armarlo.

    // Getters y Setters de los atributos

    // Nombre
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Salud
    public int getSalud() {
        return this.salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    // Edad
    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Golpe
    public int getGolpe() {
        return this.golpe;
    }

    public void setGolpe(int golpe) {
        this.golpe = golpe;
    }

    // Golpe
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean estaVivo(int salud) {
        int estaVivo = 1;
        if (salud > 1 && salud < 100) {
            return true;
        }
        return false;
    }

}