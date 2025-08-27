package exerciseTen;
import java.util.Scanner;

public class TemporalOrder {
  public static int parcial(int m) { //Se implementa la función parcial tal como se definió en el ejercicio.
        if (m == 1) {
            return 1;
        } else {
            return 2 * parcial(m - 1);
        }
    }
    public static int totalA(int n) { //Implementa la función total de ejercicio A que depende de parcial.
        if (n == 1) {
            return 1;
        } else {
            // total(n-1) + 2 * parcial(n-1)
            return totalA(n - 1) + 2 * parcial(n - 1);
        }
    }
    public static int totalB(int n, int m) { //Implementa la función total del ejercicio B con dos parámetros.
        if (n == 1) {
            return m;
        } else {
            // m + total(n-1, 2 * m)
            return m + totalB(n - 1, 2 * m);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Análisis de Funciones Recursivas ---");

        System.out.print("Ingrese un valor para 'm' para la función parcial: ");
        int mVal = getPositiveInt(scanner);

        System.out.print("Ingrese un valor para 'n' para la función totalA: ");
        int nValA = getPositiveInt(scanner);

        System.out.print("Ingrese un valor para 'n' para la función totalB: ");
        int nValB = getPositiveInt(scanner);

        System.out.print("Ingrese un valor para 'm' para la función totalB: ");
        int mValB = getPositiveInt(scanner);

        System.out.println("Resultado de parcial(" + mVal + ") = " + parcial(mVal));
        System.out.println("Resultado de totalA(" + nValA + ") = " + totalA(nValA));
        System.out.println("Resultado de totalB(" + nValB + ", " + mValB + ") = " + totalB(nValB, mValB));
        // --- Fin de las llamadas y impresiones ---

        scanner.close();
    }
    public static int getPositiveInt(Scanner scanner) {
        int value;
        while (true) {
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value > 0) {
                    break;
                } else {
                    System.out.print("Por favor, ingrese un número entero positivo: ");
                }
            } else {
                System.out.print("Entrada inválida. Por favor, ingrese un número entero: ");
                scanner.next();
            }
        }
        // Eliminada la línea de impresión incorrecta de aquí
        return value;
    }
}
