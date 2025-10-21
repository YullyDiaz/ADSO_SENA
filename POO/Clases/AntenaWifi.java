package POO;

public class AntenaWifi {
    public String marca;
    public int capacidad;
    public int codigo;

    public void transmitir() {//Método conectar para la antena wifi
        System.out.println("Marca: " + marca);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Codigo: " + codigo);
    }
    AntenaWifi antena1 = new AntenaWifi(); //Instancia de la clase AntenaWifi
}
