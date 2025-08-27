//Contador de líneas generadas por la función t(n)
package exerciseFour;
public class Calculate { // Clase Calculate para calcular el coste de G(n) en líneas generadas
    public static long calculateT(int x) { // Método para calcular el coste de G(n) en líneas generadas
        long lines = 0;

        for (int i = 1; i <= x; i++) { // Bucle para iterar desde 1 hasta x
            for (int j = 1; j <= i; j++) {
                lines++;
            }
        }

        if (x > 0) { // Si x es mayor que 0, se llama recursivamente a la función
            for (int i = 1; i <= 4; i++) {
                lines += calculateT(x / 2);
            }
        }
        return lines;
    }
    public static void main(String[] args) {
        System.out.println("Coste de G(n) - Líneas generadas");
        int[] testValues = {0, 1, 2, 4, 8, 16, 32, 64, 128};
        
        for (int n : testValues) { // Probamos con diferentes valores de n
            long cost = calculateT(n);
            System.out.printf("Líneas: "+n+" "+cost);
        }
    }
}
