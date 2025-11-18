package Interface;

import java.util.Scanner;

/**
 * 2. Conversión de cadena a número: manejar NumberFormatException.
 */
public class ConversionCadenaNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese un número entero en texto: ");
            String texto = scanner.nextLine();

            int valor = Integer.parseInt(texto);
            System.out.println("Número convertido correctamente: " + valor);

        } catch (NumberFormatException e) {
            System.out.println("Error: el texto ingresado no es un número entero válido.");
        } finally {
            System.out.println("Finalizando ConversionCadenaNumero.");
            scanner.close();
        }
    }
}
