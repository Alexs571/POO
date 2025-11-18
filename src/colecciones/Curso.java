package colecciones;

/**
 * Representa un curso dentro de la Universidad.
 */
public class Curso {

    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    /**
     * Asigna/cambia el profesor sincronizando ambos lados.
     */
    public void setProfesor(Profesor nuevoProfesor) {
        // Si el profesor es el mismo, no hacemos nada.
        if (this.profesor == nuevoProfesor) {
            return;
        }

        // Quitar este curso de la lista del profesor anterior
        if (this.profesor != null) {
            this.profesor.getCursos().remove(this);
        }

        // Asignar el nuevo profesor
        this.profesor = nuevoProfesor;

        // Agregar este curso a la lista del nuevo profesor
        if (nuevoProfesor != null && !nuevoProfesor.getCursos().contains(this)) {
            nuevoProfesor.getCursos().add(this);
        }
    }

    public void mostrarInfo() {
        System.out.println("Curso{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", profesor=" + (profesor != null ? profesor.getNombre() : "Sin profesor") +
                '}');
    }
}
