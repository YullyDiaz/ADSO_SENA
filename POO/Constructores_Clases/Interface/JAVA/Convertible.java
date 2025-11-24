package Interface.JAVA;
public interface Convertible {
    double convertir(double cantidad);
    String getUnidadOrigen();
    String getUnidadDestino();
}

class ConversorTemperatura implements Convertible {
    private String unidadOrigen;
    private String unidadDestino;
    private double factor;

    // Constructor 1: Solo unidades
    public ConversorTemperatura(String unidadOrigen, String unidadDestino) {
        this.unidadOrigen = unidadOrigen;
        this.unidadDestino = unidadDestino;
        this.factor = 1.0;
    }

    // Constructor 2: Con factor
    public ConversorTemperatura(String unidadOrigen, String unidadDestino, double factor) {
        this.unidadOrigen = unidadOrigen;
        this.unidadDestino = unidadDestino;
        this.factor = factor;
    }

    @Override
    public double convertir(double cantidad) {
        if ("Celsius".equals(unidadOrigen) && "Fahrenheit".equals(unidadDestino)) {
            return (cantidad * 9/5) + 32;
        } else if ("Fahrenheit".equals(unidadOrigen) && "Celsius".equals(unidadDestino)) {
            return (cantidad - 32) * 5/9;
        }
        return cantidad * factor;
    }

    @Override
    public String getUnidadOrigen() {
        return unidadOrigen;
    }

    @Override
    public String getUnidadDestino() {
        return unidadDestino;
    }

    public void mostrar() {
        System.out.println("Conversor: " + unidadOrigen + " -> " + unidadDestino);
    }

    public void probarConversion(double cantidad) {
        double resultado = convertir(cantidad);
        System.out.printf("%.2f %s = %.2f %s%n", cantidad, unidadOrigen, resultado, unidadDestino);
    }

    public static void main(String[] args) {
        Convertible conversor1 = new ConversorTemperatura("Celsius", "Fahrenheit");
        Convertible conversor2 = new ConversorTemperatura("Fahrenheit", "Celsius");

        conversor1.mostrar();
        ((ConversorTemperatura) conversor1).probarConversion(25);

        conversor2.mostrar();
        ((ConversorTemperatura) conversor2).probarConversion(77);
    }
}
