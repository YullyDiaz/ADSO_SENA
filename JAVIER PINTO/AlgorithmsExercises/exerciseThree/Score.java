/*Elaborar un algoritmo que solicite el número de respuestas correctas,incorrectas y en blanco, correspondientes a postulantes, y muestre su puntaje final considerando, que por cada respuesta correcta tendrá 4 puntos, respuestas incorrectas tendrá -1 y respuestas en blanco tendrá 0.*/

import java.util.Scanner; //Importa la clase Scanner para leer los datos igresados desde la consola.

public class Score { //Define la clase Score

    public static void main(String[] args) { //Define el metodo main para la entrada.
        Scanner input = new Scanner(System.in); //Lee la entrada.
        int numberOne, numberTwo, numberThree, numberFour, numberFive, numberSix; //Se definen las variables qe se a utilizar.
        /*Inicio del ingreso de valore.*/
        System.out.println("Ingresar las respuestas correctas");
        numberOne =input.nextInt();
        System.out.println("Ingresar las respuestas Incorrectas");
        numberTwo =input.nextInt();
        System.out.println("Ingresar las respuestas en blanco");
        numberThree =input.nextInt();
        /*Fin del ingreso de valore.*/
        /*Inicio de las operaciones de los puntajes.*/
        numberFour = numberOne * 4;
        numberFive = numberTwo * (-1);
        numberSix= numberFour + numberFive;
        /*Fin de las operaciones de los puntajes.*/
        System.out.println("Las respuestas en blanco son: " + numberThree);
        System.out.println("El puntaje final es: " + numberSix);

        input.close();
    }
}