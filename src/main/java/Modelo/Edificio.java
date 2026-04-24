package Modelo;

public class Edificio extends Ubicacion {

    private int numeroMapa;
    private String nombreOficial;

    public Edificio(String nombre, String descripcion, int numeroMapa, String nombreOficial) {
        super(nombre, descripcion);
        this.numeroMapa = numeroMapa;
        this.nombreOficial = nombreOficial;
    }

    public int getNumeroMapa() {
        return numeroMapa;
    }

    public String getNombreOficial() {
        return nombreOficial;
    }
}