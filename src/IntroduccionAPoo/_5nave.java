package IntroduccionAPoo;

public class _5nave {

    public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial("Apolo", 50);

        nave.avanzar(20);
        nave.recargarCombustible(30);
        nave.avanzar(20);
        nave.mostrarEstado();
    }
}

class NaveEspacial {
    private String nombre;
    private int combustible;
    private final int capacidadMaxima = 100;

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        if (combustible <= capacidadMaxima) {
            this.combustible = combustible;
        } else {
            this.combustible = capacidadMaxima;
        }
    }

    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + " ha despegado.");
        } else {
            System.out.println("No hay suficiente combustible para despegar.");
        }
    }

    public void avanzar(int distancia) {
        int consumo = distancia;
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " avanzó " + distancia + " unidades.");
        } else {
            System.out.println("No hay suficiente combustible para avanzar " + distancia + " unidades.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad <= capacidadMaxima) {
            combustible += cantidad;
            System.out.println("Se recargo " + cantidad + " unidades de combustible.");
        } else {
            combustible = capacidadMaxima;
            System.out.println("El tanque esta lleno, se recargo hasta la capacidad máxima.");
        }
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + " | Combustible: " + combustible + "/" + capacidadMaxima);
    }
}
