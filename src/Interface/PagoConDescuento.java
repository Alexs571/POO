package Interface;

/**
 * Extiende el comportamiento de Pago permitiendo aplicar descuentos.
 */
public interface PagoConDescuento extends Pago {

    /**
     * Aplica un porcentaje de descuento al monto original.
     * @param montoOriginal monto sin descuento
     * @param porcentaje porcentaje de descuento (0 a 100)
     * @return monto con descuento aplicado
     */
    double aplicarDescuento(double montoOriginal, double porcentaje);
}
