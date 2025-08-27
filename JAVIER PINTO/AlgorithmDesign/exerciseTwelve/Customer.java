package exerciseTwelve;
import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class Customer {
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
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Ordenamiento Personalizado ---");
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
        scanner.close();
    }
}
