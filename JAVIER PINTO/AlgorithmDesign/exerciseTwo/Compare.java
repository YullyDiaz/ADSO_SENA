/*Ecuación: Demuestra que ∀a,b (a,b>1 ⇒ lga n ∈Θ(lgb n)). Si a≠b, ¿es cierto 2 lga n ∈    Θ(2 lgb n)? 
Ejemplo encontrar la proporcionalidad.*/
package exerciseTwo;
import java.util.Scanner;
public class Compare{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, logA_n, logB_n, proportionality_const, exp_logA, exp_logB, proportionality; //n es el numero de posibilidaes de la proporcionalidad.

        System.out.println("Bienvenido al programa de comparación de logaritmos.");
        System.out.println("Ingrese dos números mayores que 1 para comparar sus logaritmos:");
        a = scanner.nextDouble();
        b = scanner.nextDouble();

        for(long n: new long[]{10, 100, 1000, 10000}) { //Probamos con diferentes valores de n
            logA_n = Math.log(n) / Math.log(a);
            logB_n = Math.log(n) / Math.log(b);

            proportionality_const = logA_n / logB_n;
            System.out.println("Prporcionalidad de los logaritmos es: " + proportionality_const);

            exp_logA = Math.pow(2, logA_n); // Esto es 2^(log_a(n))
            exp_logB = Math.pow(2, logB_n); // Esto es 2^(log_b(n))
            proportionality = exp_logA / exp_logB;
            System.out.println("Prporcionalidad que no se mantiene constante en los algoritmos: " + proportionality);
        }
        scanner.close();
    }
}