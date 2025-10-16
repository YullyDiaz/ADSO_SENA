package AmbulanceManagement;

public class Vehicle { //Clase para representar un vehículo de ambulancia
    private String type; 
    private int vehicleId;
    private Driver assignedDriver;

    public Vehicle(String type, int vehicleId) { //Constructor para inicializar los datos del vehículo
        this.type = type;
        this.vehicleId = vehicleId;
    }

    public void assignDriver(Driver driver) { //Método para asignar un conductor al vehículo
        this.assignedDriver = driver;
        driver.setAssigned(true);
    }
    
    public String getType() { return type; }
    public int getVehicleId() { return vehicleId; }
    public Driver getAssignedDriver() { return assignedDriver; }
}
