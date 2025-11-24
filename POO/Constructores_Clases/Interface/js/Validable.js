class Validable {
    constructor() {
        if (this.constructor === Validable) {
            throw new Error("No se puede instanciar una interfaz");
        }
    }

    validar() {
        throw new Error("Método debe ser implementado");
    }

    obtenerErrores() {
        throw new Error("Método debe ser implementado");
    }

    esValido() {
        throw new Error("Método debe ser implementado");
    }
}

class Formulario extends Validable {
    constructor(nombre, campos) {
        super();
        this.nombre = nombre;
        this.campos = campos;
        this.errores = [];
    }

    validar() {
        this.errores = [];
        
        for (const campo of this.campos) {
            if (!campo.valor || campo.valor.trim() === '') {
                this.errores.push(`El campo ${campo.nombre} es requerido`);
            }
            
            if (campo.tipo === 'email' && !this.validarEmail(campo.valor)) {
                this.errores.push(`El campo ${campo.nombre} no es un email válido`);
            }
        }
        
        return this.errores.length === 0;
    }

    validarEmail(email) {
        const regex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        return regex.test(email);
    }

    obtenerErrores() {
        return this.errores;
    }

    esValido() {
        return this.errores.length === 0;
    }

    mostrar() {
        console.log(`Formulario: ${this.nombre}`);
        console.log("Campos:", this.campos);
        console.log("Válido:", this.esValido());
        if (!this.esValido()) {
            console.log("Errores:", this.errores);
        }
    }
}

// Uso
const formulario = new Formulario("Registro", [
    { nombre: "nombre", tipo: "text", valor: "Juan" },
    { nombre: "email", tipo: "email", valor: "juan@example.com" },
    { nombre: "edad", tipo: "number", valor: "25" }
]);

formulario.validar();
formulario.mostrar();