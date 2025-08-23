package introduction;

import java.util.Scanner;

public class _4Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter your name:");
        String name = scanner.nextLine();


        System.out.println("Enter your age: ");
         int age= 0;
         if( scanner.hasNextInt()){
             age= scanner.nextInt();
             scanner.nextLine();
         }else{
             System.out.println("Input your age as an integer:");
             return;
         }


        System.out.println("Enter your adress:");
        String adress = scanner.nextLine();


        System.out.println("Nombre: " + name + "\nEdad: " + age + "\nDirección: " + adress);





    }



}
