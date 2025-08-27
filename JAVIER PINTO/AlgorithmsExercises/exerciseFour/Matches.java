/*Elaborar un algoritmo que permita ingresar el número de partidos ganados, perdidos y empatados, por algún equipo en el torneo apertura, se debe de mostrar su puntaje total, teniendo en cuenta que por cada partido ganado obtendrá 3 puntos, empatado 1 punto y perdido 0 puntos.*/

import java.util.Scanner; //Importa la clase Scanner para leer los datos igresados desde la consola.

public class Matches { //Define la clase Matches
    public static void main(String[] args) { //Define el metodo main para la entrada.
        Scanner input = new Scanner(System.in); //Lee la entrada.
        int numberOne, numberTwo, numberThree, numberFour, numberFive, numberSix; //Se definen las variables qe se a utilizar.
        /*Inicio del ingreso de valore.*/
        System.out.println("Ingresar los partidos ganados");
        numberOne =input.nextInt();
        System.out.println("Ingresar los partidos empatados");
        numberTwo =input.nextInt();
        System.out.println("Ingresar los partidos perdidos");
        numberThree =input.nextInt();
        /*Fin del ingreso de valore.*/
        /*Inicio de las operaciones de los puntajes.*/
        numberFour = numberOne * 3;
        numberFive = numberTwo * 1;
        numberSix= numberFour + numberFive;
        /*Fin de las operaciones de los puntajes.*/
        System.out.println("El total de partidos son: " + numberSix);
        System.out.println("El total de partidos perdidos son: " + numberThree);

        input.close();



    }
}