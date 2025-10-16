package AmbulanceManagement;

public class Report {
    
    public void generateReport() { //Método para generar el reporte
        System.out.println("  Reporte");

        for (Vehicle vehicle : GlobalData.vehicleList) {//Itera sobre cada vehículo en la lista global de vehículos
            Driver driver = vehicle.getAssignedDriver();
            
            System.out.println("\n" + vehicle.getType() + " #" + vehicle.getVehicleId() + " ");
            System.out.println("Conductor: " + (driver != null ? driver.toString() : "No ha sido asignado"));

            if (vehicle.getType().equals("Ambulancia")) {
                if (driver != null && !driver.getAssignedPatients().isEmpty()) {
                    System.out.println("Pacientes trasladados:");
                    for (Patient patient : driver.getAssignedPatients()) {
                        System.out.println(" " + patient.toString());
                    }
                } else {
                    System.out.println(" No se han trasladado pacientes.");
                }
            } else if (vehicle.getType().equals("Carroza funébre")) {
                if (!GlobalData.deceasedList.isEmpty()) {
                    System.out.println("Fallecidos trasladados:");
                    for (Deceased deceased : GlobalData.deceasedList) {
                        System.out.println(" " + deceased.toString());
                    }
                } else {
                    System.out.println(" No se han trasladado fallecidos.");
                }
            }
        }

        System.out.println("Inicio del reporte:");
        System.out.println("Total conductores: " + GlobalData.driverList.size());
        System.out.println("Total Pacientes: " + GlobalData.patientList.size());
        System.out.println("Total pacientes fallecidos: " + GlobalData.deceasedList.size());
        System.out.println("Total vehículos: " + GlobalData.vehicleList.size());
        System.out.println("Fin del reporte");
    }
}
