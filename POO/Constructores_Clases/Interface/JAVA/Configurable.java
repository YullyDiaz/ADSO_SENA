package Interface.JAVA;
import java.util.HashMap;
import java.util.Map;

public interface Configurable {
    void configurar(Map<String, Object> parametros);
    Map<String, Object> obtenerConfiguracion();
    void reset();
}

class Aplicacion implements Configurable {
    private String nombre;
    private String version;
    private Map<String, Object> configuracion;

    // Constructor con parámetros
    public Aplicacion(String nombre, String version) {
        this.nombre = nombre;
        this.version = version;
        this.configuracion = new HashMap<>();
    }

    // Constructor de copia
    public Aplicacion(Aplicacion other) {
        this.nombre = other.nombre;
        this.version = other.version;
        this.configuracion = new HashMap<>(other.configuracion);
    }

    @Override
    public void configurar(Map<String, Object> parametros) {
        configuracion.putAll(parametros);
    }

    @Override
    public Map<String, Object> obtenerConfiguracion() {
        return new HashMap<>(configuracion);
    }

    @Override
    public void reset() {
        configuracion.clear();
    }

    public void mostrar() {
        System.out.println("Aplicación: " + nombre + " v" + version);
        System.out.println("Configuración: " + configuracion);
    }

    public static void main(String[] args) {
        Aplicacion original = new Aplicacion("MiApp", "1.0");
        Map<String, Object> config = new HashMap<>();
        config.put("tema", "oscuro");
        config.put("idioma", "es");
        config.put("notificaciones", true);
        original.configurar(config);

        Aplicacion copia = new Aplicacion(original);

        Configurable config1 = original;
        Configurable config2 = copia;

        original.mostrar();
        copia.mostrar();
    }
}
