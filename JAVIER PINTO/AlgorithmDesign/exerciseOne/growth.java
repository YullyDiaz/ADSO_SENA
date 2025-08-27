/*Ecuación: Supuesto que  ∀n≥n0  f(n)≥g(n)≥0  y que  f(n),g(n) ∈ Θ(h(n)), ¿qué puedes decir del orden de f(n)-g(n)?
Ejemplo con una panadería.*/
package exerciseOne;
import java.util.Scanner;
public class growth { //Se define la clase growth
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        double defference, //Se declaran las variables (n = numeros de empleados en cada panadería)
        n, //Variable para el número de empleados.
        f, //Variable para pastel por persona panadería A.
        g, //Variable para pastel por persona panadería B.
        f_n, g_n, //Variables para la producción de pasteles en cada panadería.
        h_n; //Número de personas.; 
        int option; 
        
        System.out.println("Bienvenido al programa de comparación de producción de panaderías.");
        System.out.print("Ingrese la opción:");
        System.out.println("1: Cuando la diferencia de producción es considerable.");
        System.out.println("2: Cuando la diferencia de producción es mínima.");
        option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Caso #1: Diferencia Θ(h(n))");
                System.out.println("Ingrese el número de empleados de las panaderías: ");
                n = scanner.nextDouble();
                System.out.println("Teniendo en cuenta que la producción de la panadería B debe ser menor o igual a la  panadería A.");
                System.out.println("Ingrese el número de pasteles que se hacen en la panadería A: ");
                f = scanner.nextDouble();
                System.out.println("Ingrese el número de pasteles que se hacen en la panadería B: ");
                g = scanner.nextDouble();

                f_n = f * n;
                g_n = g * n;
                defference = f_n - g_n;
                System.out.println("La diferencia entre la panadería A y la panadería B es: " + defference);
                System.out.println("Teniendo en cuenta esta diferencia, podemos decir que la panadería A produce "+defference+ " más pasteles que la panadería B.");
            break;
            case 2:
                System.out.println("Caso #2: Diferencia de orden menor");
                System.out.println("Ingrese el número de empleados de las panaderías: ");
                n = scanner.nextDouble();
        
                f_n = n + Math.log(n);
                g_n = n;
                defference = f_n - g_n;
                System.out.println("La diferencia entre la panadería A y la panadería B es: " + defference);
                System.out.println("Teniendo en cuenta esta diferencia, podemos decir que la panadería A produce "+defference+ " más pasteles que la panadería B.");
            break;
            default:
                System.out.println("Opción no válida. Por favor, elija 1 o 2.");
            break;
        }
        System.out.println("Gracias por usar el programa.");
        scanner.close();       
    }
}       