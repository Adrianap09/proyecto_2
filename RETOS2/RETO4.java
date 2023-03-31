import java.util.Scanner;

public class RETO4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir la matriz para almacenar los productos y sus precios
        String[][] productos = new String[16][2];

        // Llenar la matriz con los productos y sus precios
        for (int i = 0; i < productos.length; i++) {
            System.out.printf("Ingrese el nombre del producto #%d: ", i+1);
            String nombre = scanner.nextLine();
            System.out.printf("Ingrese el precio del producto #%d: ", i+1);
            String precio = scanner.nextLine();

            productos[i][0] = nombre;
            productos[i][1] = precio;
        }

        // Mostrar el catálogo de productos
        System.out.println("Catálogo de productos:");
        for (int i = 0; i < productos.length; i++) {
            System.out.printf("[%d] %s - Precio: %s%n", i, productos[i][0], productos[i][1]);
        }
        scanner.close();
    }
}
