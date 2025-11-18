package Interface;

import java.util.Scanner;

/**
 * Demostración de la EdadInvalidaException.
 */
public class PruebaEdadInvalida {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese la edad: ");
            int edad = scanner.nextInt();

            validarEdad(edad);
            System.out.println("Edad válida: " + edad);

        } catch (EdadInvalidaException e) {
            System.out.println("Error de edad: " + e.getMessage());
        } finally {
            System.out.println("Finalizando PruebaEdadInvalida.");
            scanner.close();
        }
    }

    /**
     * Lanza EdadInvalidaException si la edad es menor a 0 o mayor a 120.
     */
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("La edad " + edad + " no es válida (debe estar entre 0 y 120).");
        }
    }
}
