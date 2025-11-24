public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private double precio;
    private boolean enStock;

    // Constructor con parámetros
    public Vehiculo(String marca, String modelo, int año, double precio, boolean enStock) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
        this.enStock = enStock;
    }

    public void mostrar() {
        String estado = enStock ? "Disponible" : "No disponible";
        System.out.printf("%s %s (%d) - $%.2f - %s%n", 
            marca, modelo, año, precio, estado);
    }

    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Toyota", "Corolla", 2023, 25000.00, true);
        vehiculo.mostrar();
    }
}