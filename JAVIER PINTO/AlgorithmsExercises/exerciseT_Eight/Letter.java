//Elaborar un algoritmo que permita ingresar 10 letras cualquiera, y luego nos indique al final cuantas vocales y consonates se ingresaron.
package exerciseT_Eight;

import java.util.Scanner; //Importa la clase Scanner para leer los datos igresados desde la consola.

public class Letter { // Define la clase Leter
    public static void main(String[] args) { // Define el metodo main para la entrada.
        Scanner input = new Scanner(System.in);
        // Se declaran las variables
        int numberOne = 0;
        int numberTwo = 0;
        char textOne;
        System.out.println("Ingresar 10 letras para contar vocales y consonantes!");

        for (int counter = 1; counter <= 10; counter++) { // Ciclo que permite ingresar las 10 letras a clasificar
            System.out.print("Por favor, ingresa la letra #" + counter + ": ");
            textOne = input.nextLine().charAt(0);
            char texteTwo = Character.toLowerCase(textOne);

            switch (texteTwo) { // Si es cumple algun caso cuenta como vocal
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    numberOne++;
                    System.out.println("  (Es una vocal)");
                    break;
                default:

                    if (Character.isLetter(texteTwo)) { // Verifica si es una consonante
                        numberTwo++;
                        System.out.println("  (Es una consonante)");
                    } else {
                        System.out.println("  (No es una letra válida, no se cuenta)");
                    }
                    break;
            }
        }
        System.out.println("Número total de vocales: " + numberOne);
        System.out.println("Número total de consonantes: " + numberTwo);
        input.close();
    }
}
