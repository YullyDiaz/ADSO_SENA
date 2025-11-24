class Persona {
    constructor() { //Constructor sin parámetros
        this.nombre = "Desconocido";
        this.edad = 0;
    }

    mostrar() {
        console.log(`Nombre: ${this.nombre}, Edad: ${this.edad}`);
    }
}

// Uso
const persona = new Persona();
persona.mostrar();