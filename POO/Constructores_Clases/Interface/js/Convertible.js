class Convertible {
    constructor() {
        if (this.constructor === Convertible) {
            throw new Error("No se puede instanciar una interfaz");
        }
    }

    convertir() {
        throw new Error("Método debe ser implementado");
    }

    obtenerFormatoOrigen() {
        throw new Error("Método debe ser implementado");
    }

    obtenerFormatoDestino() {
        throw new Error("Método debe ser implementado");
    }
}

class ConversorMoneda extends Convertible {
    constructor(monedaOrigen, monedaDestino, tasaCambio) {
        super();
        if (arguments.length === 2) {
            this.monedaOrigen = monedaOrigen;
            this.monedaDestino = monedaDestino;
            this.tasaCambio = 1.0;
        } else {
            this.monedaOrigen = monedaOrigen;
            this.monedaDestino = monedaDestino;
            this.tasaCambio = tasaCambio;
        }
    }

    convertir(cantidad) {
        return cantidad * this.tasaCambio;
    }

    obtenerFormatoOrigen() {
        return this.monedaOrigen;
    }

    obtenerFormatoDestino() {
        return this.monedaDestino;
    }

    mostrar() {
        console.log(`Conversor: ${this.monedaOrigen} -> ${this.monedaDestino}`);
        console.log(`Tasa de cambio: ${this.tasaCambio}`);
    }

    probarConversion(cantidad) {
        const resultado = this.convertir(cantidad);
        console.log(`${cantidad} ${this.monedaOrigen} = ${resultado.toFixed(2)} ${this.monedaDestino}`);
    }
}

// Uso
const conversor1 = new ConversorMoneda("USD", "EUR");
const conversor2 = new ConversorMoneda("USD", "EUR", 0.85);

conversor1.mostrar();
conversor2.mostrar();

conversor2.probarConversion(100);