package estructuras;

import  java.util.Scanner;

public class _5sumaDePares {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x;
        int suma = 0;
        do{
            System.out.println("Ingrese un numero: ");
             x = scanner.nextInt();
            scanner.nextLine();
            if(x % 2 == 0){
                suma += x;
            }
        } while( x != 0);





        System.out.println("la suma de todos los pares ingresados es " + suma);




}}
