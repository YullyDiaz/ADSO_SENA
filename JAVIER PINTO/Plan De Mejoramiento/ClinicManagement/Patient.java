package HospitalManagement;

public class Patient {// Clase para pacientes
    private String patientId;
    private String firstName;
    private String lastName;
    private String condition;
    private double requiredDistance;
    private boolean transferable;
    
    public Patient(String patientId, String firstName, String lastName, String condition, double requiredDistance) {// Constructor
        this.patientId = patientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.condition = condition;
        this.requiredDistance = requiredDistance;
        this.transferable = true;
    }
    
    public boolean canBeTransferred(double availableDistance) {// Verifica si el paciente puede ser transferido
        if (requiredDistance > availableDistance) {
            this.transferable = false;
            GlobalData.nonTransferablePatients.add(this);
            return false;
        }
        return true;
    }
    
    // Getters
    public String getPatientId() { return patientId; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getCondition() { return condition; }
    public double getRequiredDistance() { return requiredDistance; }
    public boolean isTransferable() { return transferable; }
    
    @Override
    public String toString() {// Representación en cadena
        return "Nombre " + firstName + " " + lastName + " Condición: " + condition + 
            ", Distancia necesaria: " + requiredDistance + "km" +
            " | " + (transferable ? " Transferible" : " No transferible");
    }
}
