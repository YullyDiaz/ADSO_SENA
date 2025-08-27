//Elabore un algoritmo que solicite un número entero y dierente a cero, e indique si es par.
package exerciseEighteen;

import java.util.Scanner; //Importa la clase Scanner para leer los datos igresados desde la consola.
public class Number { //Define la clase Number

    public static void main(String[] args) { //Define el metodo main para la entrada.
        Scanner input = new Scanner(System.in);
        int numberOne,numberTwo, nunberThree; //Lee las variables
        System.out.println("Ingresa un numero entero diferente a cero");
        numberOne =input.nextInt();
        numberTwo = numberOne / 2;
        nunberThree = numberOne - (numberTwo * 2);
        if (nunberThree == 0){ //Condicional para sacar los pares e impares
            System.out.println("The number "+numberOne+" is even.");
        }else{
            System.out.println("The number "+numberOne+" is odd.");
        }
        input.close();
    }
}
