package Interface;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * 3. Lectura de archivo: manejar FileNotFoundException si el archivo no existe.
 */
public class LecturaArchivo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la ruta del archivo a leer: ");
        String ruta = scanner.nextLine();

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(ruta));
            String linea;
            System.out.println("Contenido del archivo:");
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: el archivo no existe o la ruta es incorrecta.");
        } catch (IOException e) {
            System.out.println("Error de lectura: " + e.getMessage());
        } finally {
            System.out.println("Cerrando recursos de LecturaArchivo.");
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo: " + e.getMessage());
            }
            scanner.close();
        }
    }
}
