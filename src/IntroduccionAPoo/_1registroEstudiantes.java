package IntroduccionAPoo;

public class _1registroEstudiantes {

    public static void main(String[] args) {


        Estudiante estudiante1 = new Estudiante("Alexis", "Da silva", "1ro C",10);
        System.out.println( estudiante1.mostrarInfo());

        estudiante1.subirCalificaciones(2);

        estudiante1.bajarCalificaciones(2);
        System.out.println( estudiante1.mostrarInfo());


        estudiante1.bajarCalificaciones(9);
        System.out.println( estudiante1.mostrarInfo());

        estudiante1.subirCalificaciones(10);
        System.out.println( estudiante1.mostrarInfo());




    }



}



class Estudiante{
    String nombre;
    String apellido;
    String curso;
    double calificacion;


    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public void subirCalificaciones(double x){
        if(this.calificacion >=10){
            System.out.println("No se puede subir la nota operación");
        }else {
            this.calificacion = this.calificacion + x;
            if(this.calificacion>10){
                this.calificacion = 10;
            }
        }
    }

    public void bajarCalificaciones(double x){
        if(x>0){
            this.calificacion = this.calificacion- x;
            if(this.calificacion<=0){
                this.calificacion = 0;
            }
        }else {
            System.out.println("ya no se le puede restar puntos");
        }
    }


    public String mostrarInfo() {
        return "Estudiante{" +
                "nombre='" + nombre + '\n' +
                ", apellido='" + apellido + '\n' +
                ", curso='" + curso + '\n' +
                ", calificacion=" + calificacion +
                '}';
    }



}


