package app.personajes;


public class Personaje {
    public Personaje(String nombre, int salud, int golpe, String color) {
        this.nombre = nombre;
        this.salud = salud;
        this.golpe = golpe;
        this.color = color;
    }
   

    private String nombre;
    private int salud;
    private int edad;
    private int golpe; 
    private String color; 

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

    public boolean estaVivo(String nombre, int salud) {
        int estaVivo = 1;
        int saludMaxima= 100;
        if (salud > estaVivo && salud < saludMaxima){
            return true;
        }
        return false;
    }

}