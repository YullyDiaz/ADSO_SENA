package HospitalManagement;

import java.util.Scanner;
import java.util.Random;

public class ClinicSystem {// Clase principal del sistema
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();
    
    public void initializeClinics() {// Inicializar clínicas
        System.out.println("INICIALIZANDO CLÍNICAS");
        
        //Ejemplos de clinicas
        GlobalData.clinics[0] = new Clinic("CLI001", "Clínica Central", "Calle 123 #45-67", "601-1234567");
        GlobalData.clinics[1] = new Clinic("CLI002", "Clínica Norte", "Av. Norte #89-10", "601-2345678");
        GlobalData.clinics[2] = new Clinic("CLI003", "Clínica Sur", "Carrera 56 #78-90", "601-3456789");
        
        // Inicializar matriz de distancias
        initializeDistanceMatrix();
        
        System.out.println("3 clínicas inicializadas correctamente");
    }
    
    // Matriz de distancias entre clínicas
    private void initializeDistanceMatrix() {
        // Filas: origen, Columnas: destino
        GlobalData.distanceMatrix[0][0] = "0";    // Central a Central
        GlobalData.distanceMatrix[0][1] = "15";   // Central a Norte
        GlobalData.distanceMatrix[0][2] = "25";   // Central a Sur
        
        GlobalData.distanceMatrix[1][0] = "15";   // Norte a Central
        GlobalData.distanceMatrix[1][1] = "0";    // Norte a Norte
        GlobalData.distanceMatrix[1][2] = "35";   // Norte a Sur
        
        GlobalData.distanceMatrix[2][0] = "25";   // Sur a Central
        GlobalData.distanceMatrix[2][1] = "35";   // Sur a Norte
        GlobalData.distanceMatrix[2][2] = "0";    // Sur a Sur
    }
    
    public void initializeAmbulances() {// Inicializar ambulancias y conductores
        System.out.println("INICIALIZANDO AMBULANCIAS");
        
        Driver[] drivers = { // Ejemplos de conductores
            new Driver("DRV001", "Carlos", "Martínez", "LIC001"),
            new Driver("DRV002", "Ana", "Gómez", "LIC002"),
            new Driver("DRV003", "Pedro", "López", "LIC003"),
            new Driver("DRV004", "María", "Rodríguez", "LIC004"),
            new Driver("DRV005", "José", "Hernández", "LIC005")
        };
        
        for (int i = 0; i < 5; i++) {// Crear ambulancias con conductores
            GlobalData.ambulances[i] = new Ambulance("AMB00" + (i+1), drivers[i]);
        }
        
        System.out.println(" 5 ambulancias inicializadas con conductores");
    }
    
    public void simulateAmbulanceRequest() {// Simular solicitud de ambulancia
        System.out.println("\n SIMULANDO SOLICITUD DE AMBULANCIA");
        
        // Seleccionar clínicas aleatorias
        int fromIndex = random.nextInt(3);
        int toIndex;
        do {
            toIndex = random.nextInt(3);
        } while (toIndex == fromIndex);
        
        Clinic fromClinic = GlobalData.clinics[fromIndex];
        Clinic toClinic = GlobalData.clinics[toIndex];
        
        // Obtener distancia de la matriz
        double distance = Double.parseDouble(GlobalData.distanceMatrix[fromIndex][toIndex]);
        
        // Seleccionar ambulancia disponible
        Ambulance ambulance = findAvailableAmbulance();
        if (ambulance == null) {
            System.out.println("❌ No hay ambulancias disponibles");
            return;
        }
        
        // Crear pacientes para transferencia
        int patientCount = random.nextInt(3) + 1; 
        Patient[] patients = generatePatients(patientCount, distance);
        
        int nonTransferableCount = 0;
        for (Patient patient : patients) {// Verificar si los pacientes pueden ser transferidos
            if (!patient.canBeTransferred(400 - ambulance.getTotalDistance())) {
                nonTransferableCount++;
            }
        }
        
        fromClinic.requestAmbulance(patientCount, toClinic.getClinicId());
        boolean success = ambulance.makeTransfer(fromClinic, toClinic, patientCount, distance);
        
        if (success) {
            System.out.println(" Transferencia exitosa para " + (patientCount - nonTransferableCount) + " pacientes");
            if (nonTransferableCount > 0) {
                System.out.println(nonTransferableCount + " Los pacientes no pudieron ser transferidos por distancia");
            }
        }
    }
    
    private Ambulance findAvailableAmbulance() {// Buscar ambulancia disponible
        for (Ambulance ambulance : GlobalData.ambulances) {
            if (ambulance != null && ambulance.isAvailable() && 
                ambulance.getTransferCount() < 8 && ambulance.getTotalDistance() < 400) {
                return ambulance;
            }
        }
        return null;
    }
    
    private Patient[] generatePatients(int count, double baseDistance) {// Generar pacientes con condiciones y distancias
        Patient[] patients = new Patient[count];
        String[] conditions = {"Urgencia", "Cirugía", "Consulta", "Terapia", "Rehabilitación"};
        
        for (int i = 0; i < count; i++) {
            double patientDistance = baseDistance + random.nextInt(20); // Variación de distancia
            patients[i] = new Patient(
                "PAT" + (GlobalData.totalTransfers + i + 1),
                "Paciente" + (GlobalData.totalTransfers + i + 1),
                "Apellido",
                conditions[random.nextInt(conditions.length)],
                patientDistance
            );
        }
        return patients;
    }
    
    public void showNonTransferablePatients() {// Mostrar pacientes no transferibles
        System.out.println("\n PACIENTES NO TRANSFERIBLES");
        if (GlobalData.nonTransferablePatients.isEmpty()) {
            System.out.println(" Todos los pacientes pueden ser transferidos");
        } else {
            for (Patient patient : GlobalData.nonTransferablePatients) {
                System.out.println("   " + patient);
            }
        }
    }
    
    public void generateCompleteReport() {// Generar reporte completo del sistema
        System.out.println("\n REPORTE COMPLETO DEL SISTEMA");
        
        System.out.println("\nCLÍNICAS:");
        for (Clinic clinic : GlobalData.clinics) {
            if (clinic != null) {
                System.out.println("   " + clinic);
            }
        }
        
        System.out.println("\nAMBULANCIAS:");
        for (Ambulance ambulance : GlobalData.ambulances) {
            if (ambulance != null) {
                ambulance.printTransferReport();
            }
        }
        
        showNonTransferablePatients();
        
        System.out.println("\nMATRIZ DE DISTANCIAS:");
        printDistanceMatrix();
    }
    
    private void printDistanceMatrix() {
        System.out.println("     Central   Norte    Sur");
        String[] clinicNames = {"Central", "Norte", "Sur"};
        
        for (int i = 0; i < 3; i++) {
            System.out.print(clinicNames[i] + "   ");
            for (int j = 0; j < 3; j++) {
                System.out.print(GlobalData.distanceMatrix[i][j] + "km     ");
            }
            System.out.println();
        }
    }
}
