package POO;

public class Mesa {
    public String color;
    public int altura;

    public void sostener() {//Método sostener de la mesa
        System.out.println("Color: " + color);
        System.out.println("Altura: " + altura);
    }

    Mesa mesa1 = new Mesa(); //Instancia de la clase Mesa
}

