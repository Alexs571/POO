package estructuras;


import java.util.Scanner;


public class _7validacionNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double score;

        do {
            System.out.println("Enter a score");

            score = scanner.nextDouble();
            scanner.nextLine();

            if (score < 0 || score >10) {
                System.out.println("ERROR");
                System.out.println("Enter a valid score");
            }
        }while ( score < 0 || score >10);


        System.out.println("Score saved");

    }

}
