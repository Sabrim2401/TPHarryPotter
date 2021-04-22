package app.personajes;

import java.util.*;
import app.poderes.hechizos.*;
import app.poderes.Poder;
import app.interfaces.IHaceMagia;
import app.artefactos.*;

// SOLO PUEDE ATACAR Y TENER ARTEFACTO
//● Debe poder haber una pelea entre Wizard y Elfo. 
//La forma de atacar de un Elfo se deja a libre interpretación.

public class Elfo extends Criatura implements IHaceMagia {

   public Elfo(String nombre, int salud, int golpe, String color) {
      super(nombre, salud, golpe, color);
   }

   private int energiaMagica;
   private List<Hechizo> hechizos = new ArrayList<>();
   private Poder poderInicial;
   private Poder poder;
   private Artefacto artefacto;

   //Agrego setter y getter de hechizos

   public List<Hechizo> getHechizo() {
      return this.hechizos;
  }

  public void setHechizo(List<Hechizo> hechizos) {
      this.hechizos = hechizos;
  }

   // Salud
   @Override
   public int getEnergiaMagica() {
      return this.energiaMagica;
   }

   @Override
   public void setEnergiaMagica(int energiaMagica) {
      this.energiaMagica = energiaMagica;
   }

   // poder inicial
   @Override
   public Poder getPoderInicial() {
      return this.poderInicial;
   }

   // poder
   @Override
   public void setPoder(Poder poder) {
      this.poder = poder;
   }

   // Artefecto
   @Override
   public Artefacto getArtefacto() {
      return this.artefacto;
   }

   public void setArtefacto(Artefacto artefacto) {
      this.artefacto = artefacto;
   }

   @Override
   public void aprender(Hechizo h) {
      // generar metodo
   }

   @Override
   public void atacar(Personaje personaje, Hechizo hechizo) {
      int saludEnCombate = personaje.getSalud() - hechizo.getNivelDanio();
      personaje.setSalud(saludEnCombate);
   }

   @Override
   public void atacar(Personaje personaje, String hechizo) {
      // generar metodo

   }

}
