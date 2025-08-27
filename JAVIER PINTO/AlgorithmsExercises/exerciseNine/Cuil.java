/*Elabora un algoritmo que permita averiguar si una persona debe sacar su CUIL, sabiendo su año de nacimiento. El Código Único de Identificación Laboral (CUIL) es el número que se otorga a todo trabajador al inicio de su actividad laboral en relación de dependencia (mayores de 17 años) que pertenezca al Sistema Integrado de Jubilaciones y Pensiones (SIJP), y a toda otra persona que gestione alguna prestación o servicio de la Seguridad Social en la República Argentina*/

import java.util.Scanner; //Importa la clase Scanner para leer los datos igresados desde la consola.

public class Cuil { //Define la clase Cuil
    public static void main(String[] args) { //Define el metodo main para la entrada.
        Scanner input = new Scanner(System.in); //Lee la entrada.
        int numberOne, numberTwo, numberThree; //Se definen las variables qe se a utilizar.
        /*Inicio del ingreso de valore.*/
        System.out.println("Ingresar su año de nacimiento");
        numberOne =input.nextInt();
        System.out.println("Ingresar el año actual");
        numberTwo =input.nextInt();
        /*Fin del ingreso de valore.*/

        numberThree =numberTwo - numberOne;
        //Condicional para determinar si debe solicitar el CUIL
        if ( numberThree > 17){
            System.out.println("Debe sacar su CUIL");
        }
        else {
            System.out.println( "No debe sacar su CUIL todavia");
        }
        input.close(); 
    }
}