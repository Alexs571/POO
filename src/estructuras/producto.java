package estructuras;

public class producto {

    String nombre;
    double precio;

    public producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    double calcularPrecioFinal(double precio, double impuesto, double descuento){
        double precioFinal = this.precio + ( this.precio * impuesto ) - (this.precio * descuento);
        return  precioFinal;
    }

}
