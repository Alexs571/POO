
package PyH;
public class Circulo extends Figura{
    private double r;
    public Circulo(double r){super("Circulo");this.r=r;}
    public double calcularArea(){return Math.PI*r*r;}
}