package Interface.JAVA;
import java.util.ArrayList;
import java.util.List;

public interface Validable {
    boolean validar();
    List<String> obtenerErrores();
    boolean esValido();
}

class FormularioContacto implements Validable {
    private String nombre;
    private String email;
    private String telefono;
    private String mensaje;
    private List<String> errores;

    // Constructor con parámetros
    public FormularioContacto(String nombre, String email, String telefono, String mensaje) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.mensaje = mensaje;
        this.errores = new ArrayList<>();
    }

    @Override
    public boolean validar() {
        errores.clear();

        if (nombre == null || nombre.trim().isEmpty()) {
            errores.add("El nombre es requerido");
        }

        if (email == null || email.trim().isEmpty()) {
            errores.add("El email es requerido");
        } else if (!validarEmail(email)) {
            errores.add("El email no tiene un formato válido");
        }

        if (telefono == null || telefono.trim().isEmpty()) {
            errores.add("El teléfono es requerido");
        }

        if (mensaje == null || mensaje.trim().isEmpty()) {
            errores.add("El mensaje es requerido");
        } else if (mensaje.length() < 10) {
            errores.add("El mensaje debe tener al menos 10 caracteres");
        }

        return errores.isEmpty();
    }

    private boolean validarEmail(String email) {
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    }

    @Override
    public List<String> obtenerErrores() {
        return new ArrayList<>(errores);
    }

    @Override
    public boolean esValido() {
        return errores.isEmpty();
    }

    public void mostrar() {
        System.out.println("Formulario de Contacto");
        System.out.println("Nombre: " + nombre);
        System.out.println("Email: " + email);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Mensaje: " + (mensaje.length() > 50 ? mensaje.substring(0, 50) + "..." : mensaje));
        System.out.println("Válido: " + esValido());

        if (!esValido()) {
            System.out.println("Errores:");
            for (String error : errores) {
                System.out.println("  - " + error);
            }
        }
    }

    public static void main(String[] args) {
        Validable formulario = new FormularioContacto(
            "Juan Pérez",
            "juan@example.com",
            "123456789",
            "Hola, me gustaría obtener más información sobre sus servicios."
        );

        formulario.validar();
        ((FormularioContacto) formulario).mostrar();
    }
}
