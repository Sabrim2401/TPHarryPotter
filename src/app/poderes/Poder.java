package app.poderes;

public class Poder {

    public Poder(){
 
    }    

    private String nombreDelPoder;
    private String descripcionDelPoder;
    private int poderInicial;
    private int poder;

    // poder
    public int getPoder() {
        return this.poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    // nombre del poder
    public String getNombreDelPoder() {
        return this.nombreDelPoder;
    }

    public void setNombreDelPoder(String nombreDelPoder) {
        this.nombreDelPoder = nombreDelPoder;
    }

    // descripcion del poder

    public String getDescripcionDelPoder() {
        return this.descripcionDelPoder;
    }

    public void setDescripcionDelPoder(String descripcionDelPoder) {
        this.descripcionDelPoder = descripcionDelPoder;
    }

    // poder inicial
    public int getPoderInicial() {
        return this.poderInicial;
    }

    public void setPoderInicial(int poderInicial) {
        this.poderInicial = poderInicial;
    }
}
