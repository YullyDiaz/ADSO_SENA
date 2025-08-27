package exerciseT_Six;
// Elaborar un algoritmo que muestre los números de la serie de Fibonacci que sean menores a 1000. 0,1,1,2,3,5,8,13,21,34

public class Fibonacci { //Se define la clase Fibonacci
    public static void main(String[] args) {  //Define el metodo main para la entrada.
        //Inivio de definición de variables las variables
        int numberOne,numberTwo,numberThree;
        numberOne = 0;
        numberTwo = 1;
        numberThree = numberOne + numberTwo;
        //Fin de definición de las variables
        System.out.println(numberOne);
        System.out.println(numberTwo);
        while (numberThree < 100000){ //Ciclo que nos dara los numeros de la serie.
            System.out.println(numberThree);
            numberOne = numberTwo;
            numberTwo = numberThree;
            numberThree = numberOne + numberTwo;
            System.out.println(numberThree);
        }
    }
}
