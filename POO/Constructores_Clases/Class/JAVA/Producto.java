public class Producto {
    private int id;
    private String nombre;
    private double precio;

    // Constructor con parámetros
    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    // Constructor de copia
    public Producto(Producto other) {
        this.id = other.id;
        this.nombre = other.nombre;
        this.precio = other.precio;
    }

    public void mostrar() {
        System.out.printf("ID: %d, Producto: %s, Precio: $%.2f%n", 
            id, nombre, precio);
    }

    public static void main(String[] args) {
        Producto original = new Producto(1, "Laptop", 1500.00);
        Producto copia = new Producto(original);

        original.mostrar();
        copia.mostrar();
    }
}