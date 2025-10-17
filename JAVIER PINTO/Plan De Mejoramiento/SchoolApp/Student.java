package SchoolApp;

public class Student {// Clase estudiante
    private String studentId;
    private String firstName;
    private String lastName;
    private int age;
    
    public Student(String studentId, String firstName, String lastName, int age) {// Constructor
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    // Getters
    public String getStudentId() { return studentId; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getFullName() { return firstName + " " + lastName; }
    
    @Override
    public String toString() {// Representación en cadena del estudiante
        return String.format("ID: "+studentId+" , Nombre: "+firstName+" , Apellido: "+lastName+" , Edad: "+age);
    }
}