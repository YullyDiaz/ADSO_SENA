package ClinicManagement;

public class Driver {// Clase para conductores
    private String driverId;
    private String firstName;
    private String lastName;
    private String licenseNumber;
    
    public Driver(String driverId, String firstName, String lastName, String licenseNumber) {// Constructor
        this.driverId = driverId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.licenseNumber = licenseNumber;
    }
    
    // Getters
    public String getDriverId() { return driverId; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getLicenseNumber() { return licenseNumber; }
    
    @Override
    public String toString() {// Representación en cadena
        return "Nombre: " + firstName + " " + lastName + ", Licencia: " + licenseNumber;
    }
}

