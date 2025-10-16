package ClinicManagement;

public class Ambulance {// Clase para ambulancias
    private String ambulanceId;
    private Driver driver;
    private int transferCount;      
    private double totalDistance;   
    private boolean available;
    
    private String[][] transferLog = new String[30][3]; 
    
    public Ambulance(String ambulanceId, Driver driver) {// Constructor
        this.ambulanceId = ambulanceId;
        this.driver = driver;
        this.transferCount = 0;
        this.totalDistance = 0;
        this.available = true;
    }
    
    public boolean makeTransfer(Clinic fromClinic, Clinic toClinic, int patientCount, double distance) {//Realiza la tranferencia
        
        if (transferCount >= 8) {
            System.out.println("Conductor " + driver.getFirstName() + " ya hizo 8 recorridos hoy");
            return false;
        }
        
        if (totalDistance + distance > 400) {
            System.out.println("Distancia excede 400km: " + (totalDistance + distance) + "km");
            return false;
        }
        

        transferCount++;
        totalDistance += distance;
        
        transferLog[transferCount-1][0] = fromClinic.getName();
        transferLog[transferCount-1][1] = toClinic.getName();
        transferLog[transferCount-1][2] = String.valueOf(distance);
        
        System.out.println("Transferencia #" + transferCount + " completada: " + 
            fromClinic.getName() + "* " + toClinic.getName() + " (" + distance + "km)");
        
        return true;
    }
    
    public void printTransferReport() {// Imprime el reporte de la ambulancia
        System.out.println("\nAmbulancia " + ambulanceId + " - Reporte:");
        System.out.println("Conductor: " + driver.getFirstName() + " " + driver.getLastName());
        System.out.println("Total recorridos: " + transferCount + "/8");
        System.out.println("Distancia total: " + totalDistance + "/400km");
        
        System.out.println("Detalle de recorridos:");
        for (int i = 0; i < transferCount; i++) {
            if (transferLog[i][0] != null) {
                System.out.println("   " + (i+1) + ". " + transferLog[i][0] + " * " + 
                    transferLog[i][1] + " (" + transferLog[i][2] + "km)");
            }
        }
    }
    
    // Getters
    public String getAmbulanceId() { return ambulanceId; }
    public Driver getDriver() { return driver; }
    public int getTransferCount() { return transferCount; }
    public double getTotalDistance() { return totalDistance; }
    public boolean isAvailable() { return available; }
}

