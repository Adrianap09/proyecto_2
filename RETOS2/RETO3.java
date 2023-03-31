import java.util.Scanner;

public class RETO3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Ingresa la cantidad de columnas: ");
        int columnas= scanner.nextInt();
        


        String[][] matriz = new String[filas][columnas];
        for (int i = 0; i < filas ; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingresa el emoji para [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.next();
            }
        }

        
        for (int i = 0; i < filas ; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
            scanner.close();
        }
    }
}
