//Se utilizan atributos como Nombre y Empresa para realizar el ejercicio.
class Json{

    //Se utilizan modificadores de acceso privados
    #user;
    #company;

    // Implementación del constructor para los atributos con parámetros
    constructor(userData = null, companyData = null) {
        this.#user = userData || { name: "Juan", age: 30, email: "juan@example.com" };
        this.#company = companyData || { name: "Tech Corp", employees: 100, founded: 2020 };
    }

    // En esta sección empleamos el encapsulamiento aplicando get y set a los atributos
    getUser() {
        return this.#user;
    }

    setUser(newUser) {
        if (typeof newUser === 'object' && newUser !== null) {
            this.#user = newUser;
        } else {
            throw new Error("El usuario debe ser un objeto válido");
        }
    }

    getCompany() {
        return this.#company;
    }

    setCompany(newCompany) {
        if (typeof newCompany === 'object' && newCompany !== null) {
            this.#company = newCompany;
        } else {
            throw new Error("La empresa debe ser un objeto válido");
        }
    }

    // En esta parte aplicamos un método con return que combina usuario y empresa en un JSON
    combineJson() {
        const combinedData = {
            user: this.#user,
            company: this.#company,
            timestamp: new Date().toISOString()
        };
        return JSON.stringify(combinedData);
    }

    // Por último implementamos un método void para la ejecución del programa.
    displayJsonData() {
        console.log("DATOS JSON");
        console.log("Usuario:", JSON.stringify(this.#user, null, 2));
        console.log("Empresa:", JSON.stringify(this.#company, null, 2));
    }
}