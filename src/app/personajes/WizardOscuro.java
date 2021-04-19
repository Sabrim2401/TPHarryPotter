package app.personajes;
// SOLO PUEDE ATACAR y USAR ARTEFACTO
/* Cuando un mago que no es oscuro y utiliza 
un hechizo oscuro, se convertirá automáticamente en un mago oscuro y el
nivel de daño/curación del hechizo se multiplicara por 2(1 sola vez). */

public class WizardOscuro extends Wizard{
  
    public WizardOscuro (String nombre, int salud, int golpe, String color) {
        super(nombre, salud, golpe, color);
    }
   

}