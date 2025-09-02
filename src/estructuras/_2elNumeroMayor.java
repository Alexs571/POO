package estructuras;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _2elNumeroMayor {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = new ArrayList<Integer>();
        int aux = 0;

        for (int i = 0; i <3 ; i++ ){
            System.out.println("Enter number " + (i+1) + ": ");
            numbers.add(scanner.nextInt());
            scanner.nextLine();

            if( numbers.get(i) >= aux ){
                aux = numbers.get(i);
            }

        }

        for(int i = 0; i<3;i++){
            System.out.println("numero "+ ( i+1 ) + ": "+ numbers.get(i));
        }
        System.out.println("El numero mas grande es: " + aux);












    }

}
