//Elabora un algoritmo que solicite un numero entero y muestre el nombre del mes correpondiente.
package exerciseTh_One;

import java.util.Scanner; // Importa la clase Scanner para leer los datos ingresados desde la consola.
public class Mes { // Define la clase Mes
    public static void main(String[] args) { // Define el metodo main para la entrada.
        Scanner input = new Scanner(System.in);
        // Se declaran las variables
        int numberOne;
        System.out.println("Ingrese un numero");
        numberOne =input.nextInt();

        switch (numberOne) { //Clasificacion de los meses del año.
            case 1:
            System.out.println("Enero");
                break;
            case 2: 
            System.out.println("Febrero");

            case 3:
            System.out.println("Marzo");
                break;
            
            case 4:
            System.out.println("Abril");
                break;
            
            case 5:
            System.out.println("Mayo");
                break;
            
            case 6:
            System.out.println("Junio");
                break;

            case 7:
            System.out.println("Julio");
                break;

            case 8:
            System.out.println("Agosto");
                break;

            case 9:
            System.out.println("septiembre");
                break;

            case 10:
            System.out.println("Octubre");
                break;

            case 11:
            System.out.println("Noviembre");
                break;

            case 12:
            System.out.println("Diciembre");
                break;
        
            default:
                break;
        }input.close();
    }
    
}
