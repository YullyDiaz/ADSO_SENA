package POO;

public class Cargador {
    public String marca;
    public int codigo;

    public void cargar() {//Método cargar del Cargador
        System.out.println("Marca " + marca);
        System.out.println("Codigo " + codigo);
    }

    Cargador cargador1 = new Cargador(); //Instancia de la clase cargar
}

