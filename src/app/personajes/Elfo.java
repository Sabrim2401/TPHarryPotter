package app.personajes;

import java.util.*;
import app.poderes.hechizos.*;
import app.poderes.Poder;
import app.interfaces.IHaceMagia;
import app.artefactos.*;

public class Elfo extends Criatura implements IHaceMagia {

   public Elfo(String nombre, int salud, int golpe, String color) {
      super(nombre, salud, golpe, color);
   }
   private int energiaMagica;
   private List<Hechizo> hechizos = new ArrayList<>();
   private Poder poderInicial;
   private Poder poder;
   private Artefacto artefacto;

   // Salud

   public int getEnergiaMagica() {
      return this.energiaMagica;
   }

   public void setEnergiaMagica(int energiaMagica) {
      this.energiaMagica = energiaMagica;
   }
   // poder inicial

   public Poder getPoderInicial() {
      return this.poderInicial;
   }

   public void setPoderInicial(Poder poderInicial) {
      this.poderInicial = poderInicial;
   }

   // poder
   public void setPoder(Poder poder) {
      this.poder = poder;
   }

   // Artefecto
   public Artefacto getArtefacto() {
      return this.artefacto;
   }

  public void setArtefacto(Artefacto artefacto) {
      this.artefacto = artefacto;
   }

   public void aprender(Hechizo h) {
      // generar metodo
   }

   public void atacar(Personaje personaje, Hechizo hechizo) {
      // generar metodo
   }

   public void atacar(Personaje personaje, String hechizo) {
      // generar metodo

   }

}
