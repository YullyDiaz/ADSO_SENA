/*Se desea calcular la distancia recorrida (m) por un móvil que tiene velocidad constante (m/s) durante un tiempo T (Sg), considerar que es un MRU (Movimiento Rectilíneo Uniforme)*/

import java.util.Scanner; //Importa la clase Scanner para leer los datos igresados desde la consola.

public class Distance { //Define la clase Distancia.
public  static void main (String [] args){ //Define el metodo main para la entrada.
    Scanner ingresar = new Scanner(System.in); //Lee la entrada.
    int numberOne,numberTwo,numberThree; //Se definen las variables qe se a utilizar.
    /*Inicio del ingreso de los valores*/
    System.out.println("Ingresar la velocidad");
        numberOne = ingresar.nextInt(); 
    System.out.println("Ingresar el tiempo");
        numberTwo = ingresar.nextInt();
    /*Fin del ingreso de los valores*/
    numberThree = numberOne * numberTwo; //Se realiza la operacion
    System.out.println("La distancia recorrida es: " + numberThree); //Se imprime el resultado
    ingresar.close();
    }
}