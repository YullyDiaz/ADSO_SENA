public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private boolean activa;

    // Constructor sin parámetros
    public CuentaBancaria() {
        this.numeroCuenta = "000000";
        this.saldo = 0.0;
        this.activa = false;
    }

    public void mostrar() {
        System.out.printf("Cuenta: %s, Saldo: $%.2f, Activa: %b%n", 
            numeroCuenta, saldo, activa);
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.mostrar();
    }
}
