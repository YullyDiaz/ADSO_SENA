package exerciseEleven;
import java.util.Scanner;
public class StringSearch {
    public static Object[] stringSearch(String A, String B) {
        int n = A.length();
        int m = B.length();

        boolean found = false;
        int startIndex = 0; // Este será el índice 1-basado de Comienzo

        int limit = n - m; // El 'Limite' en 0-based indexing

        int i;
        int j;
        int com = 0; // 'Com' en el pseudocódigo, 0-based

        if (m > n) { 
            return new Object[]{false, 0}; 
        }
        if (m == 0) { // Si el patrón es vacío, se considera encontrado en la primera posición
            return new Object[]{true, 1}; 
        }

        while (!found && (com <= limit)) {
            i = com;
            j = 0;

            while (j < m && A.charAt(i) == B.charAt(j)) {
                i = i + 1;
                j = j + 1;
            }

            found = (j == m);

            if (!found) {
                com = com + 1;
            }
        }

        return new Object[]{found, found ? (com + 1) : 0};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este programa busca una subcadena (patrón B) dentro de una cadena principal (A).");
        System.out.print("\nIngrese la cadena principal (A): ");
        String A = scanner.nextLine();
        System.out.print("Ingrese la subcadena a buscar (B): ");
        String B = scanner.nextLine();

        Object[] result = stringSearch(A, B);
        boolean hallado = (Boolean) result[0];
        int comienzo = (Integer) result[1];

        System.out.println("\n--- Resultado ---");
        if (hallado) {
            System.out.println("La subcadena '" + B + "' fue ENCONTRADA en '" + A + "'.");
            System.out.println("Comienza en el índice (1-basado): " + comienzo);
        } else {
            System.out.println("La subcadena '" + B + "' NO fue ENCONTRADA en '" + A + "'.");
        }
        scanner.close();
    }
}
