/*Se requiere el algoritmo para elaborar la planilla de un empleado. Para ello se dispone de sus horas laboradas en el mes, así como de la tarifa por hora*/

import java.util.Scanner; //Importa la clase Scanner para leer los datos igresados desde la consola.

public class Template { //Define la clase Template
    public static void main(String[] args) { //Define el metodo main para la entrada.
        Scanner ingresar = new Scanner (System.in);//Lee la entrada.
        int numberOne, numberTwo, numberThree;//Se definen las variables qe se a utilizar.
        /*Inicio del ingreso de valore.*/
        System.out.println("Ingresar las horas laboradas");
        numberOne =ingresar.nextInt();
        System.out.println("Ingresar la tarifa por hora");
        numberTwo =ingresar.nextInt();
        /*Fin del ingreso de valore.*/

        numberThree = numberOne * numberTwo;
        System.out.println("Planilla: " + numberThree);

        ingresar.close();
    }
}