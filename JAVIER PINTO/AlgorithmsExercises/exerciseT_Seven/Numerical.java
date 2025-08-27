//Elabore un algoritmo que solicite 2 números, un operador artimetico y luego debe de mostrar el resultado de la operación correspondiente.
package exerciseT_Seven;

import java.util.Scanner; //Importa la clase Scanner para leer los datos igresados desde la consola.
public class Numerical { //Define la clase Numerical
    public static void main(String[] args) { //Define el metodo main para la entrada.
        Scanner input = new Scanner(System.in);
        //Se declaran las variables
        int numberOne,numberTwo,numberThree;
        String option;
        //Se ingresan los numeros
        System.out.println("Ingresa un operador aritmético");
        option =input.nextLine();
        System.out.println("Ingresa el primer número");
        numberOne =input.nextInt();
        System.out.println("Ingresa el segundo número");
        numberTwo =input.nextInt();

        switch (option) { //Los caso que se ejecutan segun los datos recibidos.
            case "+" :
            numberThree = numberOne + numberTwo;
            System.out.println(numberThree);
            break;

            case "-" :
            numberThree = numberOne - numberTwo;
            System.out.println(numberThree);
            break;

            case "*" :
            numberThree = numberOne * numberTwo;
            System.out.println(numberThree);
            break;

            case "/" :
            numberThree = numberOne * numberTwo;
            System.out.println(numberThree);
            break;

            default:
            numberThree = 0;
            break;
        }
        input.close();
    }
}
