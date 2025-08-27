package exerciseFifteen;
import java.util.Arrays;
import java.util.Scanner;

public class AlgorithmMaxMin {
    // Clase para devolver el Max y Min juntos
    static class Result {
        int max;
        int min;

        Result(int max, int min) {
            this.max = max;
            this.min = min;
        }
    }
    // Función MAX_MIN (T[i..j], Max, Min)
    public static Result findMaxMin(int[] T, int i, int j) {
        int Max, Min;
        // Caso para un elemento
        if (i == j) {
            return new Result(T[i], T[i]);
        }
        // Caso para dos elementos
        if (i + 1 == j) {
            if (T[i] <= T[j]) { // 1 comparación
                Max = T[j];
                Min = T[i];
            } else {
                Max = T[i];
                Min = T[j];
            }
            return new Result(Max, Min);
        }
        // Caso recursivo para más de dos elementos
        if (T[i] <= T[j]) { // 1 comparación
            Max = T[j];
            Min = T[i];
        } else {
            Max = T[i];
            Min = T[j];
        }
        // Llamada recursiva al subproblema
        Result auxResult = findMaxMin(T, i + 1, j - 1);
        // Combinar resultados
        if (Max < auxResult.max) { // 1 comparación
            Max = auxResult.max;
        }
        if (auxResult.min < Min) { // 1 comparación
            Min = auxResult.min;
        }
        return new Result(Max, Min);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Algoritmo de Max y Min ---");
        System.out.print("Ingrese la cantidad de elementos en el vector: ");
        int n = scanner.nextInt();
        int[] myArray = new int[n];
        System.out.println("Ingrese los elementos:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            myArray[i] = scanner.nextInt();
        }
        System.out.println("\nVector: " + Arrays.toString(myArray));
        // Llamar a la función principal con el array completo
        Result finalResult = findMaxMin(myArray, 0, myArray.length - 1);
        System.out.println("Máximo: " + finalResult.max);
        System.out.println("Mínimo: " + finalResult.min);
        System.out.println("\nEl número de comparaciones es aproximadamente (3n/2 - 2).");
        scanner.close();
    }
}
