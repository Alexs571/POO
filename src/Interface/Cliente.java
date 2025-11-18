package Interface;

/**
 * Representa un cliente del sistema que puede ser notificado.
 */
public class Cliente implements Notificable {

    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void notificarCambioEstado(String nuevoEstado) {
        System.out.println("Notificando a " + nombre + " (" + email + "): "
                + "el estado de su pedido cambió a '" + nuevoEstado + "'.");
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
