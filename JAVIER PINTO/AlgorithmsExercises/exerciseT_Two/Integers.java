//Elaborar un algoritmo que solicite 2 números enteros y muestre su proucto por el método de sumas sucesivas.
package exerciseT_Two;

import java.util.Scanner; //Importa la clase Scanner para leer los datos igresados desde la consola.

public class Integers { //Define la clase Integers
    public static void main(String[] args) { //Define el metodo main para la entrada.
        Scanner input = new Scanner(System.in);
        int numberOne,numberTwo,counter,numberThree; //Se declaran las variables
        System.out.println("Ingresar el primer numero entero");
        numberOne =input.nextInt();
        System.out.println("Ingresar el segundo numero entero");
        numberTwo =input.nextInt();
        numberThree = 0;
        for (counter = 1; counter <= numberTwo; counter++){ //Ciclo que realiza las sumas sucesivas.
            numberThree = numberThree + numberOne;
        }
        System.out.println("El producto es: " + numberThree);
        input.close();
    }
}
