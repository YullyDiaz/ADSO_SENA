class Configurable {
    constructor() {
        if (this.constructor === Configurable) {
            throw new Error("No se puede instanciar una interfaz");
        }
    }

    configurar(parametros) {
        throw new Error("Método debe ser implementado");
    }

    obtenerConfiguracion() {
        throw new Error("Método debe ser implementado");
    }

    reset() {
        throw new Error("Método debe ser implementado");
    }
}

class Aplicacion extends Configurable {
    constructor(nombre, version) {
        super();
        this.nombre = nombre;
        this.version = version;
        this.configuracion = {};
    }

    // Constructor de copia
    static from(other) {
        const app = new Aplicacion(other.nombre, other.version);
        app.configuracion = {...other.configuracion};
        return app;
    }

    configurar(parametros) {
        this.configuracion = {...this.configuracion, ...parametros};
        return "Configuración actualizada";
    }

    obtenerConfiguracion() {
        return this.configuracion;
    }

    reset() {
        this.configuracion = {};
        return "Configuración restablecida";
    }

    mostrar() {
        console.log(`Aplicación: ${this.nombre} v${this.version}`);
        console.log("Configuración:", this.configuracion);
    }
}

// Uso
const original = new Aplicacion("MiApp", "1.0");
original.configurar({ tema: "oscuro", idioma: "es" });

const copia = Aplicacion.from(original);

original.mostrar();
copia.mostrar();