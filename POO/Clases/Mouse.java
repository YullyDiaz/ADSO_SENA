package POO;

public class Mouse {
    public String marca;
    public int codigo;

    public void cliquear() {//Método cliquear del Mouse
        System.out.println("Marca: " + marca);
        System.out.println("codigo: " + codigo);
    }

    Mouse mouse1 = new Mouse(); //Instancia de la clase Mouse
}

