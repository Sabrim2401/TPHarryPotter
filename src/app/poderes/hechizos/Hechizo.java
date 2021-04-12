package app.poderes.hechizos;

import app.poderes.Poder;

public class Hechizo extends Poder {
    public int nivelDanio;
    public int nivelCuracion;
    public int energiaMagica;
    public int duracionHechizo; // ¿ este va ? ¿ en que influye el tiempo ? chabri
    public int energiaUtilizada; // ej: invisibilidad gasta 30% de poder, 100-30=70 %
    // le queda de energia al jugador

    
    public boolean hacerHechizo () {
        /* 
        
        */
        return true;
    }

    public boolean esOscuro() {
        // crear metodo
        return true;
    }
}