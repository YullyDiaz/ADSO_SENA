class Empleado {
    constructor() {
        if (this.constructor === Empleado) {
            throw new Error("No se puede instanciar una clase abstracta");
        }
    }

    trabajar() {
        throw new Error("Método abstracto debe ser implementado");
    }

    calcularSalario() {
        throw new Error("Método abstracto debe ser implementado");
    }

    mostrar() {
        throw new Error("Método abstracto debe ser implementado");
    }
}

class Desarrollador extends Empleado {
    constructor(nombre, lenguaje, salario) {
        super();
        this.nombre = nombre;
        this.lenguaje = lenguaje;
        this.salario = salario;
    }

    // Constructor de copia
    static from(other) {
        return new Desarrollador(other.nombre, other.lenguaje, other.salario);
    }

    trabajar() {
        return `Programando en ${this.lenguaje}`;
    }

    calcularSalario() {
        return this.salario;
    }

    mostrar() {
        console.log(`Desarrollador: ${this.nombre}`);
        console.log(`Lenguaje: ${this.lenguaje}, Salario: $${this.salario}`);
        console.log(`Trabajo: ${this.trabajar()}`);
    }
}

// Uso
const original = new Desarrollador("Ana", "JavaScript", 50000);
const copia = Desarrollador.from(original);

original.mostrar();
copia.mostrar();