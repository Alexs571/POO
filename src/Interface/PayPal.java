package Interface;

/**
 * Medio de pago PayPal.
 */
public class PayPal implements Pago {

    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con PayPal de la cuenta " + email +
                " por $" + String.format("%.2f", monto));
    }

    @Override
    public String toString() {
        return "PayPal{" +
                "email='" + email + '\'' +
                '}';
    }
}
