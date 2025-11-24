class Estudiante {
    constructor(nombre, edad, grado, promedio) { //Constructor sobrecargado
        if (arguments.length === 2) {
            this.nombre = nombre;
            this.edad = edad;
            this.grado = "No asignado";
            this.promedio = 0.0;
        } else {
            this.nombre = nombre;
            this.edad = edad;
            this.grado = grado;
            this.promedio = promedio;
        }
    }

    mostrar() {
        console.log(`Estudiante: ${this.nombre}, Edad: ${this.edad}, Grado: ${this.grado}, Promedio: ${this.promedio}`);
    }
}

// Uso
const est1 = new Estudiante("Ana", 20);
const est2 = new Estudiante("Carlos", 22, "Ingeniería", 8.5);

est1.mostrar();
est2.mostrar();