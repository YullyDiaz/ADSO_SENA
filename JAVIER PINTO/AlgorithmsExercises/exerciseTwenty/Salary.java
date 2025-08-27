//Elabore un algoritmo que permita mostrar el sueldo promedio de un grupo de empleados.
package exerciseTwenty;

import java.util.Scanner;  //Importa la clase Scanner para leer los datos igresados desde la consola.
public class Salary { //Define la clase Winner
    public static void main(String[] args) { //Define el metodo main para la entrada.
        Scanner input = new Scanner(System.in);
        //Se declaran las variables
        int numberOne,counter;
        double numberTwo,nunberThree,numberFour;
        System.out.println("Ingresar el numero de empleados");
        numberOne =input.nextInt();
        nunberThree = 0;
        for (counter = 1; counter <= numberOne; counter++){ //Mostrará y hara la obtencion del promedio de los sueldos que se le haya indicado.
            System.out.println("Ingresar los sueldos de los empleados");
            numberTwo =input.nextDouble();

            nunberThree = numberTwo + numberTwo;
        }
        numberFour = nunberThree / numberOne;
        System.out.println("El sueldo promedio es:" + numberFour);
        input.close();
    }
    
}
