package Modelo;

public class Sala {

    private String codigo;
    private Edificio edificio;
    private int piso;
    private String descripcion;

    public Sala(String codigo, Edificio edificio, int piso, String descripcion) {
        this.codigo = codigo;
        this.edificio = edificio;
        this.piso = piso;
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public Edificio getEdificio() {
        return edificio;
    }

    public int getPiso() {
        return piso;
    }

    public String getDescripcion() {
        return descripcion;
    }
}