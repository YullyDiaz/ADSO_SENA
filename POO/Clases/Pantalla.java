package POO;

public class Pantalla {
    public String marca;
    public int altura;
    public int ancho;

    public void mostraInfo() {//Método de mostrar informacióndel computador
        System.out.println("Marca: " + marca);
        System.out.println("Altura: " + altura);
        System.out.println("Ancho: " + ancho);
    }

    Pantalla pantalla1 = new Pantalla(); //Instancia de la clase Pantalla
}
