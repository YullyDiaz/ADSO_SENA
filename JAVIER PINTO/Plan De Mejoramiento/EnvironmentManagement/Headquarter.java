package EnvironmentManagement;

public class Headquarter {// Clase para sede
    private String headquarterId;
    private String city;
    private String name;
    private String address;
    private String phone;
    private Coordinator coordinator;
    private int environmentCount;
    private int instructorCount;
    
    public Headquarter(String headquarterId, String city, String name, String address, String phone) {// Constructor
        this.city = city;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.environmentCount = 0;
        this.instructorCount = 0;
        this.coordinator = null;
    }
    
    public void assignCoordinator(Coordinator coordinator) {//Asignar coordinador a la sede
        this.coordinator = coordinator;
        System.out.println("Coordinador " + coordinator.getFirstName() + " asignado a sede " + name);
    }
    
    public void addInstructor() {// Incrementar contador de instructores
        instructorCount++;
    }
    
    // Getters
    public String getHeadquarterId() { return headquarterId; }
    public String getCity() { return city; }
    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getPhone() { return phone; }
    public Coordinator getCoordinator() { return coordinator; }
    public int getEnvironmentCount() { return environmentCount; }
    public int getInstructorCount() { return instructorCount; }
    public void setEnvironmentCount(int count) { this.environmentCount = count; }
    
    @Override
    public String toString() {// Representación de la sede
        return "Nombre: " + name + ", Ciudad: " + city + ", Teléfono: " + phone + ", Ambientes: " + environmentCount + " , Instructores: " + instructorCount;
    }
}