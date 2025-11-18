package colecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Representa una biblioteca que contiene una colección de libros.
 */
public class Biblioteca {

    private String nombre;
    private final List<Libro> libros = new ArrayList<>();

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro libro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(libro);
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }
        for (Libro l : libros) {
            l.mostrarInfo();
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        if (isbn == null) return null;
        for (Libro l : libros) {
            if (isbn.equals(l.getIsbn())) {
                return l;
            }
        }
        return null;
    }

    public boolean eliminarLibro(String isbn) {
        Libro l = buscarLibroPorIsbn(isbn);
        if (l != null) {
            return libros.remove(l);
        }
        return false;
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public List<Libro> filtrarLibrosPorAnio(int anio) {
        List<Libro> resultado = new ArrayList<>();
        for (Libro l : libros) {
            if (l.getAnioPublicacion() == anio) {
                resultado.add(l);
            }
        }
        return resultado;
    }

    public void mostrarAutoresDisponibles() {
        Set<Autor> autores = new HashSet<>();
        for (Libro l : libros) {
            if (l.getAutor() != null) {
                autores.add(l.getAutor());
            }
        }
        if (autores.isEmpty()) {
            System.out.println("No hay autores disponibles.");
            return;
        }
        System.out.println("Autores disponibles en la biblioteca:");
        for (Autor a : autores) {
            a.mostrarInfo();
        }
    }
}
