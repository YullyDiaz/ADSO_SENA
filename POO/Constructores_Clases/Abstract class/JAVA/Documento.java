public abstract class Documento {
    protected String titulo;
    protected String autor;

    public abstract void imprimir();
    public abstract void guardar();
    public abstract void mostrar();
}

class Tesis extends Documento {
    private String universidad;
    private int año;
    private int paginas;
    private boolean publicado;

    // Constructor con parámetros
    public Tesis(String titulo, String autor, String universidad, int año, int paginas, boolean publicado) {
        this.titulo = titulo;
        this.autor = autor;
        this.universidad = universidad;
        this.año = año;
        this.paginas = paginas;
        this.publicado = publicado;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo tesis: " + titulo);
        System.out.println("Páginas: " + paginas);
    }

    @Override
    public void guardar() {
        System.out.println("Guardando tesis en el repositorio...");
    }

    @Override
    public void mostrar() {
        String estadoPublicacion = publicado ? "Publicado" : "No publicado";
        System.out.println("Tesis: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Universidad: " + universidad + ", Año: " + año);
        System.out.println("Páginas: " + paginas + ", Estado: " + estadoPublicacion);
    }

    public static void main(String[] args) {
        Documento tesis = new Tesis(
            "Inteligencia Artificial Aplicada",
            "Carlos Rodríguez",
            "Universidad Nacional",
            2024,
            150,
            false
        );

        tesis.mostrar();
        tesis.guardar();
        tesis.imprimir();
    }
}
