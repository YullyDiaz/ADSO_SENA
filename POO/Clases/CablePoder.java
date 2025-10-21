package POO;

public class CablePoder {
    public String marca;
    public int longitud;
    

    public void conectar() {//Método conectar para el cable de poder
        System.out.println("Marca: " + marca);
        System.out.println("Longitud: " + longitud);
        System.out.println("Tipo: " + tipo);
    }

    CablePoder cable1 = new CablePoder(); //Instancia de la clase CablePoder
}
