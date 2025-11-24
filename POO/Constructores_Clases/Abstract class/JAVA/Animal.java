public abstract class Animal {
    protected String nombre;
    protected String especie;

    // Constructor sin parámetros
    public Animal() {
        this.nombre = "Sin nombre";
        this.especie = "Desconocida";
    }

    // Métodos abstractos
    public abstract String hacerSonido();
    public abstract String moverse();

    public void mostrar() {
        System.out.println(nombre + " - " + especie);
    }
}

class Gato extends Animal {
    public Gato() {
        super();
        this.nombre = "Michi";
        this.especie = "Gato";
    }

    @Override
    public String hacerSonido() {
        return "Miau miau!";
    }

    @Override
    public String moverse() {
        return "Caminando sigilosamente";
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Sonido: " + hacerSonido());
        System.out.println("Movimiento: " + moverse());
    }

    public static void main(String[] args) {
        Animal gato = new Gato();
        gato.mostrar();
    }
}
