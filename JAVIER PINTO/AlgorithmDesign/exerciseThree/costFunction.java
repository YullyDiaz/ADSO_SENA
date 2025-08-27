/*Justifica si son ciertas o falsas las afirmaciones siguientes, siendo f(n) y h(n) funciones de coste resultantes de analizar algoritmos: 
(a) O(f(n)) = O(h(n)) ⇒ O(lgf(n)) = O(lgh(n))
(b) O(lgf(n)) = O(lgh(n)) ⇒ O(f))) = O(h(n))*/
package exerciseThree;
import java.util.Scanner;
public class costFunction{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double f_n, h_n, log_fn, log_hn, proportionality_fh, proportionality_logfh;

        System.out.println("Bienvenido al programa de comparación de funciones de coste.");
        System.out.println("Vamos a analizar y justificar la siguiente afirmaciónn:");
        System.out.println("(a) O(f(n)) = O(h(n)) ⇒ O(lgf(n)) = O(lgh(n))");
        for (long n: new long[]{10, 100, 1000, 10000}) { // Probamos con diferentes valores de n
            f_n = n;
            h_n = 2.0 * n; // h(n) es el doble de f(n)

            proportionality_fh= f_n / h_n; //Calculamos la proporcionalidad de f(n) y h(n)
            log_fn = Math.log(f_n); //Sacamos el logaritmo natural
            log_hn = Math.log(h_n); 

            proportionality_logfh = log_fn / log_hn; //Calculamos la proporcionalidad de los logaritmos
            System.out.println("La afirmación A es cierta ya que:");
            System.out.println("f(n) = " + f_n + ", h(n) = " + h_n);
            System.out.println("log(f(n)) = " + log_fn + ", log(h(n)) = " + log_hn);
            System.out.println("La proporcionalidad de f(n) y h(n) es: " + proportionality_fh);
            System.out.println("La proporcionalidad de los logaritmos es: " + proportionality_logfh);
        }

        System.out.println("Vamos a analizar y justificar la siguiente afirmaciónn:");
        System.out.println("(b) O(lgf(n)) = O(lgh(n)) ⇒ O(f))) = O(h(n))");
        for (long n: new long[]{2, 10, 100, 1000, 10000}) { // Probamos con diferentes valores de n
            f_n = n;
            h_n = n * n; // h(n) es n al cuadrado
            proportionality_fh= f_n / h_n; //Calculamos la proporcionalidad de f(n) y h(n)
            log_fn = Math.log(f_n);
            log_hn = Math.log(h_n);

            proportionality_logfh = log_fn / log_hn; //Sacamos la proporcionalidad de los logaritmos
            System.out.println("La afirmación B es falsa ya que:");
            System.out.println("f(n) = " + f_n + ", h(n) = " + h_n);
            System.out.println("log(f(n)) = " + log_fn + ", log(h(n)) = " + log_hn);
            System.out.println("La proporcionalidad de f(n) y h(n) es: " + proportionality_fh);
            System.out.println("La proporcionalidad de los logaritmos es: " + proportionality_logfh);
        }
        scanner.close();  
    }
    
}