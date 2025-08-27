package exerciseThirteen;

import java.util.Scanner;

public class Palindrome {
    // Función PAL(C, i, j)
    public static boolean esPalindromo(String C, int i, int j) {
        if (i >= j) {
            return true;
        } else if (C.charAt(i) != C.charAt(j)) {
            return false;
        } else {
            return esPalindromo(C, i + 1, j - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena de texto: ");
        String cadena = scanner.nextLine();
        boolean resultado = esPalindromo(cadena, 0, cadena.length() - 1);
        if (resultado) {
            System.out.println("La cadena '" + cadena + "' ES un palíndromo.");
        } else {
            System.out.println("La cadena '" + cadena + "' NO es un palíndromo.");
        }
        scanner.close();
    }
}
