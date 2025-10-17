package EnvironmentManagement;

import java.util.Scanner;

public class EnvironmentSystem {
    private Scanner scanner = new Scanner(System.in);
    
    public void registerCity() {//Registrar ciudad
        System.out.println("\nREGISTRAR CIUDAD");
        
        System.out.print("Nombre de la ciudad: ");
        String cityName = scanner.next();
        
        GlobalData.cities[GlobalData.cityCount] = cityName;
        GlobalData.cityCount++;
        
        System.out.println(" Ciudad registrada: " + cityName);
    }
    
    public void registerHeadquarter() {// Registrar sede
        if (GlobalData.cityCount == 0) {
            System.out.println("Primero debe registrar al menos una ciudad");
            return;
        }
        
        System.out.println("\nREGISTRAR SEDE");
        
        System.out.print("ID de la sede: ");
        String headquarterId = scanner.next();
        
        // Mostrar ciudades disponibles
        System.out.println("Ciudades disponibles:");
        for (int i = 0; i < GlobalData.cityCount; i++) {
            System.out.println((i+1) + ". " + GlobalData.cities[i]);
        }
        System.out.print("Seleccione ciudad (número): ");
        int cityIndex = scanner.nextInt() - 1;
        
        if (cityIndex < 0 || cityIndex >= GlobalData.cityCount) {
            System.out.println("Ciudad inválida");
            return;
        }
        
        String city = GlobalData.cities[cityIndex];
        
        System.out.print("Nombre de la sede: ");
        String name = scanner.next();
        
        System.out.print("Dirección: ");
        String address = scanner.next();
        
        System.out.print("Teléfono: ");
        String phone = scanner.next();
        
        GlobalData.headquarters[GlobalData.headquarterCount] = new Headquarter(headquarterId, city, name, address, phone);
        GlobalData.headquarterCount++;
        
        System.out.println("Sede registrada en " + city);
    }
    
    public void registerEnvironment() {// Registrar ambiente
        if (GlobalData.headquarterCount == 0) {
            System.out.println("Primero debe registrar al menos una sede");
            return;
        }
        
        System.out.println("\nREGISTRAR AMBIENTE");
        
        System.out.print("ID del ambiente: ");
        String environmentId = scanner.next();
        
        // Mostrar sedes disponibles
        System.out.println("Sedes disponibles:");
        for (int i = 0; i < GlobalData.headquarterCount; i++) {
            if (GlobalData.headquarters[i] != null) {
                System.out.println((i+1) + ". " + GlobalData.headquarters[i].getName() + " - " + GlobalData.headquarters[i].getCity());
            }
        }
        System.out.print("Seleccione sede (número): ");
        int headquarterIndex = scanner.nextInt() - 1;
        
        if (headquarterIndex < 0 || headquarterIndex >= GlobalData.headquarterCount || GlobalData.headquarters[headquarterIndex] == null) {
            System.out.println("Sede inválida");
            return;
        }
        
        Headquarter headquarter = GlobalData.headquarters[headquarterIndex];
        String headquarterId = headquarter.getHeadquarterId();
        
        //Seleccionar tipo de ambiente
        System.out.println("Tipos de ambiente:");
        System.out.println("1. Normal");
        System.out.println("2. Especializado");
        System.out.print("Seleccione tipo (número): ");
        int typeChoice = scanner.nextInt();
        
        String type = (typeChoice == 1) ? "Normal" : "Especializado";
        
        System.out.print("Nombre del ambiente: ");
        String name = scanner.next();
        
        System.out.print("Capacidad: ");
        int capacity = scanner.nextInt();
        
        // Registrar ambiente en la matriz
        int environmentIndex = headquarter.getEnvironmentCount();
        GlobalData.environments[headquarterIndex][environmentIndex] = new Environment(environmentId, headquarterId, type, name, capacity);
        
        // Actualizar contador de ambientes
        headquarter.setEnvironmentCount(environmentIndex + 1);
        
        System.out.println("Ambiente " + type + " registrado en sede " + headquarter.getName());
    }
    
    public void registerInstructor() {// Registrar instructor
        System.out.println("\nREGISTRAR INSTRUCTOR");
        
        System.out.print("ID del instructor: ");
        String instructorId = scanner.next();
        
        System.out.print("Nombre: ");
        String firstName = scanner.next();
        
        System.out.print("Apellido: ");
        String lastName = scanner.next();
        
        System.out.print("Especialidad: ");
        String specialty = scanner.next();
        
        //Seleccionar línea principal
        System.out.println("Líneas principales:");
        System.out.println("1. Programación");
        System.out.println("2. Base de datos");
        System.out.println("3. Redes");
        System.out.println("4. Sistemas operativos");
        System.out.println("5. Seguridad informática");
        System.out.print("Seleccione línea principal (número): ");
        int lineChoice = scanner.nextInt();
        
        String[] lines = {"Programación", "Base de datos", "Redes", "Sistemas operativos", "Seguridad informática"};
        String mainLine = (lineChoice >= 1 && lineChoice <= 5) ? lines[lineChoice-1] : "Programación";
        
        GlobalData.instructors[GlobalData.instructorCount] = new Instructor(instructorId, firstName, lastName, specialty, mainLine);
        GlobalData.instructorCount++;
        
        System.out.println("Instructor registrado con línea principal: " + mainLine);
    }
    
    public void assignInstructorToEnvironment() {// Asignar instructor a ambiente
        if (GlobalData.headquarterCount == 0 || GlobalData.instructorCount == 0) {
            System.out.println(" Debe tener sedes e instructores registrados");
            return;
        }
        
        System.out.println("\nASIGNAR INSTRUCTOR A AMBIENTE");
        
        // Seleccionar instructor
        System.out.println("Instructores disponibles:");
        for (int i = 0; i < GlobalData.instructorCount; i++) {
            if (GlobalData.instructors[i] != null && GlobalData.instructors[i].getAssignedEnvironment() == null) {
                System.out.println((i+1) + ". " + GlobalData.instructors[i].getFirstName() + " " + 
                                GlobalData.instructors[i].getLastName() + " - " + GlobalData.instructors[i].getMainLine());
            }
        }
        System.out.print("Seleccione instructor (número): ");
        int instructorIndex = scanner.nextInt() - 1;
        
        if (instructorIndex < 0 || instructorIndex >= GlobalData.instructorCount || GlobalData.instructors[instructorIndex] == null) {
            System.out.println("Instructor inválido");
            return;
        }
        
        Instructor instructor = GlobalData.instructors[instructorIndex];
        
        // Seleccionar sede y ambiente
        System.out.println("Sedes y ambientes disponibles:");
        for (int i = 0; i < GlobalData.headquarterCount; i++) {
            if (GlobalData.headquarters[i] != null) {
                Headquarter headquarter = GlobalData.headquarters[i];
                System.out.println("Sede: " + headquarter.getName());
                
                for (int j = 0; j < headquarter.getEnvironmentCount(); j++) {
                    if (GlobalData.environments[i][j] != null && GlobalData.environments[i][j].getAssignedInstructor() == null) {
                        System.out.println("   " + (j+1) + ". Ambiente: " + GlobalData.environments[i][j].getName() + 
                                        " - Tipo: " + GlobalData.environments[i][j].getType());
                    }
                }
            }
        }
        
        System.out.print("Seleccione sede (número): ");
        int headquarterIndex = scanner.nextInt() - 1;
        
        System.out.print("Seleccione ambiente (número): ");
        int environmentIndex = scanner.nextInt() - 1;
        
        if (headquarterIndex < 0 || headquarterIndex >= GlobalData.headquarterCount || 
            environmentIndex < 0 || environmentIndex >= GlobalData.headquarters[headquarterIndex].getEnvironmentCount()) {
            System.out.println("Ambiente inválido");
            return;
        }
        
        Environment environment = GlobalData.environments[headquarterIndex][environmentIndex];
        
        //Seleccionar horario
        System.out.println("Horarios disponibles:");
        System.out.println("1. 6-12 am");
        System.out.println("2. 12-6 pm");
        System.out.println("3. 6-12 pm");
        System.out.print("Seleccione horario (número): ");
        int scheduleChoice = scanner.nextInt();
        
        String[] schedules = {"6-12 am", "12-6 pm", "6-12 pm"};
        String schedule = (scheduleChoice >= 1 && scheduleChoice <= 3) ? schedules[scheduleChoice-1] : "6-12 am";
        
        //Validar asignación
        boolean success = environment.assignInstructor(instructor, schedule);
        if (success) {
            instructor.assignToEnvironment(
                GlobalData.headquarters[headquarterIndex].getHeadquarterId(),
                environment.getEnvironmentId(),
                schedule
            );
            GlobalData.headquarters[headquarterIndex].addInstructor();
        }
    }

    public void registerAndAssignCoordinator() {// Registrar y asignar coordinador
        if (GlobalData.headquarterCount == 0) {
            System.out.println(" Primero debe registrar al menos una sede");
            return;
        }
        
        System.out.println("\n REGISTRAR COORDINADOR");
        
        System.out.print("ID del coordinador: ");
        String coordinatorId = scanner.next();
        
        System.out.print("Nombre: ");
        String firstName = scanner.next();
        
        System.out.print("Apellido: ");
        String lastName = scanner.next();
        
        System.out.print("Email: ");
        String email = scanner.next();
        
        System.out.print("Teléfono: ");
        String phone = scanner.next();
        
        GlobalData.coordinators[GlobalData.coordinatorCount] = new Coordinator(coordinatorId, firstName, lastName, email, phone);
        
        // Asignar a sede
        System.out.println("Sedes disponibles:");
        for (int i = 0; i < GlobalData.headquarterCount; i++) {
            if (GlobalData.headquarters[i] != null) {
                System.out.println((i+1) + ". " + GlobalData.headquarters[i].getName() + " - " + GlobalData.headquarters[i].getCity());
            }
        }
        System.out.print("Seleccione sede para asignar (número): ");
        int headquarterIndex = scanner.nextInt() - 1;
        
        if (headquarterIndex >= 0 && headquarterIndex < GlobalData.headquarterCount && GlobalData.headquarters[headquarterIndex] != null) {
            GlobalData.coordinators[GlobalData.coordinatorCount].assignToHeadquarter(GlobalData.headquarters[headquarterIndex].getHeadquarterId());
            GlobalData.headquarters[headquarterIndex].assignCoordinator(GlobalData.coordinators[GlobalData.coordinatorCount]);
        }
        
        GlobalData.coordinatorCount++;
        System.out.println("Coordinador registrado y asignado");
    }
    
    public void generateCompleteReport() {// Generar reporte completo
        System.out.println("\nREPORTE COMPLETO DEL SISTEMA");
        
        System.out.println("\nCIUDADES REGISTRADAS:");
        for (int i = 0; i < GlobalData.cityCount; i++) {
            System.out.println("   • " + GlobalData.cities[i]);
        }
        
        System.out.println("\nSEDES Y AMBIENTES:");
        for (int i = 0; i < GlobalData.headquarterCount; i++) {// Recorrer sedes
            if (GlobalData.headquarters[i] != null) {
                Headquarter headquarter = GlobalData.headquarters[i];
                System.out.println("\n" + headquarter);
                
                if (headquarter.getCoordinator() != null) {
                    System.out.println("  Coordinador: " + headquarter.getCoordinator().getFirstName() + " " + headquarter.getCoordinator().getLastName());
                }
                
                System.out.println(" Ambientes:");
                for (int j = 0; j < headquarter.getEnvironmentCount(); j++) {
                    if (GlobalData.environments[i][j] != null) {
                        Environment environment = GlobalData.environments[i][j];
                        System.out.println("      " + environment);
                        // RF8: Mostrar inventario
                        System.out.println("       Inventario: " + environment.getInventoryDescription(i, j));
                    }
                }
            }
        }
        
        System.out.println("\n INSTRUCTORES:");
        for (int i = 0; i < GlobalData.instructorCount; i++) {
            if (GlobalData.instructors[i] != null) {
                System.out.println("   " + GlobalData.instructors[i]);
            }
        }
        
        System.out.println("\nMATRIZ DE HORARIOS:");
        System.out.println("   Instructor | 6-12 am | 12-6 pm | 6-12 pm");
        for (int i = 0; i < GlobalData.instructorCount; i++) {
            if (GlobalData.instructors[i] != null) {
                System.out.print("   " + GlobalData.instructors[i].getFirstName() + " " + GlobalData.instructors[i].getLastName());
                for (int j = 0; j < 3; j++) {
                    System.out.print(" | " + (GlobalData.scheduleMatrix[i][j].isEmpty() ? "Libre" : GlobalData.scheduleMatrix[i][j]));
                }
                System.out.println();
            }
        }
    }
}
