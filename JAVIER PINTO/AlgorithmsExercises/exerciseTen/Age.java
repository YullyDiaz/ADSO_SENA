package exerciseTen;
/*Elabora un algoritmo que solicite la edad de 2 hermanos y muestre un mensaje indicando la edad del mayor y cuantos años de diferencia tiene con el menor.*/

import java.util.Scanner; //Importa la clase Scanner para leer los datos igresados desde la consola.
public class Age { //Define la clase Age
    public static void main(String[] args) { //Define el metodo main para la entrada.
        Scanner input = new Scanner(System.in); //Lee la entrada.
        int numberOne, numberTwo, numberThree;//Se definen las variables qe se a utilizar.
        /*Inicio del ingreso de valore.*/
        System.out.println("Ingresar la edad del primer hermano");
        numberOne =input.nextInt();
        System.out.println("Ingresar la edad del segundo hermano");
        numberTwo =input.nextInt();
        /*Inicio del ingreso de valore.*/
        if (numberOne > numberTwo){
            numberThree = numberOne - numberTwo;
            System.out.println("El primer hermano es el mayor, por " +numberThree);
        }
        else {
            numberThree = numberTwo - numberOne;
            System.out.println("El segundo hermano es el mayor por " + numberThree);
        }
        System.out.println("La diferencia de edades es: " + numberThree);
        input.close();
    } 
}
