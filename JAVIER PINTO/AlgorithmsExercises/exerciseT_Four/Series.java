//Elabore un algoritmo que muestre los terminos de la serie que sean menores a 1000
package exerciseT_Four;
import java.util.Scanner; //Importa la clase Scanner para leer los datos igresados desde la consola.
public class Series { //Define la clase Series
    public static void main(String[] args) { //Define el metodo main para la entrada.
        Scanner input = new Scanner(System.in);
        int series; //Se declaran las variables
        System.out.println("Ingresar la serie");
        series =input.nextInt();
        while (series < 1000){ //Ciclo que nos los numeros de serie.
            System.out.println(series);
            series = (series * 2 ) + 1;
        }
        input.close();
    }
}
