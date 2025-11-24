public abstract class Figura {
    protected String color;

    public Figura() {
        this.color = "negro";
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    public void mostrar() {
        System.out.println("Color: " + color);
    }
}

class Rectangulo extends Figura {
    private double ancho;
    private double alto;

    public Rectangulo() {
        super();
        this.ancho = 1.0;
        this.alto = 1.0;
    }

    @Override
    public double calcularArea() {
        return ancho * alto;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (ancho + alto);
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Rectángulo - Ancho: " + ancho + ", Alto: " + alto);
        System.out.printf("Área: %.2f%n", calcularArea());
        System.out.printf("Perímetro: %.2f%n", calcularPerimetro());
    }

    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo();
        rectangulo.mostrar();
    }
}
