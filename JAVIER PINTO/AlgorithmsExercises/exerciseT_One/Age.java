//Elabora un algoritmo que solicite la edad de 200 personas, y que muestre cuentos son mayores de edad y menores de edad hay.
package exerciseT_One;

import java.util.Scanner; //Importa la clase Scanner para leer los datos igresados desde la consola.    
public class Age { //Define la clase Age
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        //Se declaran las variables
        int numberOne,numberTwo,counter,nunberThree;
        numberOne = 0;
        numberTwo = 0;
        for (counter = 1; counter <= 3; counter++){ //Ciclo que nos va a pedir las edades y además a definir si es mayor de edad o no.
            System.out.println("Ingresa la edad");
            nunberThree =input.nextInt();

            if (nunberThree < 18 ){
                numberOne = numberOne + 1;
            }else{
                numberTwo = numberTwo + 1;
            }
        }
        System.out.println("La cantidad de mayores es:" + numberTwo);
        System.out.println("La cantidad de menores es:" + numberOne);

        input.close();
    }
}
