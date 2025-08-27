package exerciseTwelve;
/*Elabora un algoritmo para leer 3 números enteros diferentes entre sí, y determinar el número mayor de los tres.*/

import java.util.Scanner; //Importa la clase Scanner para leer los datos igresados desde la consola.
public class Number { //Define la clase Number
    public static void main(String[] args) {  //Define el metodo main para la entrada.
      Scanner input = new Scanner(System.in); //Lee la entrada.
      int numberOne, numberTwo, numberThree, numberFour; //Se definen las variables qe se a utilizar.
      /*Inicio del ingreso de valore.*/
      System.out.println("Ingresar el primer numero");
      numberOne =input.nextInt();
      System.out.println("Ingresar el segundo numero");
      numberTwo =input.nextInt();
      System.out.println("Ingresar el tercer numero:");
      numberThree =input.nextInt();
      /*Fin del ingreso de valore.*/
      if ((numberOne > numberTwo) && (numberOne > numberThree)){
         numberFour = numberOne;
      }
      else if (numberOne > numberThree){
         numberFour = numberTwo;
      }
      else{
         numberFour = numberThree;
      }
      System.out.println("El numero mayor es:" + numberFour);
      input.close();
   }
}
