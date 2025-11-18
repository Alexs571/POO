package Interface;

/**
 * Contrato para objetos capaces de recibir notificaciones de cambio de estado.
 */
public interface Notificable {

    void notificarCambioEstado(String nuevoEstado);
}
