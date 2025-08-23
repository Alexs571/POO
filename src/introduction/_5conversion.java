package introduction;


import  java.util.Scanner;

public class _5conversion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



//        Punto a
        System.out.println("Enter firs number int: ");
        int x;
        x= scanner.nextInt();
        scanner.nextLine();


        System.out.println("Enter second number int: ");
        int y;
        y = scanner.nextInt();
        scanner.nextLine();

        System.out.println(x + " / " + y + " = " + x/y);

        //Punto b

        System.out.println("Enter firs number double: ");
        double x2;
        x2 = scanner.nextDouble();
        scanner.nextLine();


        System.out.println("Enter second number double: ");
        double y2;
        y2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println(x2 + " / " + y2 + " = " + x2/y2);


        System.out.println("comparacion: " + x/y  + "||" + x2/y2);


    }
}
