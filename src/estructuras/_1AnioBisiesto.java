package estructuras;
import java.util.Scanner;


public class _1AnioBisiesto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una año para determinar si es bisiesto");

        int anio = 0;

        if(scanner.hasNextInt()){
            anio = scanner.nextInt();
            if((anio % 4 ==  0) && (anio % 100 != 0) || (anio % 400 == 0)){
                System.out.println("El año " + anio + " es bisiesto.");
            }else{
                System.out.println("El año " + anio + " no es bisiesto.");
            }
        }



    }



}
