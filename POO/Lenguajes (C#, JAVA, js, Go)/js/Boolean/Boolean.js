//Se utilizan atributos como verdadero, falso, encendido, y apagado son los que se manejan como datos boleanos por lo tanto, se implementan en el ejercicio.
class Boolean{

    //Se utilizan modificadores de acceso privados
    #onState;
    #offState;

    //Implementación de un contructor para los atributos con parámetros
    constructor(onState = true, offState = false) {
        this.#onState = onState;
        this.#offState = offState;
    }

    //En esta sección empleamos el encapsulamiento aplicando get y set a los atributos
    getOnState() {
        return this.#onState;
    }

    setOnState(newOnState) {
        if (typeof newOnState === 'boolean') {
            this.#onState = newOnState;
        } else {
            throw new Error("El estado debe ser booleano (true/false)");
        }
    }

    getOffState() {
        return this.#offState;
    }

    setOffState(newOffState) {
        if (typeof newOffState === 'boolean') {
            this.#offState = newOffState;
        } else {
            throw new Error("El estado debe ser booleano (true/false)");
        }
    }

    //En esta parte de la codificación aplicamos un metodo con return en donde esperamos que el programa regrese el estado del sistema
    systemActive() {
        const isActive = this.#onState && !this.#offState;
        return isActive;
    }

    //Por último implementamos un metodo void para la ejecución del programa.
    displaySystemState() {
        console.log("ESTADO DEL SISTEMA");
        console.log("Sistema On:", this.#onState);
        console.log("Sistema Off:", this.#offState);
    }
}