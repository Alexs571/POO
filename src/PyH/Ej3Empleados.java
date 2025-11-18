
package PyH;
public class Ej3Empleados{
    public static void main(String[]a){
        Empleado[] arr={
            new EmpleadoPlanta("Ana",200000),
            new EmpleadoTemporal("Luis",80,1500)
        };
        for(Empleado e:arr){
            System.out.println(e.nombre+" sueldo="+e.calcularSueldo());
            if(e instanceof EmpleadoPlanta) System.out.println(" - Planta");
            else if(e instanceof EmpleadoTemporal) System.out.println(" - Temporal");
        }
    }
}