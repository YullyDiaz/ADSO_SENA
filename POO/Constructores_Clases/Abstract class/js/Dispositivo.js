class Dispositivo {
    constructor() {
        if (this.constructor === Dispositivo) {
            throw new Error("No se puede instanciar una clase abstracta");
        }
    }

    encender() {
        throw new Error("Método abstracto debe ser implementado");
    }

    apagar() {
        throw new Error("Método abstracto debe ser implementado");
    }

    mostrar() {
        throw new Error("Método abstracto debe ser implementado");
    }
}

class Telefono extends Dispositivo {
    constructor(marca, modelo, precio, encendido) {
        super();
        if (arguments.length === 2) {
            this.marca = marca;
            this.modelo = modelo;
            this.precio = 0;
            this.encendido = false;
        } else {
            this.marca = marca;
            this.modelo = modelo;
            this.precio = precio;
            this.encendido = encendido;
        }
    }

    encender() {
        this.encendido = true;
        return "Teléfono encendido";
    }

    apagar() {
        this.encendido = false;
        return "Teléfono apagado";
    }

    mostrar() {
        const estado = this.encendido ? "Encendido" : "Apagado";
        console.log(`${this.marca} ${this.modelo} - $${this.precio}`);
        console.log(`Estado: ${estado}`);
    }
}

// Uso
const telefono1 = new Telefono("Samsung", "Galaxy");
const telefono2 = new Telefono("Apple", "iPhone", 1000, true);

telefono1.mostrar();
telefono2.mostrar();