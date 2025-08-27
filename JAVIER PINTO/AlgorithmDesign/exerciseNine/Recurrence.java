package exerciseNine;
import java.util.Scanner;
public class Recurrence {
    public static double solveRecurrence(int n) {
        if (n == 1) { // Caso base de la recurrencia
            return 10.0;
        }
        if (n > 1) { // La condición es n > 1
            double logN = Math.log(n) / Math.log(2); 
            return 2 * solveRecurrence(n / 4) + logN;
        }
        return 0.0; 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un valor para n (se recomienda potencia de 4 para exactitud, ej. 1, 4, 16, 64, 256): ");
        int n = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n >= 1) {
                    break;
                } else {
                    System.out.print("Por favor, ingrese un número entero positivo (n >= 1): ");
                }
            } else {
                System.out.print("Entrada inválida. Por favor, ingrese un número entero: ");
                scanner.next(); // Limpiar la entrada inválida
            }
        }
        double result = solveRecurrence(n);
        System.out.printf("El valor de T(%d) es: %.4f%n", n, result); //Para incluir las variables en el texto.
        scanner.close();
    }
}
