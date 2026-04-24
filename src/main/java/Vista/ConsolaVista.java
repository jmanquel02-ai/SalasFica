package Vista;

import Modelo.PuntoReferencia;
import Modelo.Ruta;
import Modelo.Sala;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsolaVista {

    private Scanner scanner;

    public ConsolaVista() {
        scanner = new Scanner(System.in);
    }

    public void mostrarTitulo() {
        System.out.println("=================================");
        System.out.println("          SALAS FICA");
        System.out.println("=================================");
        System.out.println("Prototipo de orientación para salas del Pabellón R");
        System.out.println();
    }

    public int mostrarMenuPrincipal() {
        System.out.println("===== MENÚ PRINCIPAL =====");
        System.out.println("1. Consultar sala");
        System.out.println("2. Ver salas disponibles");
        System.out.println("3. Ver puntos de inicio");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
        return leerEntero();
    }

    public int seleccionarPuntoInicio(ArrayList<PuntoReferencia> puntos) {
        System.out.println();
        System.out.println("===== PUNTOS DE INICIO =====");

        for (int i = 0; i < puntos.size(); i++) {
            PuntoReferencia punto = puntos.get(i);
            System.out.println((i + 1) + ". " + punto.getNombre() + " - " + punto.getDescripcion());
        }

        System.out.print("Seleccione punto de inicio: ");
        return leerEntero() - 1;
    }

    public int seleccionarSala(ArrayList<Sala> salas) {
        System.out.println();
        System.out.println("===== SALAS DISPONIBLES =====");

        for (int i = 0; i < salas.size(); i++) {
            Sala sala = salas.get(i);
            System.out.println((i + 1) + ". " + sala.getCodigo()
                    + " | " + sala.getEdificio().getNombre()
                    + " | Piso " + sala.getPiso());
        }

        System.out.print("Seleccione una sala: ");
        return leerEntero() - 1;
    }

    public void mostrarSalas(ArrayList<Sala> salas) {
        System.out.println();
        System.out.println("===== LISTADO DE SALAS =====");

        for (Sala sala : salas) {
            System.out.println("- " + sala.getCodigo()
                    + " | " + sala.getEdificio().getNombre()
                    + " | Piso " + sala.getPiso()
                    + " | " + sala.getDescripcion());
        }

        System.out.println();
    }

    public void mostrarPuntos(ArrayList<PuntoReferencia> puntos) {
        System.out.println();
        System.out.println("===== LISTADO DE PUNTOS DE INICIO =====");

        for (PuntoReferencia punto : puntos) {
            System.out.println("- " + punto.getNombre() + ": " + punto.getDescripcion());
        }

        System.out.println();
    }

    public void mostrarResultado(Ruta ruta) {
        Sala sala = ruta.getDestino();

        System.out.println();
        System.out.println("===== RESULTADO DE CONSULTA =====");
        System.out.println("Punto de inicio: " + ruta.getOrigen().getNombre());
        System.out.println("Sala seleccionada: " + sala.getCodigo());
        System.out.println("Edificio: " + sala.getEdificio().getNombre());
        System.out.println("Nombre oficial: " + sala.getEdificio().getNombreOficial());
        System.out.println("Número en mapa UFRO: " + sala.getEdificio().getNumeroMapa());
        System.out.println("Piso: " + sala.getPiso());
        System.out.println("Distancia estimada: " + ruta.getDistanciaMetros() + " metros");
        System.out.println();
        System.out.println("Orientación:");
        System.out.println(ruta.getOrientacion());
        System.out.println();
        System.out.println("Nota: La distancia es referencial y fue precargada para el prototipo inicial.");
        System.out.println();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println();
        System.out.println(mensaje);
        System.out.println();
    }

    private int leerEntero() {
        while (!scanner.hasNextInt()) {
            System.out.print("Entrada inválida. Ingrese un número: ");
            scanner.next();
        }
        return scanner.nextInt();
    }
}