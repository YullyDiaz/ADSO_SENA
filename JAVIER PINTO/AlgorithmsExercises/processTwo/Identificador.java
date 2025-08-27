package proceso2;

import java.util.Scanner;
public class Identificador {
public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.print("Ingrese la cantidad de números : ");
         int cantidad = input.nextInt();
         int pares = 0;
         int impares = 0;
     System.out.println("Ingrese " + cantidad + " números:");
  for (int i = 0; i < cantidad; i++) {
         int numero = input.nextInt();
  if (numero % 2 == 0) {
     pares++;
     System.out.println(numero + " es par.");
  } else {
     impares++;
     System.out.println(numero + " es impar.");
}
  if (esPrimo(numero)) {
     System.out.println(numero + " es primo.");
} else {
     System.out.println(numero + " no es primo.");
}
}
     System.out.println("Total de números pares: " + pares);
     System.out.println("Total de números impares: " + impares);
     input.close();
     }
 public static boolean esPrimo(int numero) {
   if (numero <= 1) {
    return false;
 }
   for (int i = 2; i <= Math.sqrt(numero); i++) {
     if (numero % i == 0) {
        return false;
    }
 } return true; }
}