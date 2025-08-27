//Elabore un algoritmo que permita ingresar el monto de venta alcanzado por un vendedor durante el mes, luego de calcular la bonificación que le corresponde
package exerciseFifteen;

import java.util.Scanner; //Importa la clase Scanner para leer los datos igresados desde la consola.
public class Sale { //Define la clase Sale
    public static void main(String[] args) { //Define el metodo main para la entrada.
        Scanner input = new Scanner(System.in); //Lee la entrada.
        /*Inicio del ingreso de valore.*/
        int numberOne;
        int numberTwo = 0;
        /*Fin del ingreso de valore.*/
        System.out.println("Ingrese el monto de venta alcanzado:");
        numberOne =input.nextInt();
        //Inicio de las operaciones
        if (numberOne >= 0 && numberOne <= 1000) {
            numberTwo = (0 * numberOne) / 100;
        }else if (numberOne >= 1000 && numberOne < 5000){
            numberTwo = (3 * numberOne) / 100;
        }else if (numberOne >= 5000 && numberOne < 20000){
            numberTwo = (5 * numberOne) / 100;
        }else if (numberOne >= 20000){
            numberTwo = (8 * numberOne) / 100;
        }else {
            numberOne = 0;     
        }
        //Fin de las operaciones
        //Se imprimen los resultados
        System.out.println("El total de bonificación es:" + numberTwo);
        input.close();

        

    }
    
}
