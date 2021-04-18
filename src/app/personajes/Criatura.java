package app.personajes;
import app.interfaces.IEsMagico;
import app.poderes.Poder;



public class Criatura extends Personaje implements IEsMagico {

    public Criatura (String nombre, int salud, int golpe, String color) {
        super(nombre, salud, golpe, color);
    }
   
    private int energiaMagica;
    private Object Poder;

    public boolean esInvisibleAMuggles(){
        return true;
    }
 
    public boolean esInvisible() {
        return true;
    }
   
   // energia magica

   public int getEnergiaMagica() {
    return this.energiaMagica;
    }

   public void setEnergiaMagica(int energiaMagica) {
    this.energiaMagica = energiaMagica;
    }

    //objeto poder
    // energia magica

   public Object getPoder() {
    return this.Poder;
    }

   public void setPoder(Object Poder) {
    this.Poder = Poder;
    }

 }