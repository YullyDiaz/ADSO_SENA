package POO;

public class Aprendiz {//Se define la clase Aprendiz
    public String nombre;
    public String apellido;
    public int edad;

    public void inscribir() {//Método para inscribir al aprendiz
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
    }

    Aprendiz aprendiz1 = new Aprendiz(); //Instancia de la clase Aprendiz
}


