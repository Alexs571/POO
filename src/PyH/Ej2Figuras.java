
package PyH;
public class Ej2Figuras{
    public static void main(String[]a){
        Figura[] figs={new Circulo(2), new Rectangulo(3,4)};
        for(Figura f:figs) System.out.println(f.nombre+" area="+f.calcularArea());
    }
}