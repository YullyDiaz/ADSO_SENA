class Vehiculo {//Constructor con parámtros
    constructor(marca, modelo, año, precio, enStock) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
        this.enStock = enStock;
    }

    mostrar() {
        const estado = this.enStock ? "Disponible" : "No disponible";
        console.log(`${this.marca} ${this.modelo} (${this.año}) - $${this.precio.toFixed(2)} - ${estado}`);
    }
}

// Uso
const vehiculo = new Vehiculo("Toyota", "Corolla", 2023, 25000.00, true);
vehiculo.mostrar();