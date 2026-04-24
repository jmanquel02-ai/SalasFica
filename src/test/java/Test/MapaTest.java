package Test;

import Datos.RepositorioDatos;
import Modelo.PuntoReferencia;
import Modelo.Ruta;
import Modelo.Sala;

public class MapaTest {

    public static void main(String[] args) {
        RepositorioDatos datos = new RepositorioDatos();

        PuntoReferencia c1 = datos.obtenerPuntoPorIndice(0);
        Sala r101 = datos.obtenerSalaPorIndice(0);
        Ruta ruta = datos.buscarRuta(c1, r101);

        if (c1 == null) {
            System.out.println("ERROR: No se encontró el punto C1.");
            return;
        }

        if (r101 == null) {
            System.out.println("ERROR: No se encontró la sala R101.");
            return;
        }

        if (ruta == null) {
            System.out.println("ERROR: No se encontró la ruta entre C1 y R101.");
            return;
        }

        if (ruta.getDistanciaMetros() == 95) {
            System.out.println("PRUEBA 1 APROBADA: distancia C1 a R101 correcta.");
        } else {
            System.out.println("PRUEBA 1 FALLIDA: distancia esperada 95 metros.");
        }

        if (r101.getEdificio().getNumeroMapa() == 21) {
            System.out.println("PRUEBA 2 APROBADA: Pabellón R corresponde al número 21 del mapa.");
        } else {
            System.out.println("PRUEBA 2 FALLIDA: número de edificio incorrecto.");
        }

        if (datos.obtenerSalas().size() == 6) {
            System.out.println("PRUEBA 3 APROBADA: cantidad de salas correcta.");
        } else {
            System.out.println("PRUEBA 3 FALLIDA: cantidad de salas incorrecta.");
        }

        System.out.println("Pruebas básicas finalizadas.");
    }
}
