package Interface;

/**
 * Representa un medio de pago genérico.
 */
public interface Pago {

    /**
     * Procesa el pago de un monto.
     * @param monto monto a cobrar
     */
    void procesarPago(double monto);
}
