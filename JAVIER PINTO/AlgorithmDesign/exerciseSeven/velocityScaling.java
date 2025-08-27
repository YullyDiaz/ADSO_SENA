/*Supongamos que cada noche disponemos de una hora de CPU para ejecutar cierto programa y que con esa hora tenemos suficiente tiempo para ejecutar un programa con una entrada, a lo sumo, de tamaño n= 1 000 000. En esta situación nuestro jefe compra una máquina 100 veces más rápida que la vieja. Ahora ¿cuál es el mayor tamaño de entrada que podrá gestionar nuestro programa en una hora, si su complejidad T(n) fuera (para alguna constante ki)? 
(a) k1 n 
(b) k2 n2 
(c) k3 10n*/
package exerciseSeven;

public class velocityScaling {
    
    public static void main(String[] args) {
        long entry = 1_000_000L;
        double availableHours = 1.0;

        // Factor de mejora de la máquina (cuántas veces más rápida es la nueva máquina)
        double factorVelocity = 100.0; // La nueva máquina es 100 veces más rápida

        System.out.println("Tiempo disponible (sigue siendo): " + availableHours + " hora(s)");
        System.out.println("Tamaño de entrada inicial con máquina vieja: n = " + entry);
        System.out.println("Nueva máquina es " + factorVelocity + " veces más rápida.");

        long n2_lineal = (long) (entry * factorVelocity); // Calcular el nuevo tamaño de entrada para O(n)
        System.out.println("Si T(n) es O(n), con una máquina 100x más rápida, en la misma hora podemos manejar una entrada de tamaño: " + n2_lineal);

        long n2_cuadratica = (long) (entry * Math.sqrt(factorVelocity)); // Calcular el nuevo tamaño de entrada para O(n^2)
        System.out.println("Si T(n) es O(n^2), con una máquina 100x más rápida, en la misma hora podemos manejar una entrada de tamaño: " + n2_cuadratica);

        double log10_factorVelocidad = Math.log10(factorVelocity); // Calcular el logaritmo base 10 del factor de velocidad
        long n2_exponencial = (long) (entry + log10_factorVelocidad);
        System.out.println("Si T(n) es O(10^n), con una máquina 100x más rápida, en la misma hora podemos manejar una entrada de tamaño: " + n2_exponencial);        
    }
}
