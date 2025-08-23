package introduction;
import java.util.Scanner;

public class _6correcionCodigo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine(); // ERROR: el error se debe a que se esta usando la entrada nextInt que solo admite numeros enteros
        System.out.println("Hola, " + nombre);

    }
}
