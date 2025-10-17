package BankBranches;

public class Employee {// Clase para empleados
    private String employeeId;
    private String branchId;
    private String firstName;
    private String lastName;
    private String position;
    private String email;
    
    public Employee(String employeeId, String branchId, String firstName, String lastName, String position, String email) {// Constructor
        this.employeeId = employeeId;
        this.branchId = branchId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.email = email;
    }
    
    // Getters
    public String getEmployeeId() { return employeeId; }
    public String getBranchId() { return branchId; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getPosition() { return position; }
    public String getEmail() { return email; }
    
    @Override
    public String toString() {// Representación en cadena
        return "Nombre: " + firstName + ", Apellido: " + lastName + ", Cargo: " + position + ", Email:" + email;
    }
}
