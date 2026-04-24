package Datos;

import Modelo.Edificio;
import Modelo.PuntoReferencia;
import Modelo.Ruta;
import Modelo.Sala;

import java.util.ArrayList;

public class RepositorioDatos {

    private ArrayList<PuntoReferencia> puntosReferencia;
    private ArrayList<Sala> salas;
    private ArrayList<Ruta> rutas;
    private Edificio pabellonR;

    public RepositorioDatos() {
        puntosReferencia = new ArrayList<>();
        salas = new ArrayList<>();
        rutas = new ArrayList<>();

        cargarDatos();
    }

    private void cargarDatos() {
        pabellonR = new Edificio(
                "Pabellón R",
                "Edificio de aulas ubicado en el Campus Andrés Bello de la UFRO.",
                21,
                "Pabellón de Aulas Gilberto Montero"
        );

        PuntoReferencia c1 = new PuntoReferencia(
                "C1",
                "Punto de interés del campus utilizado como referencia de inicio."
        );

        PuntoReferencia c3 = new PuntoReferencia(
                "C3",
                "Punto de interés del campus utilizado como referencia de inicio cercano al sector FICA."
        );

        puntosReferencia.add(c1);
        puntosReferencia.add(c3);

        Sala r101 = new Sala("R101", pabellonR, 1, "Sala ubicada en el primer nivel del Pabellón R.");
        Sala r102 = new Sala("R102", pabellonR, 1, "Sala ubicada en el primer nivel del Pabellón R.");
        Sala r103 = new Sala("R103", pabellonR, 1, "Sala ubicada en el primer nivel del Pabellón R.");
        Sala r104 = new Sala("R104", pabellonR, 1, "Sala ubicada en el primer nivel del Pabellón R.");
        Sala r105 = new Sala("R105", pabellonR, 1, "Sala ubicada en el primer nivel del Pabellón R.");
        Sala r106 = new Sala("R106", pabellonR, 1, "Sala ubicada en el primer nivel del Pabellón R.");

        salas.add(r101);
        salas.add(r102);
        salas.add(r103);
        salas.add(r104);
        salas.add(r105);
        salas.add(r106);

        rutas.add(new Ruta(c1, r101, 95, "Desde C1, dirígete hacia el sector del Pabellón R. Ingresa al edificio y avanza por el pasillo principal hasta encontrar la sala R101."));
        rutas.add(new Ruta(c1, r102, 100, "Desde C1, dirígete hacia el sector del Pabellón R. Ingresa al edificio y avanza por el pasillo principal hasta encontrar la sala R102."));
        rutas.add(new Ruta(c1, r103, 105, "Desde C1, dirígete hacia el sector del Pabellón R. Ingresa al edificio y avanza por el pasillo principal hasta encontrar la sala R103."));
        rutas.add(new Ruta(c1, r104, 110, "Desde C1, dirígete hacia el sector del Pabellón R. Ingresa al edificio y avanza por el pasillo principal hasta encontrar la sala R104."));
        rutas.add(new Ruta(c1, r105, 115, "Desde C1, dirígete hacia el sector del Pabellón R. Ingresa al edificio y continúa por el pasillo principal hasta encontrar la sala R105."));
        rutas.add(new Ruta(c1, r106, 120, "Desde C1, dirígete hacia el sector del Pabellón R. Ingresa al edificio y continúa por el pasillo principal hasta encontrar la sala R106."));

        rutas.add(new Ruta(c3, r101, 45, "Desde C3, avanza hacia la entrada del Pabellón R. Ingresa al edificio y ubica la sala R101 en el pasillo principal."));
        rutas.add(new Ruta(c3, r102, 50, "Desde C3, avanza hacia la entrada del Pabellón R. Ingresa al edificio y ubica la sala R102 en el pasillo principal."));
        rutas.add(new Ruta(c3, r103, 55, "Desde C3, avanza hacia la entrada del Pabellón R. Ingresa al edificio y ubica la sala R103 en el pasillo principal."));
        rutas.add(new Ruta(c3, r104, 60, "Desde C3, avanza hacia la entrada del Pabellón R. Ingresa al edificio y ubica la sala R104 en el pasillo principal."));
        rutas.add(new Ruta(c3, r105, 65, "Desde C3, avanza hacia la entrada del Pabellón R. Ingresa al edificio y continúa por el pasillo principal hasta la sala R105."));
        rutas.add(new Ruta(c3, r106, 70, "Desde C3, avanza hacia la entrada del Pabellón R. Ingresa al edificio y continúa por el pasillo principal hasta la sala R106."));
    }

    public ArrayList<PuntoReferencia> obtenerPuntosReferencia() {
        return puntosReferencia;
    }

    public ArrayList<Sala> obtenerSalas() {
        return salas;
    }

    public PuntoReferencia obtenerPuntoPorIndice(int indice) {
        if (indice >= 0 && indice < puntosReferencia.size()) {
            return puntosReferencia.get(indice);
        }
        return null;
    }

    public Sala obtenerSalaPorIndice(int indice) {
        if (indice >= 0 && indice < salas.size()) {
            return salas.get(indice);
        }
        return null;
    }

    public Ruta buscarRuta(PuntoReferencia origen, Sala destino) {
        for (Ruta ruta : rutas) {
            if (ruta.getOrigen().getNombre().equals(origen.getNombre())
                    && ruta.getDestino().getCodigo().equals(destino.getCodigo())) {
                return ruta;
            }
        }
        return null;
    }
}