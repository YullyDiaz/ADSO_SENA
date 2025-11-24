public abstract class Empleado {
    protected String nombre;
    protected String id;

    public abstract String trabajar();
    public abstract double calcularSalario();
    public abstract void mostrar();
}

class Ingeniero extends Empleado {
    private String especialidad;
    private double salarioBase;

    // Constructor con parámetros
    public Ingeniero(String nombre, String id, String especialidad, double salarioBase) {
        this.nombre = nombre;
        this.id = id;
        this.especialidad = especialidad;
        this.salarioBase = salarioBase;
    }

    // Constructor de copia
    public Ingeniero(Ingeniero other) {
        this.nombre = other.nombre;
        this.id = other.id;
        this.especialidad = other.especialidad;
        this.salarioBase = other.salarioBase;
    }

    @Override
    public String trabajar() {
        return "Diseñando y desarrollando soluciones técnicas";
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 1.1; // 10% extra por especialidad
    }

    @Override
    public void mostrar() {
        System.out.println("Ingeniero: " + nombre);
        System.out.println("ID: " + id + ", Especialidad: " + especialidad);
        System.out.printf("Salario: $%.2f%n", calcularSalario());
        System.out.println("Trabajo: " + trabajar());
    }

    public static void main(String[] args) {
        Ingeniero original = new Ingeniero("Laura", "ING001", "Software", 60000.00);
        Ingeniero copia = new Ingeniero(original);

        original.mostrar();
        copia.mostrar();
    }
}
