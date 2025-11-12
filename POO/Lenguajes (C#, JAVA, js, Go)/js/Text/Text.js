//Se utilizan atributos como Nombre, Apellido y Profesion son los que se manejan como texto por lo tanto, se implementan en el ejercicio.
class Text{
    //Se utilizan modificadores de acceso privados
    #name;
    #lastName;
    #profession;

    //Implementación de un contructor para los atributos con parámetros
    constructor(nameData = null, lastNameData = null, professionData = null) {
        this.#name = nameData || "Yully";
        this.#lastName = lastNameData || "Diaz";
        this.#profession = professionData || "Aprendiz SENA";
    }

    //En esta sección empleamos el encapsulamiento aplicando get y set a los atributos
    getName() {
        return this.#name;
    }

    setName(newName) {
        if (typeof newName === 'string' && newName.trim().length > 0) {
            this.#name = newName.trim();
        } else {
            throw new Error("El nombre debe ser un texto válido");
        }
    }

    getLastName() {
        return this.#lastName;
    }

    setLastName(newLastName) {
        if (typeof newLastName === 'string' && newLastName.trim().length > 0) {
            this.#lastName = newLastName.trim();
        } else {
            throw new Error("El apellido debe ser un texto válido");
        }
    }

    getProfession() {
        return this.#profession;
    }

    setProfession(newProfession) {
        if (typeof newProfession === 'string' && newProfession.trim().length > 0) {
            this.#profession = newProfession.trim();
        } else {
            throw new Error("La profesión debe ser un texto válido");
        }
    }

    //En esta parte de la codificación aplicamos un metodo con return en donde esperamos que el programa regrese el texto completo
    fullText() {
        return `${this.#name} ${this.#lastName} - ${this.#profession}`;
    }

    //Por último implementamos un metodo void para la ejecución del programa.
    displayTextData() {
        console.log("DATOS DE TEXTO");
        console.log("Nombre:", this.#name);
        console.log("Apellido:", this.#lastName);
        console.log("Profesión:", this.#profession);
        console.log("Texto completo:", this.fullText());
    }
}