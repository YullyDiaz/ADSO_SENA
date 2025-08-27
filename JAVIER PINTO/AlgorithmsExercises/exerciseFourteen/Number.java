//Elabore un algoritmo que permita ingresar un número entero (1 a 10), y muestre su equivalente en romano
package exerciseFourteen;

import java.util.Scanner; //Importa la clase Scanner para leer los datos igresados desde la consola.
public class Number { //Define la clase Number

    public static void main(String[] args) { //Define el metodo main para la entrada.
    Scanner input = new Scanner(System.in); //Lee la entrada.
            /*Inicio del ingreso de valore.*/
            int numberOne;
            String numberTwo = ""; //Se declara la variable como String y se deja vacia para ingresar el valor.
            System.out.println("Ingresar un numero entero entre 1 y 10:");
            numberOne =input.nextInt();
            /*Fin del ingreso de valore.*/
            /*Inicio del Switch donde se presentan las opciones*/
            switch (numberOne) {
                  case 1:
                        numberTwo = "I";
                  break;
                  case 2:
                        numberTwo = "II";
                  break;
                  case 3:
                        numberTwo = "III";
                  break;
                  case 4:
                        numberTwo = "IV";
                  break;
                  case 5:
                        numberTwo = "V";
                  break;
                  case 6:
                        numberTwo = "VI";
                  break;
                  case 7:
                        numberTwo = "VII";
                  break;
                  case 8:
                        numberTwo = "VIII";
                  break;
                  case 9:
                        numberTwo = "IX";
                  break;
                  case 10:
                        numberTwo = "X";
                  break;
            }
            /*Fin del Switch donde se presentan las opciones*/
            System.out.println("El numero en romano es:" + numberTwo); // Se imprime el resultado en donde se hace la conversión a número romano.
            input.close();
      }
}
