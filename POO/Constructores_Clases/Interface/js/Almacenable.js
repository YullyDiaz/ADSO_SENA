class Almacenable {
    constructor() {
        if (this.constructor === Almacenable) {
            throw new Error("No se puede instanciar una interfaz");
        }
    }

    guardar() {
        throw new Error("Método debe ser implementado");
    }

    cargar() {
        throw new Error("Método debe ser implementado");
    }

    eliminar() {
        throw new Error("Método debe ser implementado");
    }
}

class Archivo extends Almacenable {
    constructor() {
        super();
        this.nombre = "archivo.txt";
        this.tamaño = 0;
        this.formato = "txt";
        this.guardado = false;
    }

    guardar() {
        this.guardado = true;
        return `Archivo ${this.nombre} guardado`;
    }

    cargar() {
        return `Cargando archivo ${this.nombre}`;
    }

    eliminar() {
        this.guardado = false;
        return `Archivo ${this.nombre} eliminado`;
    }

    mostrar() {
        const estado = this.guardado ? "Guardado" : "No guardado";
        console.log(`Archivo: ${this.nombre}`);
        console.log(`Formato: ${this.formato}, Tamaño: ${this.tamaño} bytes`);
        console.log(`Estado: ${estado}`);
    }
}

// Uso
const archivo = new Archivo();
archivo.mostrar();
console.log(archivo.guardar());
archivo.mostrar();