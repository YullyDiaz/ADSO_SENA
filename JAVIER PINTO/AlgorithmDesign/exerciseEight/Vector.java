/*Escribe un algoritmo que calcule los valores máximo y mínimo de un vector con n valores realizando para ello menos de (3n/2)comparaciones entre dichos valores. Demuéstrese que la solución propuesta realiza menos comparaciones que las mencionadas. */
package exerciseEight;
import java.util.Scanner;
import java.util.Arrays;

public class Vector {
    public static void main(String []agrs){
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Digite cuantos valores desea que contenga el vector.");
        n = scanner.nextInt();
        int[] numbers = new int[n]; //Se crea el arreglo y se instancia.

        for(int i=0; i<n; i++){
            System.out.println("Digite el valor para la posición "+(i+1)+" :");
            numbers[i] = scanner.nextInt();
        }

        if (n == 1) {
            System.out.println("El vector solo tiene un elemento: " + numbers[0]);
            System.out.println("El valor Máximo es: " + numbers[0]);
            System.out.println("El valor Mínimo es: " + numbers[0]);
        } else {
            // Inicializamos el máximo y el mínimo con el primer elemento del vector
            int findMax = numbers[0];
            int findMin = numbers[0];

            // Recorremos el resto del vector, empezando desde el segundo elemento (índice 1)
            for (int i = 1; i < n; i++) {
                int currentValue = numbers[i]; // El número que estamos mirando ahora

                // Comparamos con el máximo y el minimo encontrado hasta el momento
                if (currentValue > findMax) {
                    findMax = currentValue;
                }
                if (currentValue < findMin) {
                    findMin = currentValue; 
                }
            }
            System.out.println("Su vector final es: " + Arrays.toString(numbers)); //Para mostrar los valores que tiene el vector.
            System.out.println("El valor Máximo del vector es: " + findMax);
            System.out.println("El valor Mínimo del vector es: " + findMin);
        }
        scanner.close();        
    }
}
