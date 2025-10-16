package AmbulanceManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SystemAmbulance systemManager = new SystemAmbulance();
        Report reportGenerator = new Report();
        int option;

        do {
            System.out.println("        Gestión de ambulancias");
            System.out.println("1. Registrar conductores (10 conductores)");
            System.out.println("2. Generar pacientes (100 pacientes)");
            System.out.println("3. Registrar fallecido (15 pacientes fallecidos)");
            System.out.println("4. Asignar conductores a los vehículos");
            System.out.println("5. Generar reporte");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    systemManager.registerDrivers();
                    break;
                case 2:
                    systemManager.generatePatients();
                    break;
                case 3:
                    systemManager.registerDeceased();
                    break;
                case 4:
                    systemManager.assignVehicles();
                    systemManager.assignPatientsToDrivers();
                    break;
                case 5:
                    reportGenerator.generateReport();
                    break;
                case 6:
                    System.out.println("Saliendo del sistema");
                    break;
                default:
                    System.out.println("Opción inválida intentelo de nuevo");
            }
        } while (option != 6);

        scanner.close();
    }
}
