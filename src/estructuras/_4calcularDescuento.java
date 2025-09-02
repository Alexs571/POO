package estructuras;

import java.util.Scanner;

public class _4calcularDescuento {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese la categoria de su articulo");

        String categoria = scanner.nextLine().toUpperCase();
        while(!categoria.equals("A")  && !categoria.equals("C")  && !categoria.equals("B")){

            System.out.println("INGRESE CATEGORIA VALIDA 'A' 'B' 'C'");
            categoria = scanner.nextLine().toUpperCase();

        }

        System.out.println("Ingrese el precio de su producto");

        double precioProducto = scanner.nextDouble();
        double precioConDescuento;
        if(categoria.equals("A")){

            precioConDescuento = precioProducto * 0.9;
        } else if (categoria.equals("B")) {
            precioConDescuento = precioProducto * 0.85;
        } else if (categoria.equals("C")) {
            precioConDescuento = precioProducto * 0.80;
        }else {
            precioConDescuento = precioProducto;
        }


        System.out.println("Categoria\t"  +categoria+"\n Precio original\t:" + precioProducto + "\nPrecio con descuento\t"+ precioConDescuento);
    }
}
