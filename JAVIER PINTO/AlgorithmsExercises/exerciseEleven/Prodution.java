package exerciseEleven;
/*Se tiene registrado la producción (unidades) logradas por un operario lo largo de la semana (lunes a sábado). Elabore un algoritmo que nos muestre o nos diga si el operario recibirá incentivos sabiendo que el promedio de producción mínima es de 100 unidades.*/

import java.util.Scanner; //Importa la clase Scanner para leer los datos igresados desde la consola.
public class Prodution { //Define la clase Prodution
    public static void main(String[] args) { //Define el metodo main para la entrada.
        Scanner input = new Scanner(System.in); //Lee la entrada.

        int numberOne, numberTwo, numberThree, numberFour, numberFive, numberSix, numberSeven, numberEight; //Se definen las variables qe se a utilizar.
        /*Inicio del ingreso de valore.*/
        System.out.println("Ingresar la producción del dia lunes");
        numberOne =input.nextInt();
        System.out.println("Ingresar la producción del dia Martes");
        numberTwo =input.nextInt();
        System.out.println("Ingresar la producción del dia Miercoles");
        numberThree =input.nextInt();
        System.out.println("Ingresar la producción del dia Jueves");
        numberFour =input.nextInt();
        System.out.println("Ingresar la producción del dia Viernes");
        numberFive =input.nextInt();
        System.out.println("Ingresar la producción del dia Sabado");
        numberSix =input.nextInt();
        /*Fin del ingreso de valore.*/
        /*Inicio de las operaciones.*/
        numberSeven = (numberOne + numberTwo + numberThree + numberFour + numberFive + numberSix);
        numberEight = numberSeven / 6;
        /*Fin de las operaciones.*/
        if (numberEight >= 100){
            System.out.println("Recibe Incentivos");
        }
        else {
            System.out.println("No recibe Incentivos");
        }
        input.close();
    }
    
}
