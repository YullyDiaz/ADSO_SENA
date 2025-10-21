package POO;

public class Portatil {
    public String marca;
    public String color;
    public int codigo;

    public void procesarInformacion() {//Método procesar información para el portátil
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
        System.out.println("codigo: " + codigo);
    }

    Portatil portatil1 = new Portatil(); //Instancia de la clase Portatil
}

