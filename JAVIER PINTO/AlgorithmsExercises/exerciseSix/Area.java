/*Elabore un algoritmo que lea los 3 lados de un triángulo cualquiera y calcule su área, considerar: Si A, B y C son los lados, y S el semiperímetro.*/

import java.util.Scanner; //Importa la clase Scanner para leer los datos igresados desde la consola.
public class Area { //Define la clase Area
    public static void main(String[] args) { //Define el metodo main para la entrada.
        Scanner ingresar = new Scanner(System.in); //Lee la entrada.
        double numberOne, numberTwo, numberThree, numberFour, numberFive; //Se definen las variables qe se a utilizar.
        /*Inicio del ingreso de valore.*/
        System.out.println("Ingrese el lado A del traingulo");
        numberOne =ingresar.nextInt();
        System.out.println("Ingrese el lado B del traingulo");
        numberTwo =ingresar.nextInt();
        System.out.println("Ingrese el lado C del traingulo");
        numberThree =ingresar.nextInt();
        /*Fin del ingreso de valore.*/
        /*Inicio de las operaciones.*/
        numberFour = (numberOne + numberTwo + numberThree) / 2;
        numberFive = Math.sqrt( numberFour * (numberFour - numberOne) * (numberFour - numberTwo) * (numberFour - numberThree));
        /*Fin de las operaciones.*/
        System.out.println("El area del triangulo es: " + numberFive);
        ingresar.close();
    }
}