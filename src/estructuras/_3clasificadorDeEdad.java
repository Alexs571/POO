package estructuras;


import java.util.Scanner;

public class _3clasificadorDeEdad {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su edad: ");

        int edad = scanner.nextInt();

        if ( edad <12){
            System.out.println("NIÑO");
        } else if (edad >= 12 && edad <= 17 ) {
            System.out.println("ADOLECENTE");
        } else if (edad >= 18 && edad  <= 59) {
            System.out.println("ADULTO");
        } else {
            System.out.println("ADULTO MAYOR");
        }


    }

}
