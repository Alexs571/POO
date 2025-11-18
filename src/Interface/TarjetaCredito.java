package Interface;

/**
 * Medio de pago con tarjeta de crédito.
 */
public class TarjetaCredito implements PagoConDescuento {

    private String titular;
    private String numero;

    public TarjetaCredito(String titular, String numero) {
        this.titular = titular;
        this.numero = numero;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con Tarjeta de Crédito de " + titular +
                " por $" + String.format("%.2f", monto));
    }

    @Override
    public double aplicarDescuento(double montoOriginal, double porcentaje) {
        double descuento = montoOriginal * porcentaje / 100.0;
        return montoOriginal - descuento;
    }

    @Override
    public String toString() {
        return "TarjetaCredito{" +
                "titular='" + titular + '\'' +
                ", numero='**** **** **** " + (numero != null && numero.length() >= 4 ? numero.substring(numero.length()-4) : "XXXX") + '\'' +
                '}';
    }
}
