package ClinicManagement;

import java.util.Scanner;

public class Main {// Clase principal para ejecutar el sistema
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClinicSystem clinicManager = new ClinicSystem();
        int option;
        
        // Inicializar sistema
        clinicManager.initializeClinics();
        clinicManager.initializeAmbulances();
        
        do {// Menú principal
            System.out.println("       SISTEMA DE GESTIÓN DE CLÍNICAS");
            System.out.println("1. Simular solicitud de ambulancia");
            System.out.println("2. Mostrar pacientes no transferibles");
            System.out.println("3. Generar reporte completo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            
            option = scanner.nextInt();
            
            switch (option) {
                case 1:
                    clinicManager.simulateAmbulanceRequest();
                    break;
                case 2:
                    clinicManager.showNonTransferablePatients();
                    break;
                case 3:
                    clinicManager.generateCompleteReport();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema.");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (option != 4);
        
        scanner.close();
    }
}

