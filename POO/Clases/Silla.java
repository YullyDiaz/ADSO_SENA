package POO;

public class Silla {
    public String color;
    public int altura;

    public void Sostene() {//Método sostener de la silla
        System.out.println("Color: " + color);
        System.out.println("Altura: " + altura);
    }

    Silla silla1 = new Silla(); //Instancia de la clase silla
}

