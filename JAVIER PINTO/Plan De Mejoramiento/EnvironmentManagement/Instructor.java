package EnvironmentManagement;

public class Instructor {// Clase para instructor
    private String instructorId;
    private String firstName;
    private String lastName;
    private String specialty;
    private String mainLine; 
    private String assignedHeadquarter;
    private String assignedEnvironment;
    private String assignedSchedule;
    
    public Instructor(String instructorId, String firstName, String lastName, String specialty, String mainLine) {// Constructor
        this.instructorId = instructorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
        this.mainLine = mainLine; 
        this.assignedHeadquarter = null;
        this.assignedEnvironment = null;
        this.assignedSchedule = null;
    }
    
    public boolean assignToEnvironment(String headquarterId, String environmentId, String schedule) {// Asignar instructor a ambiente
    
        if (this.assignedEnvironment != null) {// Verifica si ya tiene un ambiente asignado
            System.out.println("Instructor ya tiene ambiente asignado");
            return false;
        }
        
        this.assignedHeadquarter = headquarterId;
        this.assignedEnvironment = environmentId;
        this.assignedSchedule = schedule;
        
        for (int i = 0; i < GlobalData.instructorCount; i++) {// Actualiza la matriz de horarios global
            if (GlobalData.instructors[i].getInstructorId().equals(instructorId)) {
                if (schedule.equals("6-12 am")) GlobalData.scheduleMatrix[i][0] = environmentId;
                else if (schedule.equals("12-6 pm")) GlobalData.scheduleMatrix[i][1] = environmentId;
                else if (schedule.equals("6-12 pm")) GlobalData.scheduleMatrix[i][2] = environmentId;
                break;
            }
        }
        
        return true;
    }
    
    // Getters
    public String getInstructorId() { return instructorId; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getSpecialty() { return specialty; }
    public String getMainLine() { return mainLine; }
    public String getAssignedHeadquarter() { return assignedHeadquarter; }
    public String getAssignedEnvironment() { return assignedEnvironment; }
    public String getAssignedSchedule() { return assignedSchedule; }
    
    @Override
    public String toString() {// Representación del instructor
        return "Nombre: " + firstName + " " + lastName + ", Especialidad: " + specialty + 
            ", Línea: " + mainLine + ", Ambiente: " + 
            (assignedEnvironment != null ? assignedEnvironment : "No asignado");
    }
}
