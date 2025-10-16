package AmbulanceManagement;

import java.util.ArrayList;
import java.util.List;

public class Driver extends Person {//Clase que representa a un conductor, hereda de Persona
    private boolean isAssigned;
    private List<Patient> assignedPatients;

    public Driver(String firstName, String lastName, String phoneNumber) {//Constructor para inicializar los datos del conductor
        super(firstName, lastName, phoneNumber);
        this.isAssigned = false;
        this.assignedPatients = new ArrayList<>();
    }

    public void assignPatient(Patient patient) { //Método para asignar un paciente al conductor
        assignedPatients.add(patient);
    }

    public boolean isAssigned() { return isAssigned; }
    public void setAssigned(boolean assigned) { isAssigned = assigned; }
    public List<Patient> getAssignedPatients() { return assignedPatients; }
}
