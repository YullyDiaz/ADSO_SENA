//Elaborar un algoritmo que muestre 10 números enteros a partir de 1 excepto los pares
package exerciseT_Three;

public class NumbersEntegers { //Define la clase NumbersEntegers
        public static void main(String[] args) { //Define el metodo main para la entrada.
        int numberOne,counter; //Se declaran las variables
        counter = 0;
        for (numberOne = 1; counter < 10; numberOne++){ //Ciclo que hace el proceso de mostrar los números enteros a partir de 1 excepto los pares.
            if(numberOne % 2 != 0){
                System.out.println(numberOne);
                counter++;
            }
        }
    }
}
