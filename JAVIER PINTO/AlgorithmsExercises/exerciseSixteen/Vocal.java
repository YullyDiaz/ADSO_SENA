//Elabore un algoritmo que solicite un número entero y muestre un mensaje indicando la vocal correspondiente, considerando que la vocal A = 1.
package exerciseSixteen;

import java.util.Scanner; //Importa la clase Scanner para leer los datos igresados desde la consola.
public class Vocal { //Define la clase Vocal
      public static void main(String[] args) { //Define el metodo main para la entrada.
      Scanner input = new Scanner(System.in); //Lee la entrada.
            /*Inicio del ingreso de valore.*/
            int numberOne;
            String textOne = "";
            /*Fin del ingreso de valore.*/
            System.out.println("Ingresar un numero entero del 1 al 5:");
            numberOne =input.nextInt();
            //Inicio del Switvh donde se da a alegir
            switch (numberOne) {
                  case 1:
                        textOne = "A";
                  break;
                  case 2:
                        textOne = "E";
                  break;
                  case 3:
                        textOne = "I";
                  break;
                  case 4:
                        textOne = "O";
                  break;
                  case 5:
                        textOne = "U";
                  break;
                  default:
                        textOne = "Valor incorrecto";
                  break;
            }
            //Fin del Switvh donde se da a alegir
            //Se imprimen los resultados
            System.out.println("El resultado es:" + textOne);
            input.close();
      }
}
