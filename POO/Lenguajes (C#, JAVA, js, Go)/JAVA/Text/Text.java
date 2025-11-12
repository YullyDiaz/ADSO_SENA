package JAVA.Text;

//Se utilizan atributos como Nombre, Apellido y Profesion son los que se manejan como texto por lo tanto, se implementan en el ejercicio.
class Text {
    //Se utilizan modificadores de acceso privados
    private String name;
    private String lastName;
    private String profession;

    //Implementación de un contructor para los atributos con parámetros
    public Text() {
        this.name = "Yully";
        this.lastName = "Diaz";
        this.profession = "Aprendiz SENA";
    }

    public Text(String nameData, String lastNameData, String professionData) {
        this.name = (nameData != null) ? nameData : "Yully";
        this.lastName = (lastNameData != null) ? lastNameData : "Diaz";
        this.profession = (professionData != null) ? professionData : "Aprendiz SENA";
    }

    //En esta sección empleamos el encapsulamiento aplicando get y set a los atributos
    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        if (newName != null && newName.trim().length() > 0) {
            this.name = newName.trim();
        } else {
            throw new IllegalArgumentException("El nombre debe ser un texto válido");
        }
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String newLastName) {
        if (newLastName != null && newLastName.trim().length() > 0) {
            this.lastName = newLastName.trim();
        } else {
            throw new IllegalArgumentException("El apellido debe ser un texto válido");
        }
    }

    public String getProfession() {
        return this.profession;
    }

    public void setProfession(String newProfession) {
        if (newProfession != null && newProfession.trim().length() > 0) {
            this.profession = newProfession.trim();
        } else {
            throw new IllegalArgumentException("La profesión debe ser un texto válido");
        }
    }

    //En esta parte de la codificación aplicamos un metodo con return en donde esperamos que el programa regrese el texto completo
    public String fullText() {
        return this.name + " " + this.lastName + " - " + this.profession;
    }

    //Por último implementamos un metodo void para la ejecución del programa.
    public void displayTextData() {
        System.out.println("DATOS DE TEXTO");
        System.out.println("Nombre: " + this.name);
        System.out.println("Apellido: " + this.lastName);
        System.out.println("Profesión: " + this.profession);
        System.out.println("Texto completo: " + this.fullText());
    }
}
