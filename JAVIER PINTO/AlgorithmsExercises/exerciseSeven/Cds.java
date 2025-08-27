/*Elaborar un algoritmo que permita calcular el número de CDs necesarios para hacer una copia de seguridad, de la información almacenada en un disco cuya capacidad se conoce. Considerar que el disco duro está lleno de información, además expresado en gigabyte. Un CD virgen tiene 7 0 0 M e g abytes de capacidad y una Gigabyte es igual a 1,024 megabyte.*/

import java.util.Scanner; //Importa la clase Scanner para leer los datos igresados desde la consola.

public class Cds {  //Define la clase Cds
    public static void main(String[] args) { //Define el metodo main para la entrada.
        Scanner ingresar = new Scanner(System.in); //Lee la entrada.
        double numberOne, numberTwo, numberThree; //Se definen las variables qe se a utilizar.
        /*Inicio del ingreso de valore.*/
        System.out.println("Ingresar el numero de GB del disco duro");
        numberOne =ingresar.nextInt();
        /*Fin del ingreso de valore.*/
        /*Inicio de las operaciones.*/
        numberTwo = numberOne * 1.024;
        numberThree = Math.ceil((numberTwo / 700) + 2); //Se coloca +2 ya que solo asi logra ser veridico realizando el proceso por otro medio.
        /*Fin de las operaciones.*/
        System.out.println(numberThree);

        ingresar.close();
    }
}