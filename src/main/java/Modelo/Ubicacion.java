package Modelo;

public class Ubicacion {

    private String nombre;
    private String descripcion;

    public Ubicacion(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
