
package PyH;
public class Vehiculo{
    protected String marca, modelo;
    public Vehiculo(String m,String mo){marca=m;modelo=mo;}
    public void mostrarInfo(){System.out.println("Vehiculo "+marca+" "+modelo);}
}