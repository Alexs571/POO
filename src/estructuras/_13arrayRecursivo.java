package estructuras;

public class _13arrayRecursivo {
    public static void mostrarOriginal(double[] arr, int i) {
        if (i == arr.length) return;
        System.out.println("Precio: $" + arr[i]);
        mostrarOriginal(arr, i + 1);
    }

    public static void mostrarModificado(double[] arr, int i) {
        if (i == arr.length) return;
        System.out.println("Precio: $" + arr[i]);
        mostrarModificado(arr, i + 1);
    }

    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        mostrarOriginal(precios, 0);

        precios[2] = 129.99;

        System.out.println("Precios modificados:");
        mostrarModificado(precios, 0);
    }
}
