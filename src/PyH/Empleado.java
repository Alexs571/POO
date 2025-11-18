
package PyH;
public abstract class Empleado{
    protected String nombre;
    public Empleado(String n){nombre=n;}
    public abstract double calcularSueldo();
}