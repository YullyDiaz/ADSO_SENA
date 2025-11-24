public abstract class Dispositivo {
    protected String marca;
    protected String modelo;

    public abstract void encender();
    public abstract void apagar();
    public abstract void mostrar();
}

class Tablet extends Dispositivo {
    private double pulgadas;
    private double precio;
    private boolean encendido;

    // Constructor 1: Solo marca y modelo
    public Tablet(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.pulgadas = 10.0;
        this.precio = 0.0;
        this.encendido = false;
    }

    // Constructor 2: Todos los parámetros
    public Tablet(String marca, String modelo, double pulgadas, double precio, boolean encendido) {
        this.marca = marca;
        this.modelo = modelo;
        this.pulgadas = pulgadas;
        this.precio = precio;
        this.encendido = encendido;
    }

    @Override
    public void encender() {
        encendido = true;
        System.out.println("Tablet encendida");
    }

    @Override
    public void apagar() {
        encendido = false;
        System.out.println("Tablet apagada");
    }

    @Override
    public void mostrar() {
        String estado = encendido ? "Encendida" : "Apagada";
        System.out.println(marca + " " + modelo + " - " + pulgadas + " pulgadas");
        System.out.printf("Precio: $%.2f%n", precio);
        System.out.println("Estado: " + estado);
    }

    public static void main(String[] args) {
        Dispositivo tablet1 = new Tablet("Samsung", "Tab S7");
        Dispositivo tablet2 = new Tablet("Apple", "iPad Pro", 12.9, 1200.00, true);

        tablet1.mostrar();
        tablet2.mostrar();

        tablet1.encender();
        tablet1.mostrar();
    }
}