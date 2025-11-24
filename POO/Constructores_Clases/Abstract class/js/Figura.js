class Figura {
    constructor() {
        if (this.constructor === Figura) {
            throw new Error("No se puede instanciar una clase abstracta");
        }
        this.color = "negro";
    }

    calcularArea() {
        throw new Error("Método abstracto debe ser implementado");
    }

    calcularPerimetro() {
        throw new Error("Método abstracto debe ser implementado");
    }

    mostrar() {
        console.log(`Color: ${this.color}`);
    }
}

class Circulo extends Figura {
    constructor() {
        super();
        this.radio = 1.0;
    }

    calcularArea() {
        return Math.PI * this.radio * this.radio;
    }

    calcularPerimetro() {
        return 2 * Math.PI * this.radio;
    }

    mostrar() {
        super.mostrar();
        console.log(`Círculo - Radio: ${this.radio}`);
        console.log(`Área: ${this.calcularArea().toFixed(2)}`);
        console.log(`Perímetro: ${this.calcularPerimetro().toFixed(2)}`);
    }
}

// Uso
const circulo = new Circulo();
circulo.mostrar();