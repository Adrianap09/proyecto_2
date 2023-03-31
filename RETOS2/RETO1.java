import java.util.Scanner;

public class RETO1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int cantidadNotas = 0;
        while (cantidadNotas <= 0) {
            System.out.print("Ingrese la cantidad de notas a evaluar: ");
            cantidadNotas = scanner.nextInt();
            if (cantidadNotas <= 0) {
                System.out.println("Debe ingresar un número positivo.");
            }
        }
        
        double[] notas = new double[cantidadNotas];
        double sumaNotas = 0;

        for (int i = 0; i < cantidadNotas; i++) {
            System.out.print("Ingrese la nota #" + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            sumaNotas += notas[i];
        }

        double promedio = sumaNotas / cantidadNotas;

        System.out.println("El promedio de las notas es: " + promedio);

        switch ((int) Math.floor(promedio)) {
            case 0:
            case 1:
            case 2:
                System.out.println("Reprobaste");
                break;
            case 3:
            case 4:
                System.out.println("Pasaste raspando");
                break;
            default:
                System.out.println("Aprobaste con buenos resultados");
                break;
        }
        scanner.close();
    }
}
