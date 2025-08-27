/*Un natural n≥1 es triangular si es la suma de una sucesión ascendente no nula de naturales consecutivos que comienza en 1. (Por tanto, los cinco primeros números triangulares son 1, 3=1+2, 6=1+2+3, 10=1+2+3+4, 15=1+2+3+4+5.) (a) Escribe un programa que, dado un entero positivo n≥1, decida si éste es un número triangular con eficiencia incluida en O(n) y empleando un espacio extra de memoria constante.  */
package exerciseFive;

import java.util.Scanner;

public class TriangularNumbers {
    public static boolean esTriangular(int n) {
        if (n < 1) { // Validación de entrada según el problema (n >= 1)
            System.out.println("Error: El número debe ser un entero positivo (n >= 1).");
            return false; 
        }

        int sumaActual = 0; 
        int k = 1;          
        
        while (sumaActual < n) { // Bucle para ir sumando 1, luego 2, luego 3, etc., hasta que la suma alcance o exceda n.
            sumaActual += k; 
            k++;
        }
        return sumaActual == n;
    }
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        while (true) { // Bucle para permitir múltiples pruebas
            System.out.print("\nIngrese un entero positivo n (o 0 para salir): ");
            int number = scanner.nextInt();
            if (esTriangular(number)) {
                System.out.println("El número " + number + " ES un número triangular.");
            } else {
                System.out.println("El número " + number + " NO es un número triangular.");
            }
            scanner.close();
        }
    }
    
}
