package Controlador;

import Datos.RepositorioDatos;
import Modelo.PuntoReferencia;
import Modelo.Ruta;
import Modelo.Sala;
import Vista.ConsolaVista;

public class MapaController {

    private RepositorioDatos repositorioDatos;
    private ConsolaVista vista;

    public MapaController(RepositorioDatos repositorioDatos, ConsolaVista vista) {
        this.repositorioDatos = repositorioDatos;
        this.vista = vista;
    }

    public void iniciar() {
        int opcion;

        vista.mostrarTitulo();

        do {
            opcion = vista.mostrarMenuPrincipal();

            switch (opcion) {
                case 1:
                    consultarSala();
                    break;
                case 2:
                    vista.mostrarSalas(repositorioDatos.obtenerSalas());
                    break;
                case 3:
                    vista.mostrarPuntos(repositorioDatos.obtenerPuntosReferencia());
                    break;
                case 4:
                    vista.mostrarMensaje("Gracias por usar Salas FICA.");
                    break;
                default:
                    vista.mostrarMensaje("Opción inválida. Intente nuevamente.");
                    break;
            }

        } while (opcion != 4);
    }

    private void consultarSala() {
        int indicePunto = vista.seleccionarPuntoInicio(repositorioDatos.obtenerPuntosReferencia());
        PuntoReferencia puntoSeleccionado = repositorioDatos.obtenerPuntoPorIndice(indicePunto);

        if (puntoSeleccionado == null) {
            vista.mostrarMensaje("Punto de inicio inválido.");
            return;
        }

        int indiceSala = vista.seleccionarSala(repositorioDatos.obtenerSalas());
        Sala salaSeleccionada = repositorioDatos.obtenerSalaPorIndice(indiceSala);

        if (salaSeleccionada == null) {
            vista.mostrarMensaje("Sala inválida.");
            return;
        }

        Ruta ruta = repositorioDatos.buscarRuta(puntoSeleccionado, salaSeleccionada);

        if (ruta == null) {
            vista.mostrarMensaje("No existe una ruta registrada para la consulta seleccionada.");
            return;
        }

        vista.mostrarResultado(ruta);
    }
}