package app.poderes.hechizos;

import app.poderes.Poder;

public class Hechizo extends Poder {
    public int nivelDanio;
    public int nivelCuracion;
    public int energiaMagica;
    public int duracionHechizo; // ¿ este va ? ¿ en que influye el tiempo ? chabri
    public int energiaUtilizada; // ej: invisibilidad gasta 30% de poder, 100-30=70 %
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

    // DURACION HECHIZO

    public int getDuracioHechizo() {
        return this.duracionHechizo;
    }

    public void setDuracionHechizo(int duracionHechizo) {
        this.duracionHechizo = duracionHechizo;
    }

    // ENERGIA UTILIZADA
    public int getEnergiaUtilizada() {
        return this.energiaUtilizada;
    }

    public void setEnergiaUtilizada(int energiaUtilizada) {
        this.energiaUtilizada = energiaUtilizada;
    }

    public boolean hacerHechizo() {
        /* 
        
        */
        return true;
    }

    public boolean esOscuro() {
        // crear metodo
        return true;
    }

}