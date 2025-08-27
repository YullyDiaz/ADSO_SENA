package exerciseSix;

public class cpu {
    public static void main(String[] args) {
        long entry = 1_000_000L;
        double timeBeginHours = 1.0; // 1 hora
        double timeNewHours = 3.0;   // 3 horas

        // Factor de aumento de tiempo (cuántas veces más tiempo tenemos)
        double enlargementFactor = timeNewHours / timeBeginHours;

        System.out.println("Tiempo inicial disponible: " + timeBeginHours + " hora(s) Tamaño de entrada = " + entry);
        System.out.println("Tiempo nuevo disponible:   " + timeNewHours + " hora(s) Factor de aumento: " + enlargementFactor);
        // Calcular la lineal
        long n2_lineal = (long) (entry * enlargementFactor);
        System.out.println("Si T(n) es O(n), con 3 veces más tiempo podemos manejar una entrada de tamaño: " + n2_lineal);
        //Calcular con la cuadrática
        long n2_cuadratica = (long) (entry * Math.sqrt(enlargementFactor));
        System.out.println("Si T(n) es O(n^2), con 3 veces más tiempo podemos manejar una entrada de tamaño: " + n2_cuadratica);
        // Calcular con la cúbica
        double log10_factor = Math.log10(enlargementFactor);
        long n2_exponencial = (long) (entry + log10_factor);
        System.out.println("Si T(n) es O(10^n), con 3 veces más tiempo podemos manejar una entrada de tamaño: " + n2_exponencial);        
    }
}
