package introduction;
import java.util.Scanner;



public class _3operadoresAritmetricos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the first number");
        int a = scanner.nextInt();

        System.out.println("Enter the second number");
        int b = scanner.nextInt();


        System.out.println("A + B = " + (a+b));
        System.out.println("A - B = " + (a-b));
        System.out.println("A * B = " + (a*b));
        if( b<=0 ){
            System.out.println("ERROR AL DIVIDIR POR CERO");
        } else {
            System.out.println("A / B = " + (a/b) );
        }
    }



}

