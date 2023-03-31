import java.util.Scanner;

public class RETO2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de competidores: ");
        int cantidadCompetidores = scanner.nextInt();

        String[] nombres = new String[cantidadCompetidores];
        double[] tiempos = new double[cantidadCompetidores];

        for (int i = 0; i < cantidadCompetidores; i++) {
            System.out.print("Ingrese el nombre del competidor #" + (i + 1) + ": ");
            nombres[i] = scanner.next();
            System.out.print("Ingrese el tiempo del competidor #" + (i + 1) + ": ");
            tiempos[i] = scanner.nextDouble();
        }

        double menorTiempo = tiempos[0];
        String ganador = nombres[0];

        for (int i = 1; i < cantidadCompetidores; i++) {
            if (tiempos[i] < menorTiempo) {
                menorTiempo = tiempos[i];
                ganador = nombres[i];
            }
        }

        System.out.println("El ganador es " + ganador + " con un tiempo de " + menorTiempo);
        scanner.close();
    }
}
