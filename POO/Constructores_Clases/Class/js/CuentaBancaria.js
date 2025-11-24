class CuentaBancaria {
    constructor() { //Constructor sin parámetros
        this.numeroCuenta = "000000";
        this.saldo = 0.0;
        this.activa = false;
    }

    mostrar() {
        console.log(`Cuenta: ${this.numeroCuenta}, Saldo: $${this.saldo.toFixed(2)}, Activa: ${this.activa}`);
    }
}

// Uso
const cuenta = new CuentaBancaria();
cuenta.mostrar();