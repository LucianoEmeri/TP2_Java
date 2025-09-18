package tp2_java;

public class Ejercicio13 {
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        mostrarRecursivo(precios, 0);

        precios[2] = 129.99;

        System.out.println("\nPrecios modificados:");
        mostrarRecursivo(precios, 0);
    }

    public static void mostrarRecursivo(double[] array, int indice) {
        if (indice == array.length) {
            return;
        }

        System.out.println("Precio: $" + array[indice]);

        mostrarRecursivo(array, indice + 1);
    }
}
