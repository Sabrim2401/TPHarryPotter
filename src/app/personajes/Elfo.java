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

   public Poder getPoderInicial(){
      return this.poderInicial;
   }

   public void setPoderInicial(Poder poderInicial) {
      this.poderInicial = poderInicial;
   }

   


/*  int getEnergiaMagica(); HECHO

    void setEnergiaMagica(int energiaMagica); HECHO

    int getPoderInicial(); HECHO

    void setPoder(Poder poder);

    Artefacto getArtefacto();

    void aprender(Hechizo h);

    void atacar(Personaje personaje, Hechizo hechizo);

    void atacar(Personaje personaje, String hechizo);  */

}
