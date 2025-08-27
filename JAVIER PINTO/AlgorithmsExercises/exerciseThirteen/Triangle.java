package exerciseThirteen;
/*Elabora un algoritmo que sirva para identificar el tipo de triangulo conociendo sus tres lados.*/

import java.util.Scanner; //Importa la clase Scanner para leer los datos igresados desde la consola.
public class Triangle {  //Define la clase Triangle
    public static void main(String[] args) { //Define el metodo main para la entrada.
    Scanner input = new Scanner(System.in); //Lee la entrada.
    int numberOne, numberTwo, numberThree;
    String textOne;//Se definen las variables qe se a utilizar.
    /*Inicio del ingreso de valore.*/
    System.out.println("Ingresar el primer lado");
    numberOne =input.nextInt();

    System.out.println("Ingresar el segundo lado");
    numberTwo =input.nextInt();

    System.out.println("Ingresar el tercer lado");
    numberThree =input.nextInt();
    /*Fin del ingreso de valore.*/
    //Condicional donde se halla la calse de triangulo
    if ((numberOne != numberTwo) && (numberTwo != numberThree) && (numberThree != numberOne)){
        textOne = "Escaleno";
    }
    else if ((numberOne == numberTwo) && (numberTwo == numberThree)){
        textOne = "Equilatero";
    }
    else{
        textOne = "Isósceles";
    }
    System.out.println("El tipo de triangulo es:" + textOne);
    input.close();
    }
}
