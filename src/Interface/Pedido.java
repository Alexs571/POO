package Interface;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un pedido que contiene una lista de productos.
 */
public class Pedido implements Pagable {

    private List<Producto> productos;
    private Cliente cliente;
    private String estado; // ej: "CREADO", "PAGADO", "ENVIADO", etc.

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.estado = "CREADO";
    }

    public void agregarProducto(Producto producto) {
        if (producto != null) {
            productos.add(producto);
        }
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public String getEstado() {
        return estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Cambia el estado del pedido y notifica al cliente.
     */
    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        if (cliente != null) {
            cliente.notificarCambioEstado(nuevoEstado);
        }
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "cliente=" + cliente +
                ", estado='" + estado + '\'' +
                ", total=" + String.format("%.2f", calcularTotal()) +
                '}';
    }
}
