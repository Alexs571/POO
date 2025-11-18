package Interface;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 1. División segura: manejar ArithmeticException si el divisor es cero.
 */
public class DivisionSegura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese el dividendo: ");
            double dividendo = scanner.nextDouble();

            System.out.print("Ingrese el divisor: ");
            double divisor = scanner.nextDouble();

            if (divisor == 0) {
                throw new ArithmeticException("No se puede dividir por cero.");
            }

            double resultado = dividendo / divisor;
            System.out.println("Resultado: " + resultado);

        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar valores numéricos válidos.");
        } catch (ArithmeticException e) {
            System.out.println("Error aritmético: " + e.getMessage());
        } finally {
            System.out.println("Finalizando DivisiónSegura.");
            scanner.close();
        }
    }
}
