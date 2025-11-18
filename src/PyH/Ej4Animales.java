
package PyH;
public class Ej4Animales{
    public static void main(String[]a){
        Animal[] anim={new Perro(),new Gato(),new Vaca()};
        for(Animal x:anim) x.hacerSonido();
    }
}