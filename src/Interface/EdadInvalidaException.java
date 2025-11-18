package Interface;

/**
 * 4. Excepción personalizada para validar edades.
 */
public class EdadInvalidaException extends Exception {

    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
}
