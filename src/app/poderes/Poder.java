package app.poderes;

public class Poder {
    private String nombreDelPoder;
    private String descripcionDelPoder;
    private int poderInicial;

    public String getNombreDelPoder() {
        return this.nombreDelPoder;
    }

    public void setDescripcionDelPoder(String descripcionDelPoder) {
        this.descripcionDelPoder = descripcionDelPoder;
    }

    public int getPoderInicial() {
        return this.poderInicial;
    }

    public void setPoderInicial(int poderInicial) {
        this.poderInicial = poderInicial;
    }
}
