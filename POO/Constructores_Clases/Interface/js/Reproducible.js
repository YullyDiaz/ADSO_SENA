// Simulación de interfaz en JavaScript
class Reproducible {
    constructor() {
        if (this.constructor === Reproducible) {
            throw new Error("No se puede instanciar una interfaz");
        }
    }

    reproducir() {
        throw new Error("Método debe ser implementado");
    }

    pausar() {
        throw new Error("Método debe ser implementado");
    }

    detener() {
        throw new Error("Método debe ser implementado");
    }
}

class Video extends Reproducible {
    constructor() {
        super();
        this.titulo = "Video sin título";
        this.duracion = 0;
        this.reproduciendo = false;
    }

    reproducir() {
        this.reproduciendo = true;
        return `Reproduciendo: ${this.titulo}`;
    }

    pausar() {
        this.reproduciendo = false;
        return "Video pausado";
    }

    detener() {
        this.reproduciendo = false;
        return "Video detenido";
    }

    mostrar() {
        const estado = this.reproduciendo ? "Reproduciendo" : "Detenido";
        console.log(`Video: ${this.titulo}`);
        console.log(`Duración: ${this.duracion}s, Estado: ${estado}`);
    }
}

// Uso
const video = new Video();
video.mostrar();
console.log(video.reproducir());
video.mostrar();