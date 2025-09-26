package poo;

public class empresa {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado( "Ana Gómez", "Desarrolladora", 500000.0);
        Empleado empleado2 = new Empleado("Luis Pérez", "Analista");
        Empleado e3 = new Empleado("María López", "Tester");

        empleado1.actualizarSalario(10.0);
        empleado2.actualizarSalarioCantidad(250000.0);
        e3.actualizarSalarioCantidad(150000.0);
        e3.actualizarSalario(5.0);

        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        System.out.println(e3.toString());

        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());

        System.out.println(empleado1.getId());
        System.out.println(empleado2.getId());
        System.out.println(e3.getId());
    }
}
