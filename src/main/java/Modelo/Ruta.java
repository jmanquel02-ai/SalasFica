package Modelo;

public class Ruta {

    private PuntoReferencia origen;
    private Sala destino;
    private int distanciaMetros;
    private String orientacion;

    public Ruta(PuntoReferencia origen, Sala destino, int distanciaMetros, String orientacion) {
        this.origen = origen;
        this.destino = destino;
        this.distanciaMetros = distanciaMetros;
        this.orientacion = orientacion;
    }

    public PuntoReferencia getOrigen() {
        return origen;
    }

    public Sala getDestino() {
        return destino;
    }

    public int getDistanciaMetros() {
        return distanciaMetros;
    }

    public String getOrientacion() {
        return orientacion;
    }
}