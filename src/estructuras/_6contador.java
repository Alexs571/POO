package estructuras;

import java.util.Scanner;


public class _6contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        int cero = 0;
        int negativos = 0;
        int positivos = 0;

        for (int i = 0; i < 10; i++){
            System.out.println("Ingrese un numero");
            n = scanner.nextInt();
            scanner.nextLine();


            if(n < 0 ){
                negativos +=1;
            } else if (n == 0 ) {
                cero +=1;
            }else {
                positivos +=1;
            }
        }


        System.out.println("NEGATIVO\tCERO\tPOSITIVO\n" + negativos + "\t" + cero + "\t" + positivos);


    }

}
