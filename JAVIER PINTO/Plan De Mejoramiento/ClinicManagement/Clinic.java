package ClinicManagement;

public class Clinic {// Clase para clínicas
    private String clinicId;
    private String name;
    private String address;
    private String phone;
    private int patientCount;
    
    public Clinic(String clinicId, String name, String address, String phone) {// Constructor
        this.clinicId = clinicId;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.patientCount = 0;
    }
    
    public void requestAmbulance(int patientCount, String destinationClinicId) {// Método para solicitar ambulancia
        this.patientCount += patientCount;
        System.out.println("📞 Clínica " + name + " solicita ambulancia para " + patientCount + " pacientes");
        System.out.println("🎯 Destino: Clínica " + destinationClinicId);
    }
    
    // Getters
    public String getClinicId() { return clinicId; }
    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getPhone() { return phone; }
    public int getPatientCount() { return patientCount; }
    
    @Override
    public String toString() {// Representación en cadena
        return "Nombre: " + name + ", Tel: " + phone + ",  Pacientes: " + patientCount;
    }

}
