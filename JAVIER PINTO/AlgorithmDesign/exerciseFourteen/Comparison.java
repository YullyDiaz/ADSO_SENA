package exerciseFourteen;
import java.util.Random;
import java.util.Scanner;

public class Comparison {
    public static void runQuadraticAlgorithm(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Simula trabajo O(1)
            }
        }
    }
    public static void runDivideAndConquerAlgorithm(int n) {
        if (n <= 1) {
            return;
        }
        double logN = (n > 0) ? Math.log(n) / Math.log(2) : 0;
        long work = (long) (2 * n * logN);
        for (long i = 0; i < work; i++) {
            // Simula trabajo O(1)
        }
        runDivideAndConquerAlgorithm(n / 2);
        runDivideAndConquerAlgorithm(n / 2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Comparación de Algoritmos ---");
        System.out.println("Trivial: O(n^2)");
        System.out.println("Divide y Vencerás: O(n log^2 n)");
        int[] problemSizes = {100, 500, 1000, 5000, 10000}; 
        for (int n : problemSizes) {
            System.out.println("\n--- Tamaño n: " + n + " ---");
            long startTimeQuad = System.nanoTime();
            runQuadraticAlgorithm(n);
            long endTimeQuad = System.nanoTime();
            long durationQuad = (endTimeQuad - startTimeQuad) / 1_000_000;
            System.out.printf("Tiempo Cuadrático: %d ms%n", durationQuad);
            long startTimeDnC = System.nanoTime();
            runDivideAndConquerAlgorithm(n);
            long endTimeDnC = System.nanoTime();
            long durationDnC = (endTimeDnC - startTimeDnC) / 1_000_000;
            System.out.printf("Tiempo Divide y Vencerás: %d ms%n", durationDnC);
            if (durationDnC < durationQuad) {
                System.out.println("=> Divide y Vencerás es MÁS RÁPIDO.");
            } else {
                System.out.println("=> Cuadrático es MÁS RÁPIDO (o similar).");
            }
        }
        System.out.println("\nEn teoría, O(n log^2 n) es más eficiente que O(n^2).");
        scanner.close();
    }
}
