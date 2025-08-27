//Se realiza un Switch en donde se van a incluir los 115 ejercicios en donde se emplean funciones f(n), g(n) y h(n). Las variables que vamos a emplear serán globales para asi dinamizar el código.
package exerciseSwitch;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main{ //Se definde la calse Main
    //Es necesario este metódo para el ejercicio 4.
    public static long calculateT(int x) { // Método para calcular el coste de G(n) en líneas generadas
        long lines = 0;

        for (int i = 1; i <= x; i++) { // Bucle para iterar desde 1 hasta x
            for (int j = 1; j <= i; j++) {
                lines++;
            }
        }

        if (x > 0) { // Si x es mayor que 0, se llama recursivamente a la función
            for (int i = 1; i <= 4; i++) {
                lines += calculateT(x / 2);
            }
        }
        return lines;
    } //Fin del metódo.
    //Es necesario este metódo para el ejercicio 5.
    public static boolean esTriangular(int n) {
        if (n < 1) { // Validación de entrada según el problema (n >= 1)
            System.out.println("Error: El número debe ser un entero positivo (n >= 1).");
            return false; 
        }

        int sumaActual = 0; 
        int k = 1;          
        
        while (sumaActual < n) { // Bucle para ir sumando 1, luego 2, luego 3, etc., hasta que la suma alcance o exceda n.
            sumaActual += k; 
            k++;
        }
        return sumaActual == n;
    }
    //Fin del metódo.
    //Es necesario este metódo para el ejercicio 9.
    public static double solveRecurrence(int n) {
        if (n == 1) { // Caso base de la recurrencia
            return 10.0;
        }
        if (n > 1) { // La condición es n > 1
            double logN = Math.log(n) / Math.log(2); 
            return 2 * solveRecurrence(n / 4) + logN;
        }
        return 0.0; 
    }
    //Fin del metódo.
    //Es necesario estos metódos para el enercicio 10.
    public static int parcial(int m) { //Se implementa la función parcial tal como se definió en el ejercicio.
        if (m == 1) {
            return 1;
        } else {
            return 2 * parcial(m - 1);
        }
    }
    public static int totalA(int n) { //Implementa la función total de ejercicio A que depende de parcial.
        if (n == 1) {
            return 1;
        } else {
            // total(n-1) + 2 * parcial(n-1)
            return totalA(n - 1) + 2 * parcial(n - 1);
        }
    }
    public static int totalB(int n, int m) { //Implementa la función total del ejercicio B con dos parámetros.
        if (n == 1) {
            return m;
        } else {
            // m + total(n-1, 2 * m)
            return m + totalB(n - 1, 2 * m);
        }
    }
    public static int getPositiveInt(Scanner scanner) {
            int value;
            while (true) {
                if (scanner.hasNextInt()) {
                    value = scanner.nextInt();
                    if (value > 0) {
                        break;
                    } else {
                        System.out.print("Por favor, ingrese un número entero positivo: ");
                    }
                } else {
                    System.out.print("Entrada inválida. Por favor, ingrese un número entero: ");
                    scanner.next();
                }
            }
            // Eliminada la línea de impresión incorrecta de aquí
            return value;
        }
    //Fin del metódo.
    //Se necesitan estos metodos para el ejercicio 12.
        static class ElementoLista implements Comparable<ElementoLista> {
        int value;
        int indiceLista;
        int indiceEnLista;
        public ElementoLista(int valor, int indiceLista, int indiceEnLista) {
            this.value = valor;
            this.indiceLista = indiceLista;
            this.indiceEnLista = indiceEnLista;
        }
        @Override
        public int compareTo(ElementoLista otro) {
            return Integer.compare(this.value, otro.value);
        }
    }
    public static void customSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        int n = arr.length;
        List<List<Integer>> sublists = new ArrayList<>();
        // Divide en n/2 trozos de tamaño 2 y los ordena
        for (int i = 0; i < n; i += 2) {
            List<Integer> sublist = new ArrayList<>();
            sublist.add(arr[i]);
            if (i + 1 < n) {
                sublist.add(arr[i + 1]);
                if (sublist.get(0) > sublist.get(1)) {
                    int temp = sublist.get(0);
                    sublist.set(0, sublist.get(1));
                    sublist.set(1, temp);
                }
            }
            sublists.add(sublist);
        }
        // Fusiona las n/2 secuencias usando un min-heap
        PriorityQueue<ElementoLista> minHeap = new PriorityQueue<>();
        for (int i = 0; i < sublists.size(); i++) {
            if (!sublists.get(i).isEmpty()) {
                minHeap.add(new ElementoLista(sublists.get(i).get(0), i, 0));
            }
        }
        int currentIndex = 0;
        while (!minHeap.isEmpty()) {
            ElementoLista minElement = minHeap.poll();
            arr[currentIndex++] = minElement.value;
            int nextElementIndex = minElement.indiceEnLista + 1;
            if (nextElementIndex < sublists.get(minElement.indiceLista).size()) {
                minHeap.add(new ElementoLista(
                    sublists.get(minElement.indiceLista).get(nextElementIndex),
                    minElement.indiceLista,
                    nextElementIndex
                ));
            }
        }
    //Fin del metodo.
    //Se necesita el metodo para el ejercicio 13.
    public static boolean esPalindromo(String C, int i, int j) {
        if (i >= j) {
            return true;
        } else if (C.charAt(i) != C.charAt(j)) {
            return false;
        } else {
            return esPalindromo(C, i + 1, j - 1);
        }
    }
    //Fin del metodo
    //Es necesario este metódo para el ejercicio 15.
         // Clase para devolver el Max y Min juntos
    static class Result {
        int max;
        int min;

        Result(int max, int min) {
            this.max = max;
            this.min = min;
        }
    }
    // Función MAX_MIN (T[i..j], Max, Min)
    public static Result findMaxMin(int[] T, int i, int j) {
        int Max, Min;
        // Caso para un elemento
        if (i == j) {
            return new Result(T[i], T[i]);
        }
        // Caso para dos elementos
        if (i + 1 == j) {
            if (T[i] <= T[j]) { // 1 comparación
                Max = T[j];
                Min = T[i];
            } else {
                Max = T[i];
                Min = T[j];
            }
            return new Result(Max, Min);
        }
        // Caso recursivo para más de dos elementos
        if (T[i] <= T[j]) { // 1 comparación
            Max = T[j];
            Min = T[i];
        } else {
            Max = T[i];
            Min = T[j];
        }
        // Llamada recursiva al subproblema
        Result auxResult = findMaxMin(T, i + 1, j - 1);
        // Combinar resultados
        if (Max < auxResult.max) { // 1 comparación
            Max = auxResult.max;
        }
        if (auxResult.min < Min) { // 1 comparación
            Min = auxResult.min;
        }
        return new Result(Max, Min);
    }
    //Fin del metodo.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long entry = 1_000_000L;
        double timeBeginHours = 1.0; // 1 hora
        double timeNewHours = 3.0;   // 3 horas
        double enlargementFactor = 0;
        long entry = 1_000_000L;
        double availableHours = 1.0;
        double defference, n, f, g, f_n, g_n, h_n, a, b, logA_n, logB_n, proportionality_const, exp_logA, exp_logB, log_fn, log_hn, proportionality_fh, proportionality_logfh, proportionality;
        System.out.println("Ingresa el numero del caso seleccionado, los cuales van del 1 al 15");
        int op = input.nextInt();

        switch(op){
            case 1:
                System.out.print("Ingrese la opción:");
                System.out.println("1: Cuando la diferencia de producción es considerable.");
                System.out.println("2: Cuando la diferencia de producción es mínima.");
                int option = input.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("Caso #1: Diferencia Θ(h(n))");
                        System.out.println("Ingrese el número de empleados de las panaderías: ");
                        n = input.nextDouble();
                        System.out.println("Teniendo en cuenta que la producción de la panadería B debe ser menor o igual a la  panadería A.");
                        System.out.println("Ingrese el número de pasteles que se hacen en la panadería A: ");
                        f = input.nextDouble();
                        System.out.println("Ingrese el número de pasteles que se hacen en la panadería B: ");
                        g = input.nextDouble();

                        f_n = f * n;
                        g_n = g * n;
                        defference = f_n - g_n;
                        System.out.println("La diferencia entre la panadería A y la panadería B es: " + defference);
                        System.out.println("Teniendo en cuenta esta diferencia, podemos decir que la panadería A produce "+defference+ " más pasteles que la panadería B.");
                    break;
                    case 2:
                        System.out.println("Caso #2: Diferencia de orden menor");
                        System.out.println("Ingrese el número de empleados de las panaderías: ");
                        n = input.nextDouble();
                
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
            break;
            case 2:
                System.out.println("Ingrese dos números mayores que 1 para comparar sus logaritmos:");
                a = input.nextDouble();
                b = input.nextDouble();

                for(long p: new long[]{10, 100, 1000, 10000}) { //Probamos con diferentes valores de n
                    logA_n = Math.log(p) / Math.log(a);
                    logB_n = Math.log(p) / Math.log(b);

                    proportionality_const = logA_n / logB_n;
                    System.out.println("Prporcionalidad de los logaritmos es: " + proportionality_const);

                    exp_logA = Math.pow(2, logA_n); // Esto es 2^(log_a(n))
                    exp_logB = Math.pow(2, logB_n); // Esto es 2^(log_b(n))
                    proportionality = exp_logA / exp_logB;
                    System.out.println("Prporcionalidad que no se mantiene constante en los algoritmos: " + proportionality);
                }
            break;
            case 3:
                System.out.println("Vamos a analizar y justificar la siguiente afirmaciónn:");
                System.out.println("(a) O(f(n)) = O(h(n)) ⇒ O(lgf(n)) = O(lgh(n))");
                for (long z: new long[]{10, 100, 1000, 10000}) { // Probamos con diferentes valores de n
                    f_n = z;
                    h_n = 2.0 * z; // h(n) es el doble de f(n)

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
                for (long y: new long[]{2, 10, 100, 1000, 10000}) { // Probamos con diferentes valores de n
                    f_n = y;
                    h_n = y * y; // h(n) es n al cuadrado
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
            break;
            case 4:
                long lines = 0;
                int x;
                for (int i = 1; i <= x; i++) { // Bucle para iterar desde 1 hasta x
                    for (int j = 1; j <= i; j++) {
                        lines++;
                    }
                }

                if (x > 0) { // Si x es mayor que 0, se llama recursivamente a la función
                    for (int i = 1; i <= 4; i++) {
                        lines += calculateT(x / 2);
                    }
                }
            break;
            case 5:
                while (true) { // Bucle para permitir múltiples pruebas
                    System.out.print("\nIngrese un entero positivo n (o 0 para salir): ");
                    int number = input.nextInt();
                    if (esTriangular(number)) {
                        System.out.println("El número " + number + " ES un número triangular.");
                    } else {
                        System.out.println("El número " + number + " NO es un número triangular.");
                    }
                }
            break;
            case 6:
            // Factor de aumento de tiempo (cuántas veces más tiempo tenemos)
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
            break;
            case 7:
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
            break;
            case 8:
                n = input.nextInt();
                int[] numbers = new int[n]; //Se crea el arreglo y se instancia.

                for(int i=0; i<n; i++){
                    System.out.println("Digite el valor para la posición "+(i+1)+" :");
                    numbers[i] = input.nextInt();
                }

                if (n == 1) {
                    System.out.println("El vector solo tiene un elemento: " + numbers[0]);
                    System.out.println("El valor Máximo es: " + numbers[0]);
                    System.out.println("El valor Mínimo es: " + numbers[0]);
                } else {
                    // Inicializamos el máximo y el mínimo con el primer elemento del vector
                    int findMax = numbers[0];
                    int findMin = numbers[0];

                    // Recorremos el resto del vector, empezando desde el segundo elemento (índice 1)
                    for (int i = 1; i < n; i++) {
                        int currentValue = numbers[i]; // El número que estamos mirando ahora

                        // Comparamos con el máximo y el minimo encontrado hasta el momento
                        if (currentValue > findMax) {
                            findMax = currentValue;
                        }
                        if (currentValue < findMin) {
                            findMin = currentValue; 
                        }
                    }
                    System.out.println("Su vector final es: " + Arrays.toString(numbers)); //Para mostrar los valores que tiene el vector.
                    System.out.println("El valor Máximo del vector es: " + findMax);
                    System.out.println("El valor Mínimo del vector es: " + findMin);
                }
            break;
            case 9:
                while (true) {
                if (input.hasNextInt()) {
                    n = input.nextInt();
                    if (n >= 1) {
                        break;
                    } else {
                        System.out.print("Por favor, ingrese un número entero positivo (n >= 1): ");
                    }
                } else {
                    System.out.print("Entrada inválida. Por favor, ingrese un número entero: ");
                    input.next(); // Limpiar la entrada inválida
                }
                }
                double result = solveRecurrence(n);
                System.out.printf("El valor de T(%d) es: %.4f%n", n, result); //Para incluir las variables en el texto.
            break;
            case 10:
                Scanner scanner = new Scanner(System.in);

                System.out.println("--- Análisis de Funciones Recursivas ---");

                System.out.print("Ingrese un valor para 'm' para la función parcial: ");
                int mVal = getPositiveInt(scanner);

                System.out.print("Ingrese un valor para 'n' para la función totalA: ");
                int nValA = getPositiveInt(scanner);

                System.out.print("Ingrese un valor para 'n' para la función totalB: ");
                int nValB = getPositiveInt(scanner);

                System.out.print("Ingrese un valor para 'm' para la función totalB: ");
                int mValB = getPositiveInt(scanner);

                System.out.println("Resultado de parcial(" + mVal + ") = " + parcial(mVal));
                System.out.println("Resultado de totalA(" + nValA + ") = " + totalA(nValA));
                System.out.println("Resultado de totalB(" + nValB + ", " + mValB + ") = " + totalB(nValB, mValB));
                //Fin de las llamadas y impresiones

            break;
            case 11:
                System.out.println("Este programa busca una subcadena (patrón B) dentro de una cadena principal (A).");
                System.out.print("\nIngrese la cadena principal (A): ");
                String A = scanner.nextLine();
                System.out.print("Ingrese la subcadena a buscar (B): ");
                String B = scanner.nextLine();

                Object[] result = stringSearch(A, B);
                boolean hallado = (Boolean) result[0];
                int comienzo = (Integer) result[1];

                System.out.println("\n--- Resultado ---");
                if (hallado) {
                    System.out.println("La subcadena '" + B + "' fue ENCONTRADA en '" + A + "'.");
                    System.out.println("Comienza en el índice (1-basado): " + comienzo);
                } else {
                    System.out.println("La subcadena '" + B + "' NO fue ENCONTRADA en '" + A + "'.");
                }
            break;
            case 12:
                System.out.print("Cantidad de elementos (n): ");
                int n = scanner.nextInt();
                int[] myArray = new int[n];
                System.out.println("Ingrese los elementos:");
                for (int i = 0; i < n; i++) {
                    System.out.print("Elemento " + (i + 1) + ": ");
                    myArray[i] = scanner.nextInt();
                }
                System.out.println("Original: " + Arrays.toString(myArray));
                customSort(myArray);
                System.out.println("Ordenado: " + Arrays.toString(myArray));
                System.out.println("Orden temporal: O(n log n).");
            break;
            case 13:
                System.out.print("Ingrese una cadena de texto: ");
                String cadena = scanner.nextLine();
                boolean resultado = esPalindromo(cadena, 0, cadena.length() - 1);
                if (resultado) {
                    System.out.println("La cadena '" + cadena + "' ES un palíndromo.");
                } else {
                    System.out.println("La cadena '" + cadena + "' NO es un palíndromo.");
                }
            break;
            case 14:
                System.out.println("Trivial: O(n^2)");
                System.out.println("Divide y Vencerás: O(n log^2 n)");
                int[] problemSizes = {100, 500, 1000, 5000, 10000}; 
                for (int n : problemSizes) {
                    System.out.println("\n--- Tamaño n: " + n + " ---");
                    long startTimeQuad = System.nanoTime();
                    runQuadraticAlgorithm(n);
                    long endTimeQuad = System.nanoTime();
                    long durationQuad = (endTimeQuad - startTimeQuad) / 1_000_000;
                    System.out.printf("Tiempo Cuadrático: %d ms%n", durationQuad);
                    long startTimeDnC = System.nanoTime();
                    runDivideAndConquerAlgorithm(n);
                    long endTimeDnC = System.nanoTime();
                    long durationDnC = (endTimeDnC - startTimeDnC) / 1_000_000;
                    System.out.printf("Tiempo Divide y Vencerás: %d ms%n", durationDnC);
                    if (durationDnC < durationQuad) {
                        System.out.println("=> Divide y Vencerás es MÁS RÁPIDO.");
                    } else {
                        System.out.println("=> Cuadrático es MÁS RÁPIDO (o similar).");
                    }
                }
                System.out.println("\nEn teoría, O(n log^2 n) es más eficiente que O(n^2).");
            break;
            case 15:
                System.out.print("Ingrese la cantidad de elementos en el vector: ");
                int n = scanner.nextInt();
                int[] myArray = new int[n];
                System.out.println("Ingrese los elementos:");
                for (int i = 0; i < n; i++) {
                    System.out.print("Elemento " + (i + 1) + ": ");
                    myArray[i] = scanner.nextInt();
                }
                System.out.println("\nVector: " + Arrays.toString(myArray));
                // Llamar a la función principal con el array completo
                Result finalResult = findMaxMin(myArray, 0, myArray.length - 1);
                System.out.println("Máximo: " + finalResult.max);
                System.out.println("Mínimo: " + finalResult.min);
                System.out.println("\nEl número de comparaciones es aproximadamente (3n/2 - 2).");
            break;
        }
    }
}