
package PyH;
public class EmpleadoTemporal extends Empleado{
    private int horas; private double valor;
    public EmpleadoTemporal(String n,int h,double v){super(n);horas=h;valor=v;}
    public double calcularSueldo(){return horas*valor;}
}