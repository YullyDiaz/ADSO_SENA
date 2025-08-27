package exerciseTh_Two;

import java.util.Scanner; // Importa la clase Scanner para leer los datos ingresados desde la consola.
public class Dividers { // Define la clase Dividers
    public static void main(String[] args) { // Define el metodo main para la entrada.
        Scanner input = new Scanner(System.in);
        // Se declaran las variables
        int numberOne,counter;
        System.out.println("ingresar un numero");
        numberOne = input.nextInt();

        if(numberOne == 0){ // Verifica si el numero ingresado es entero y diferente de cero.
            System.out.println("El numero ingresado no puede ser cero");
        }

        for (counter = 1; counter <= numberOne; counter++){ //Ciclo que nos muestra los divisores del numero ingresado.
            if (numberOne %  counter == 0){
                System.out.println("Los divisores de "+numberOne+" son: "+counter);
            }
        }input.close();
    }
}
