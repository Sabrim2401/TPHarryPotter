package app.personajes;

import java.util.*;
import app.poderes.hechizos.*;
import app.poderes.Poder;
import app.interfaces.IHaceMagia;

public class Elfo extends Criatura implements IHaceMagia {

   private int energiaMagica;
   private List<Hechizo> hechizos = new ArrayList<>();
   private Poder poderInicial;

   // Salud

   public int getEnergiaMagica() {
      return this.energiaMagica;
   }

   public void setEnergiaMagica(int energiaMagica) {
      this.energiaMagica = energiaMagica;
   }
   // poder inicial

   public int getPoderInicial(){
      return this.poderInicial;
   }

   public void setPoderInicial(Poder poderInicial) {
      this.poderInicial = poderInicial;
   }

   


/*    abstract int getEnergiaMagica(); HECHO

    abstract void setEnergiaMagica(int energiaMagica); HECHO

    abstract int getPoderInicial(); HECHO

    abstract void setPoder(Poder poder);

    abstract Artefacto getArtefacto();

    abstract void aprender(Hechizo h);

    abstract void atacar(Personaje personaje, Hechizo hechizo);

    abstract void atacar(Personaje personaje, String hechizo);  */

}
