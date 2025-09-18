package tp2_java;
import java.util.Scanner;

public class Ejercicio8 {
    
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double precioConImpuesto = precioBase + (precioBase * impuesto / 100);
        double precioFinal = precioConImpuesto - (precioBase * descuento / 100);
        return precioFinal;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = scanner.nextDouble();
        
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = scanner.nextDouble();
        
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = scanner.nextDouble();
        
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        
        System.out.println("El precio final del producto es: " + precioFinal);
        scanner.close();
    }
}