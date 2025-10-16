package AmbulanceManagement;

public class Person { //Clase base para representar una persona

    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Person(String firstName, String lastName, String phoneNumber) { //Constructor para inicializar los datos de la persona
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    // Getters para acceder a los datos
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getPhoneNumber() { return phoneNumber; }

    @Override
    public String toString() { //Representación en cadena de la persona
        return "Nombre: "+firstName + ", Apellido: " + lastName + ", Teléfono: " + phoneNumber;
    }
}