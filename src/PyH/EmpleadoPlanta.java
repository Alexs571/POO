
package PyH;
public class EmpleadoPlanta extends Empleado{
    private double salario;
    public EmpleadoPlanta(String n,double s){super(n);salario=s;}
    public double calcularSueldo(){return salario;}
}