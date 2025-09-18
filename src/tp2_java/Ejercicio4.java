package tp2_java;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        
        System.out.print("Ingrese la categoria del producto (A, B o C): ");
        char categoria = scanner.next().toUpperCase().charAt(0);
        
        double descuento = 0;
        int porcentajeDescuento = 0;
        
        switch (categoria) {
            case 'A':
                porcentajeDescuento = 10;
                descuento = precio * 0.10;
                break;
            case 'B':
                porcentajeDescuento = 15;
                descuento = precio * 0.15;
                break;
            case 'C':
                porcentajeDescuento = 20;
                descuento = precio * 0.20;
                break;
            default:
                System.out.println("Categoría no válida.");
                scanner.close();
                return;
        }
        
        double precioFinal = precio - descuento;
        
        System.out.println("Descuento aplicado: " + porcentajeDescuento + "%");
        System.out.println("Precio final: " + precioFinal);
        
        scanner.close();
    }
}