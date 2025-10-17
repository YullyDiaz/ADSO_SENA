package EnvironmentManagement;

import java.util.Scanner;

public class Main {// Clase principal con menú
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EnvironmentSystem envManager = new EnvironmentSystem();
        int option;
        
        System.out.println("SISTEMA DE GESTIÓN DE AMBIENTES");
        
        do {// Menú principal
            System.out.println("MENÚ PRINCIPAL");
            System.out.println("1. Registrar ciudad ");
            System.out.println("2. Registrar sede ");
            System.out.println("3. Registrar ambiente ");
            System.out.println("4. Registrar instructor ");
            System.out.println("5. Asignar instructor a ambiente ");
            System.out.println("6. Registrar coordinador ");
            System.out.println("7. Generar reporte completo");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            
            option = scanner.nextInt();
            
            switch (option) {
                case 1:
                    envManager.registerCity();
                    break;
                case 2:
                    envManager.registerHeadquarter();
                    break;
                case 3:
                    envManager.registerEnvironment();
                    break;
                case 4:
                    envManager.registerInstructor();
                    break;
                case 5:
                    envManager.assignInstructorToEnvironment();
                    break;
                case 6:
                    envManager.registerAndAssignCoordinator();
                    break;
                case 7:
                    envManager.generateCompleteReport();
                    break;
                case 8:
                    System.out.println("Saliendo del sistema.");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (option != 8);
        
        scanner.close();
    }
}
