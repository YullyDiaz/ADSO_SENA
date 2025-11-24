package Interface.JAVA;
public interface Almacenable {
    String guardar();
    String cargar();
    String eliminar();
    boolean estaGuardado();
}

class Archivo implements Almacenable {
    private String nombre;
    private long tamaño;
    private String formato;
    private boolean guardado;

    // Constructor sin parámetros
    public Archivo() {
        this.nombre = "archivo.txt";
        this.tamaño = 0;
        this.formato = "txt";
        this.guardado = false;
    }

    @Override
    public String guardar() {
        guardado = true;
        return "Archivo " + nombre + " guardado";
    }

    @Override
    public String cargar() {
        return "Cargando archivo " + nombre;
    }

    @Override
    public String eliminar() {
        guardado = false;
        return "Archivo " + nombre + " eliminado";
    }

    @Override
    public boolean estaGuardado() {
        return guardado;
    }

    public void mostrar() {
        String estado = guardado ? "Guardado" : "No guardado";
        System.out.println("Archivo: " + nombre);
        System.out.println("Formato: " + formato + ", Tamaño: " + tamaño + " bytes");
        System.out.println("Estado: " + estado);
    }

    public static void main(String[] args) {
        Almacenable archivo = new Archivo();
        archivo.mostrar();
        System.out.println(archivo.guardar());
        archivo.mostrar();
    }
}
