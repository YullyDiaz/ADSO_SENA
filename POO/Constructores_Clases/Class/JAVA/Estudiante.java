public class Estudiante {
    private String nombre;
    private int edad;
    private String grado;
    private double promedio;

    // Constructor 1: Solo nombre y edad
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.grado = "No asignado";
        this.promedio = 0.0;
    }

    // Constructor 2: Todos los parámetros
    public Estudiante(String nombre, int edad, String grado, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.grado = grado;
        this.promedio = promedio;
    }

    public void mostrar() {
        System.out.printf("Estudiante: %s, Edad: %d, Grado: %s, Promedio: %.2f%n",
            nombre, edad, grado, promedio);
    }

    public static void main(String[] args) {
        Estudiante est1 = new Estudiante("Ana", 20);
        Estudiante est2 = new Estudiante("Carlos", 22, "Ingeniería", 8.5);

        est1.mostrar();
        est2.mostrar();
    }
}