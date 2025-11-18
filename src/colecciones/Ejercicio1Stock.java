package colecciones;

import java.util.List;

/**
 * Clase de demostración para el Caso Práctico 1 (Sistema de Stock).
 */
public class Ejercicio1Stock {

    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // 1. Crear al menos cinco productos con diferentes categorías y agregarlos al inventario.
        Producto p1 = new Producto("P001", "Pan", 800, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Leche", 1200, 30, CategoriaProducto.ALIMENTOS);
        Producto p3 = new Producto("P003", "Televisor", 250000, 10, CategoriaProducto.ELECTRONICA);
        Producto p4 = new Producto("P004", "Remera", 9000, 25, CategoriaProducto.ROPA);
        Producto p5 = new Producto("P005", "Silla", 15000, 15, CategoriaProducto.HOGAR);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        System.out.println("=== 2) Listar todos los productos ===");
        inventario.listarProductos();

        System.out.println("\n=== 3) Buscar producto por ID 'P003' ===");
        Producto buscado = inventario.buscarProductoPorId("P003");
        if (buscado != null) {
            buscado.mostrarInfo();
        } else {
            System.out.println("Producto no encontrado.");
        }

        System.out.println("\n=== 4) Filtrar productos por categoría ALIMENTOS ===");
        List<Producto> alimentos = inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
        for (Producto p : alimentos) {
            p.mostrarInfo();
        }

        System.out.println("\n=== 5) Eliminar producto con ID 'P002' y listar restantes ===");
        boolean eliminado = inventario.eliminarProducto("P002");
        System.out.println("Eliminado: " + eliminado);
        inventario.listarProductos();

        System.out.println("\n=== 6) Actualizar stock de 'P003' a 5 unidades ===");
        boolean actualizado = inventario.actualizarStock("P003", 5);
        System.out.println("Stock actualizado: " + actualizado);
        inventario.listarProductos();

        System.out.println("\n=== 7) Mostrar total de stock disponible ===");
        System.out.println("Total de unidades en stock: " + inventario.obtenerTotalStock());

        System.out.println("\n=== 8) Producto con mayor stock ===");
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            mayorStock.mostrarInfo();
        }

        System.out.println("\n=== 9) Filtrar productos con precio entre 1000 y 3000 ===");
        List<Producto> rangoPrecio = inventario.filtrarProductosPorPrecio(1000, 3000);
        for (Producto p : rangoPrecio) {
            p.mostrarInfo();
        }

        System.out.println("\n=== 10) Mostrar categorías disponibles ===");
        inventario.mostrarCategoriasDisponibles();
    }
}
