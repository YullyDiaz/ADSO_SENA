package POO;

public class Teclado {
    public String marca;
    public String color;
    public int codigo;

    public void teclear() {//Método teclear paera el teclado
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
        System.out.println("Codigo: " + codigo);
    }

    Teclado teclado1 = new Teclado(); //Instancia de la clase Teclado
}
