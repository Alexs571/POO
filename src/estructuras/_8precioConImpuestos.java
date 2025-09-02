package estructuras;


import  java.util.Scanner;




public class _8precioConImpuestos {


    public static void main(String[] args) {
        System.out.println("Ingrese precio de su producto");
        Scanner scanner = new Scanner(System.in);

        double precio = scanner.nextDouble();
        producto articulo = new producto("Celular", precio);


        System.out.println("Ingrese los impuestos que tiene");
        double impuesto = (scanner.nextDouble() * 0.01);

        System.out.println("Ingrese el descuento que tiene");

        double descuento = (scanner.nextDouble()*0.01);
        System.out.println("precio final: " + articulo.calcularPrecioFinal(precio,impuesto,descuento));
    }








}
