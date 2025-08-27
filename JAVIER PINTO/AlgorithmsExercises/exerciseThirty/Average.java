//Elabore un algoritmo que solicite 2 numeros y muestre el promedio de ambos.
package exerciseThirty;

import java.util.Scanner; //Importa la clase Scanner para leer los datos ingresados desde la consola.
public class Average { //Define la clase Average
    public static void main(String[] args) {//Define el metodo main para la entrada.
        Scanner input = new Scanner(System.in);
        //Se declaran las variables
        int numberOne,numberTwo,numberThree;
        //Se solicitan los numeros y se realiza la operacion del promedio.
        System.out.println("Ingresar el primer numero");
        numberOne =input.nextInt();
        System.out.println("Ingresar el segundo numero");
        numberTwo =input.nextInt();
        numberThree = (numberOne + numberTwo) / 2;
        System.out.println("El promedio de los numeros es:" + numberThree);

        input.close();
    }
    
}
