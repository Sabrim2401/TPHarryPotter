package app.poderes.hechizos;

import app.poderes.Poder;

public class Hechizo extends Poder {

    public Hechizo(int nivelDanio, int nivelCuracion, int energiaMagica, int energiaUtilizada){
     
        this.nivelDanio = nivelDanio;
        this.nivelCuracion = nivelCuracion;
        this.energiaMagica = energiaMagica;
        this.energiaUtilizada = energiaUtilizada;
    }    


    private int nivelDanio;
    private int nivelCuracion;
    private int energiaMagica;
    private int energiaUtilizada; // ej: invisibilidad gasta 30% de poder, 100-30=70 %
    // le queda de energia al jugador

    // NIVEL DANIO

    public int getNivelDanio() {
        return this.nivelDanio;
    }

    public void setNivelDanio(int nivelDanio) {
        this.nivelDanio = nivelDanio;
    }

    /// NIVEL CURACION

    public int getNivelCuracion() {
        return this.nivelCuracion;
    }

    public void setNivelCuracion(int nivelCuracion) {
        this.nivelCuracion = nivelCuracion;
    }

    /// ENERGIA MAGICA

    public int getEnergiaMagica() {
        return this.energiaMagica;
    }

    public void setEnergiaMagica(int energiaMagica) {
        this.energiaMagica = energiaMagica;
    }

    // ENERGIA UTILIZADA
    public int getEnergiaUtilizada() {
        return this.energiaUtilizada;
    }

    public void setEnergiaUtilizada(int energiaUtilizada) {
        this.energiaUtilizada = energiaUtilizada;
    }

    public boolean esOscuro() {
        // crear metodo
        return true;
    }

}