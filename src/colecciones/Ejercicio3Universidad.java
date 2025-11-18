package colecciones;

/**
 * Clase de demostración para el Ejercicio Universidad, Profesor y Curso.
 */
public class Ejercicio3Universidad {

    public static void main(String[] args) {

        // 1. Crear al menos 3 profesores y 5 cursos.
        Profesor prof1 = new Profesor("PR001", "Ana Perez", "Matemática");
        Profesor prof2 = new Profesor("PR002", "Juan Gomez", "Programación");
        Profesor prof3 = new Profesor("PR003", "Laura Lopez", "Física");

        Curso c1 = new Curso("C001", "Álgebra");
        Curso c2 = new Curso("C002", "Programación I");
        Curso c3 = new Curso("C003", "Programación II");
        Curso c4 = new Curso("C004", "Física I");
        Curso c5 = new Curso("C005", "Base de Datos");

        // 2. Agregar profesores y cursos a la universidad.
        Universidad uni = new Universidad("Universidad Nacional");
        uni.agregarProfesor(prof1);
        uni.agregarProfesor(prof2);
        uni.agregarProfesor(prof3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // 3. Asignar profesores a cursos usando asignarProfesorACurso(...)
        uni.asignarProfesorACurso("C001", "PR001");
        uni.asignarProfesorACurso("C002", "PR002");
        uni.asignarProfesorACurso("C003", "PR002");
        uni.asignarProfesorACurso("C004", "PR003");
        uni.asignarProfesorACurso("C005", "PR002");

        System.out.println("=== 4) Listar cursos con su profesor ===");
        uni.listarCursos();

        System.out.println("\n=== 4) Listar profesores con sus cursos ===");
        uni.listarProfesores();

        System.out.println("\n=== 5) Cambiar el profesor de un curso (C003 -> PR003) ===");
        uni.asignarProfesorACurso("C003", "PR003");
        uni.listarCursos();
        uni.listarProfesores();

        System.out.println("\n=== 6) Remover un curso (C005) y confirmar que ya no aparece en la lista del profesor ===");
        boolean eliminadoCurso = uni.eliminarCurso("C005");
        System.out.println("Curso C005 eliminado: " + eliminadoCurso);
        uni.listarCursos();
        uni.listarProfesores();

        System.out.println("\n=== 7) Remover un profesor (PR001) y dejar profesor = null en sus cursos ===");
        boolean eliminadoProfesor = uni.eliminarProfesor("PR001");
        System.out.println("Profesor PR001 eliminado: " + eliminadoProfesor);
        uni.listarCursos();
        uni.listarProfesores();

        System.out.println("\n=== 8) Reporte: cantidad de cursos por profesor ===");
        uni.reporteCantidadCursosPorProfesor();
    }
}
