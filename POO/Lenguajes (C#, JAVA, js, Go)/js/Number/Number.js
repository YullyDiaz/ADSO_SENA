//Se utilizan atributos como Teléfono y Edad para realizar el ejercicio.
class Number{

    //Se utilizan modificadores de acceso privados
    #phone;
    #age;

    //Implementación de un contructor para los atributos con parámetros
    constructor(phoneData = null, ageData = null) {
        this.#phone = phoneData || 1234567890;
        this.#age = ageData || 25;
    }

    //En esta sección empleamos el encapsulamiento aplicando get y set a los atributos
    getPhone() {
        return this.#phone;
    }

    setPhone(newPhone) {
        if (typeof newPhone === 'number' && newPhone > 0) {
            this.#phone = newPhone;
        } else {
            throw new Error("El teléfono debe ser un número válido");
        }
    }

    getAge() {
        return this.#age;
    }

    setAge(newAge) {
        if (typeof newAge === 'number' && newAge >= 0 && newAge <= 120) {
            this.#age = newAge;
        } else {
            throw new Error("La edad debe ser un número entre 0 y 120");
        }
    }

    //En esta parte de la codificación aplicamos un metodo con return en donde esperamos que el programa nos regrese el número de teléfono formateado
    formatPhoneNumber() {
        const phoneString = this.#phone.toString();
        if (phoneString.length === 10) {
            return `(${phoneString.substring(0, 3)}) ${phoneString.substring(3, 6)}-${phoneString.substring(6)}`;
        }
        return this.#phone.toString(); 
    }

    //Por último implementamos un metodo void para la ejecución del programa.
    displayNumberData() {
        console.log("DATOS NUMÉRICOS");
        console.log("Teléfono:", this.#phone);
        console.log("Edad:", this.#age);
        console.log("Teléfono formateado:", this.formatPhoneNumber());
    }
}