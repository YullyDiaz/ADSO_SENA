// Simulación de clase abstracta en JavaScript
class Animal {
    constructor() {
        if (this.constructor === Animal) {
            throw new Error("No se puede instanciar una clase abstracta");
        }
        this.nombre = "Sin nombre";
        this.especie = "Desconocida";
    }

    // Métodos abstractos
    hacerSonido() {
        throw new Error("Método abstracto debe ser implementado");
    }

    moverse() {
        throw new Error("Método abstracto debe ser implementado");
    }

    mostrar() {
        console.log(`${this.nombre} - ${this.especie}`);
    }
}

class Perro extends Animal {
    constructor() {
        super();
        this.nombre = "Rex";
        this.especie = "Perro";
    }

    hacerSonido() {
        return "Guau guau!";
    }

    moverse() {
        return "Corriendo en cuatro patas";
    }

    mostrar() {
        super.mostrar();
        console.log(`Sonido: ${this.hacerSonido()}`);
        console.log(`Movimiento: ${this.moverse()}`);
    }
}

// Uso
const perro = new Perro();
perro.mostrar();