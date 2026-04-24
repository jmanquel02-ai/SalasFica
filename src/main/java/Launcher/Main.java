package Launcher;

import Controlador.MapaController;
import Datos.RepositorioDatos;
import Vista.ConsolaVista;

public class Main {

    public static void main(String[] args) {
        RepositorioDatos repositorioDatos = new RepositorioDatos();
        ConsolaVista consolaVista = new ConsolaVista();
        MapaController mapaController = new MapaController(repositorioDatos, consolaVista);

        mapaController.iniciar();
    }
}