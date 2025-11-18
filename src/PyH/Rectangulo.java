
package PyH;
public class Rectangulo extends Figura{
    private double a,b;
    public Rectangulo(double a,double b){super("Rectangulo");this.a=a;this.b=b;}
    public double calcularArea(){return a*b;}
}