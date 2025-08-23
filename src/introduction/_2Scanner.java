package introduction;

import  java.util.Scanner;

public class _2Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter your name:");
        String name = scanner.nextLine();


        System.out.println("Enter yout age: ");
         int age= 0;
         if( scanner.hasNextInt()){
             age= scanner.nextInt();
         }else{
             System.out.println("Input your age as an integer:");
             return;
         }

        System.out.println("Soy " + name + " y tengo " + age);





    }



}
