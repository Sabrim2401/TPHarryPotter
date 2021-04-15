package app.personajes;
import app.interfaces.IEsMagico;
import app.poderes.Poder;

public class Criatura extends Personaje implements IEsMagico {

    private int energiaMagica;
    private Object Poder;


    @Override
    public int getEnergiaMagica() {
        return this.energiaMagica;
    }

    @Override
    public void setEnergiaMagica(int energiaMagica) {
        this.energiaMagica = energiaMagica;
    }

    /* @Override
     public int getPoderInicial(); */


    @Override
    public void setPoder(Poder poder) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int getPoderInicial() {
        // TODO Auto-generated method stub
        return 0;
    }


 }