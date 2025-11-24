class Notificacion {
    constructor() {
        if (this.constructor === Notificacion) {
            throw new Error("No se puede instanciar una clase abstracta");
        }
    }

    enviar() {
        throw new Error("Método abstracto debe ser implementado");
    }

    obtenerPrioridad() {
        throw new Error("Método abstracto debe ser implementado");
    }

    mostrar() {
        throw new Error("Método abstracto debe ser implementado");
    }
}

class SMS extends Notificacion {
    constructor(numero, mensaje, urgente) {
        super();
        this.numero = numero;
        this.mensaje = mensaje;
        this.urgente = urgente;
    }

    enviar() {
        return `SMS enviado al número: ${this.numero}`;
    }

    obtenerPrioridad() {
        return this.urgente ? "ALTA" : "NORMAL";
    }

    mostrar() {
        console.log(`SMS para: ${this.numero}`);
        console.log(`Mensaje: ${this.mensaje}`);
        console.log(`Prioridad: ${this.obtenerPrioridad()}`);
    }
}

// Uso
const sms = new SMS("+123456789", "Tu código de verificación es: 1234", true);
sms.mostrar();
console.log(sms.enviar());