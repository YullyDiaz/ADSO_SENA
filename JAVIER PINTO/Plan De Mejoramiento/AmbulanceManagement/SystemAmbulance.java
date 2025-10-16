package AmbulanceManagement;

import java.util.Scanner;    
import java.util.Random;     
import java.util.List;       
import java.util.ArrayList;  

public class SystemAmbulance {
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();

    public void registerDrivers() {//Método para registrar 10 conductores
        System.out.println("Registro de conductores");
        
        for (int i = 0; i < 10; i++) {
            System.out.println("\nConductor " + (i + 1) + ":");
            
            System.out.print("Nombre: ");
            String firstName = scanner.next();
            
            System.out.print("Apellido: ");
            String lastName = scanner.next();
            
            System.out.print("Teléfono: ");
            String phoneNumber = scanner.next();

            GlobalData.driverList.add(new Driver(firstName, lastName, phoneNumber));
        }
        System.out.println("\n ¡10 conductores registrados exitosamente!");
    }

    public void generatePatients() { //Método para generar 100 pacientes con datos aleatorios
        String[] firstNames = {"John", "Mary", "David", "Sarah", "Michael", "Emma", "James", "Lisa", "Robert", "Anna"};
        String[] lastNames = {"Smith", "Johnson", "Williams", "Brown", "Jones", "Garcia", "Miller", "Davis", "Rodriguez", "Martinez"};

        System.out.println("Generando pacientes");
        
        for (int i = 0; i < 100; i++) {//Genera 100 pacientes
            String randomFirstName = firstNames[random.nextInt(firstNames.length)];
            String randomLastName = lastNames[random.nextInt(lastNames.length)];
            String phoneNumber = "3" + (100000000 + random.nextInt(900000000));
            
            GlobalData.patientList.add(new Patient(randomFirstName, randomLastName, phoneNumber));
        }
        System.out.println("\n ¡100 pacientes generados exitosamente!");
    }

    public void registerDeceased() { //Método para registrar 15 fallecidos
        System.out.println("Registrando carrozas fúnebres");
        
        for (int i = 0; i < 15; i++) {
            System.out.println("\nFallecido " + (i + 1) + ":");
            
            System.out.print("Nombre: ");
            String firstName = scanner.next();
            
            System.out.print("Apellido: ");
            String lastName = scanner.next();
            
            System.out.print("Teléfono: ");
            String phoneNumber = scanner.next();

            GlobalData.deceasedList.add(new Deceased(firstName, lastName, phoneNumber));
        }
        System.out.println("\n ¡15 fallecidos registrados exitosamente!");
    }

    public void assignVehicles() {//Método para asignar vehículos a los conductores
        System.out.println("Asignando vehículos a conductores");
        
        for (int i = 0; i < 10; i++) {//Asigna una ambulancia a cada uno de los 10 primeros conductores
            Vehicle ambulance = new Vehicle("Ambulancia", i + 1);
            Driver driver = GlobalData.driverList.get(i); //Aqui me da error
            ambulance.assignDriver(driver);
            GlobalData.vehicleList.add(ambulance);
        }

        Vehicle hearse = new Vehicle("Carroza funébre", 1);
        Driver hearseDriver = GlobalData.driverList.get(6); //Aqui me da error
        hearse.assignDriver(hearseDriver);
        GlobalData.vehicleList.add(hearse);

        System.out.println("!Vehículos asignados exitosamente!");
    }

    public void assignPatientsToDrivers() {//Método para asignar pacientes a los conductores
        System.out.println("Asignando pacientes a conductores");
        
        int totalDrivers = 10;
        int driverIndex = 0;

        for (Patient patient : GlobalData.patientList) {//Asigna cada paciente al siguiente conductor en la lista
            Driver driver = GlobalData.driverList.get(driverIndex); //Aqui me da error
            driver.assignPatient(patient); 
            driverIndex = (driverIndex + 1) % totalDrivers;
        }
        System.out.println("¡Pacientes asignados a conductores exitosamente!");
    }
}
