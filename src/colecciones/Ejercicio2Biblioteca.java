package colecciones;

import java.util.List;

/**
 * Clase de demostración para el Ejercicio 2 (Biblioteca y Libros).
 */
public class Ejercicio2Biblioteca {

    public static void main(String[] args) {

        // 1. Creamos una biblioteca.
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // 2. Crear al menos tres autores.
        Autor a1 = new Autor("A001", "Gabriel García Márquez", "Colombiana");
        Autor a2 = new Autor("A002", "J. K. Rowling", "Británica");
        Autor a3 = new Autor("A003", "Jorge Luis Borges", "Argentina");

        // 3. Agregar 5 libros asociados a alguno de los Autores a la biblioteca.
        biblioteca.agregarLibro("ISBN-001", "Cien años de soledad", 1967, a1);
        biblioteca.agregarLibro("ISBN-002", "El amor en los tiempos del cólera", 1985, a1);
        biblioteca.agregarLibro("ISBN-003", "Harry Potter y la piedra filosofal", 1997, a2);
        biblioteca.agregarLibro("ISBN-004", "Ficciones", 1944, a3);
        biblioteca.agregarLibro("ISBN-005", "El Aleph", 1949, a3);

        System.out.println("=== 4) Listar todos los libros con su información y la del autor ===");
        biblioteca.listarLibros();

        System.out.println("\n=== 5) Buscar un libro por su ISBN y mostrar su información ===");
        Libro encontrado = biblioteca.buscarLibroPorIsbn("ISBN-003");
        if (encontrado != null) {
            encontrado.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado.");
        }

        System.out.println("\n=== 6) Filtrar y mostrar los libros publicados en un año específico (1944) ===");
        List<Libro> libros1944 = biblioteca.filtrarLibrosPorAnio(1944);
        for (Libro l : libros1944) {
            l.mostrarInfo();
        }

        System.out.println("\n=== 7) Eliminar un libro por su ISBN (ISBN-002) y listar los libros restantes ===");
        boolean eliminado = biblioteca.eliminarLibro("ISBN-002");
        System.out.println("Eliminado: " + eliminado);
        biblioteca.listarLibros();

        System.out.println("\n=== 8) Mostrar la cantidad total de libros en la biblioteca ===");
        System.out.println("Cantidad total de libros: " + biblioteca.obtenerCantidadLibros());

        System.out.println("\n=== 9) Listar todos los autores de los libros disponibles en la biblioteca ===");
        biblioteca.mostrarAutoresDisponibles();
    }
}
