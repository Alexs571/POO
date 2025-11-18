package Interface;

/**
 * Clase de demostración para la Parte 1: Interfaces en un sistema de E-commerce.
 */
public class DemoEcommerce {

    public static void main(String[] args) {

        // 1) Crear cliente
        Cliente cliente = new Cliente("Alexis", "alexis@example.com");

        // 2) Crear algunos productos
        Producto p1 = new Producto("Mouse", 5000);
        Producto p2 = new Producto("Teclado", 12000);
        Producto p3 = new Producto("Monitor", 80000);

        // 3) Crear pedido y agregar productos
        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);
        pedido.agregarProducto(p3);

        System.out.println("Detalle del pedido:");
        for (Producto p : pedido.getProductos()) {
            System.out.println(" - " + p);
        }
        System.out.println("Total sin descuento: $" + String.format("%.2f", pedido.calcularTotal()));

        // 4) Probar medios de pago
        TarjetaCredito tarjeta = new TarjetaCredito("Alexis", "1234567812345678");
        PayPal paypal = new PayPal("alexis@paypal.com");

        double totalPedido = pedido.calcularTotal();

        System.out.println("\nPago con tarjeta de crédito (10% descuento):");
        double totalConDescuento = tarjeta.aplicarDescuento(totalPedido, 10);
        System.out.println("Total con descuento: $" + String.format("%.2f", totalConDescuento));
        tarjeta.procesarPago(totalConDescuento);
        pedido.cambiarEstado("PAGADO");

        System.out.println("\nPago alternativo con PayPal (sin descuento):");
        paypal.procesarPago(totalPedido);
        pedido.cambiarEstado("PAGADO_CON_PAYPAL");

        System.out.println("\nEstado final del pedido:");
        System.out.println(pedido);
    }
}
