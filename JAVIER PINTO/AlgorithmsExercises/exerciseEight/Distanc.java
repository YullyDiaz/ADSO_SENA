/*Se tiene los puntos A y B en el cuadrante positivo del plano cartesiano, elabore el algoritmo que permite obtener la distancia entre A y B.*/

import java.util.Scanner; //Importa la clase Scanner para leer los datos igresados desde la consola.

public class Distanc { //Define la clase Distance
    public static void main(String[] args) { //Define el metodo main para la entrada.
        Scanner input = new Scanner(System.in);//Lee la entrada.
        double numberOne, numberTwo, numberThree, numberFour, numberFive; //Se definen las variables qe se a utilizar.
        /*Inicio del ingreso de valore.*/
        System.out.println("Ingresar el punto A");
        numberOne =input.nextDouble();
        System.out.println("Ingresar abcisa B");
        numberTwo =input.nextDouble();
        System.out.println("Ingresar ordenada A");
        numberThree =input.nextDouble();
        System.out.println("Ingresar ordenada B");
        numberFour =input.nextDouble();
        /*Fin del ingreso de valore.*/
        /*Inicio de las operaciones.*/
        double deltaX = numberTwo - numberOne;
        double deltaY = numberFour - numberThree;
        numberFive = Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
        /*Fin de las operaciones.*/
        System.out.println("La distancia es: " + numberFive);
        input.close();
    }
}