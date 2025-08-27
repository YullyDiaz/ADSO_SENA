//Se desea leer un número entero de 2 cifras y que se muestre el número de unidades, decenas que lo componen
package exerciseSeventeen;

import java.util.Scanner; //Importa la clase Scanner para leer los datos igresados desde la consola.
public class Numbers { //Define la clase Numbers
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Define el metodo main para la entrada.
        double numberOne, numberTwo, numberThree; //Lee las variables
        System.out.println("Ingresar un numero entero de dos digitos");
        numberOne =input.nextInt();
        //Inicio de la operaciones
        numberTwo = (numberOne / 10);
        numberThree = numberOne - (numberTwo * 10);
        //Fin de la operaciones
        //Se imprimen los resultados
        System.out.println("Decenas:" + numberTwo);
        System.out.println("Unidades:" + numberThree);
        input.close();        
    }
}
