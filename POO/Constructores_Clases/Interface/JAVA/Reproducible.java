package Interface.JAVA;
public interface Reproducible {
    String reproducir();
    String pausar();
    String detener();
    String info();
}

class Video implements Reproducible {
    private String titulo;
    private int duracion;
    private boolean reproduciendo;

    // Constructor sin parámetros
    public Video() {
        this.titulo = "Video sin título";
        this.duracion = 0;
        this.reproduciendo = false;
    }

    @Override
    public String reproducir() {
        reproduciendo = true;
        return "Reproduciendo: " + titulo;
    }

    @Override
    public String pausar() {
        reproduciendo = false;
        return "Video pausado";
    }

    @Override
    public String detener() {
        reproduciendo = false;
        return "Video detenido";
    }

    @Override
    public String info() {
        String estado = reproduciendo ? "Reproduciendo" : "Detenido";
        return titulo + " - " + duracion + "s - " + estado;
    }

    public void mostrar() {
        System.out.println(info());
    }

    public static void main(String[] args) {
        Reproducible video = new Video();
        video.mostrar();
        System.out.println(video.reproducir());
        video.mostrar();
    }
}