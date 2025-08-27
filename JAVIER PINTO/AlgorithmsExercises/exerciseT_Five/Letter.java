//Elaborar un algoritmo que solicite ingresar las letras hasta que ingrese una vocal.
package exerciseT_Five;

import java.util.Scanner; //Importa la clase Scanner para leer los datos igresados desde la consola.
public class Letter { //Define la variable Letter
    public static void main(String[] args) { //Define el metodo main para la entrada.
        Scanner input = new Scanner(System.in);
        //Se declaran las variables
        char letter;
        String flag;
        System.out.println("Ingresar las letras");
        flag = "V";
        while (flag.equals("V")){
            letter =input.next().charAt(0);
            System.out.println(letter);
            switch (letter) { //Verifica si la letra ingresada es una vocal o no.
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                flag = "R";
                    break;
                default:
                flag = "V";
                    break;
            }
        }
        System.out.println("Fin del programa ingresaste una vocal");
        input.close();
    }
    
}
