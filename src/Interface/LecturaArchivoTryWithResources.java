package Interface;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * 5. Uso de try-with-resources para leer un archivo.
 */
public class LecturaArchivoTryWithResources {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la ruta del archivo a leer (try-with-resources): ");
        String ruta = scanner.nextLine();

        // try-with-resources cierra automáticamente el BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader(ruta))) {
            String linea;
            System.out.println("Contenido del archivo:");
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } finally {
            System.out.println("Finalizando LecturaArchivoTryWithResources.");
            scanner.close();
        }
    }
}
