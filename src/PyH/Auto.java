
package PyH;
public class Auto extends Vehiculo{
    private int puertas;
    public Auto(String m,String mo,int p){super(m,mo);puertas=p;}
    @Override public void mostrarInfo(){
        System.out.println("Auto "+marca+" "+modelo+" puertas="+puertas);
    }
}