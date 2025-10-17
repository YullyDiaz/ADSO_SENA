package EnvironmentManagement;

public class Coordinator {// Clase para coordinador
    private String coordinatorId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String assignedHeadquarter;
    
    public Coordinator(String coordinatorId, String firstName, String lastName, String email, String phone) {// Constructor
        this.coordinatorId = coordinatorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.assignedHeadquarter = null;
    }
    
    public void assignToHeadquarter(String headquarterId) {// Asignar coordinador a sede
        this.assignedHeadquarter = headquarterId;
    }
    
    // Getters
    public String getCoordinatorId() { return coordinatorId; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getAssignedHeadquarter() { return assignedHeadquarter; }
    
    @Override
    public String toString() {// Representación del coordinador
        return "Nombre:" + firstName + " " + lastName + ", Email: " + email + ", Tel: " + phone +
            ", Sede: " + (assignedHeadquarter != null ? assignedHeadquarter : "No asignado");
    }
}
