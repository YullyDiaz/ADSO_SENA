/*Se necesita obtener el promedio simple de un estudiante a partir de sus tres notas parciales.*/

import java.util.Scanner; //Importa la clase Scanner para leer los datos igresados desde la consola.

public class Average { //Define la clase Average
    public static void main(String[] args) { //Define el metodo main para la entrada.
    Scanner ingresar = new Scanner(System.in); //Lee la entrada.
    int numberOne, numberTwo, numberThree, numberFour; //Se definen las variables qe se a utilizar.
    /*Inicio del ingreso de valore.*/
    System.out.println("Ingresar la nota #1");
    numberOne = ingresar.nextInt();
    System.out.println("Ingrese la nota #2");
    numberTwo = ingresar.nextInt();
    System.out.println("Ingrese la nota #3");
    numberThree = ingresar.nextInt();
    /*Fin del ingreso de valore.*/
    numberFour = (numberOne + numberTwo + numberThree) / 3;  //Se realiza la operacion
    System.out.println("El promedio es: " + numberFour);  //Se imprime el resultado  
    ingresar.close();
    } 
}
