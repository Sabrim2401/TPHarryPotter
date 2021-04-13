package app.personajes;

public abstract class Personaje {

   
    public String nombre;
    public int salud;//max 100
    public int edad;

    // Método. Habría que armarlo.

     
    
    // Getters y Setters de los atributos

    //Nombre

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    // Salud

    public int getSalud(){
        return this.salud;
    }

    public void setSalud(int salud){
        this.salud = salud;
    }

    // Edad

    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }




    
}
