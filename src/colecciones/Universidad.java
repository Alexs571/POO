package colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Representa una Universidad que administra profesores y cursos.
 */
public class Universidad {

    private String nombre;
    private List<Profesor> profesores = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();

    public Universidad(String nombre) {
        this.nombre = nombre;
    }

    public void agregarProfesor(Profesor p) {
        if (p != null && !profesores.contains(p)) {
            profesores.add(p);
        }
    }

    public void agregarCurso(Curso c) {
        if (c != null && !cursos.contains(c)) {
            cursos.add(c);
        }
    }

    public Profesor buscarProfesorPorId(String id) {
        if (id == null) return null;
        for (Profesor p : profesores) {
            if (id.equals(p.getId())) {
                return p;
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        if (codigo == null) return null;
        for (Curso c : cursos) {
            if (codigo.equals(c.getCodigo())) {
                return c;
            }
        }
        return null;
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso == null) {
            System.out.println("No se encontró el curso con código: " + codigoCurso);
            return;
        }
        if (profesor == null) {
            System.out.println("No se encontró el profesor con id: " + idProfesor);
            return;
        }

        curso.setProfesor(profesor);
    }

    public void listarProfesores() {
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores cargados.");
            return;
        }
        for (Profesor p : profesores) {
            p.mostrarInfo();
            p.listarCursos();
            System.out.println();
        }
    }

    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("No hay cursos cargados.");
            return;
        }
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }

    public boolean eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);
        if (c != null) {
            // Romper la relación con su profesor si la hubiera
            if (c.getProfesor() != null) {
                c.setProfesor(null);
            }
            return cursos.remove(c);
        }
        return false;
    }

    public boolean eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);
        if (p != null) {
            // Antes de remover, dejar null los cursos que dictaba
            List<Curso> cursosDelProfesor = new ArrayList<>(p.getCursos());
            for (Curso c : cursosDelProfesor) {
                c.setProfesor(null);
            }
            return profesores.remove(p);
        }
        return false;
    }

    /**
     * Reporte: cantidad de cursos por profesor.
     */
    public void reporteCantidadCursosPorProfesor() {
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores registrados.");
            return;
        }
        System.out.println("Reporte: Cantidad de cursos por profesor");
        for (Profesor p : profesores) {
            System.out.println("- " + p.getNombre() + ": " + p.getCursos().size() + " curso(s)");
        }
    }
}
