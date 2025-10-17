package EnvironmentManagement;

public class Environment {// Clase para ambiente
    private String environmentId;
    private String headquarterId;
    private String type; 
    private String name;
    private int capacity;
    private Instructor assignedInstructor;
    private String schedule; 

    public Environment(String environmentId, String headquarterId, String type, String name, int capacity) {// Constructor
        this.environmentId = environmentId;
        this.headquarterId = headquarterId;
        this.type = type;
        this.name = name;
        this.capacity = capacity;
        this.assignedInstructor = null;
        this.schedule = null;
    }
    
    public boolean assignInstructor(Instructor instructor, String schedule) {//Asignar instructor al ambiente
        if (this.assignedInstructor != null) {// Verifica si ya hay un instructor asignado
            System.out.println("Este ambiente ya tiene instructor asignado");
            return false;
        }
        
        this.assignedInstructor = instructor;
        this.schedule = schedule;
        System.out.println("✅ Instructor " + instructor.getFirstName() + " asignado al ambiente " + name + " en horario " + schedule);
        return true;
    }
    
    public String getInventoryDescription(int headquarterIndex, int environmentIndex) {
        return GlobalData.inventoryMatrix[headquarterIndex][environmentIndex];
    }
    
    // Getters
    public String getEnvironmentId() { return environmentId; }
    public String getHeadquarterId() { return headquarterId; }
    public String getType() { return type; }
    public String getName() { return name; }
    public int getCapacity() { return capacity; }
    public Instructor getAssignedInstructor() { return assignedInstructor; }
    public String getSchedule() { return schedule; }
    
    @Override
    public String toString() {// Representación del ambiente
        return "Nombre: " + name + ", Tipo: " + type + ", Capacidad: " + capacity + 
            ", Instructor: " + (assignedInstructor != null ? assignedInstructor.getFirstName() : "No asignado") +
            ", Horario: " + (schedule != null ? schedule : "No asignado");
    }
}
