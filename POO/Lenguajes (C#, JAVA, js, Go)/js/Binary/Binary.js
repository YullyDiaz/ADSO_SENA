//Se utilizan atributos como Imagen, Audio, Vídeo y Archivo son los que se manejan como datos binarios por lo tanto, se implementan en el ejercicio.
class Binary{

   //Se utilizan modificadores de acceso privados
    #image;
    #audio;

    //Implementación de un contructor para los atributos con parámetros
    constructor(imageData = null, audioData = null){
        this.#image = imageData || new Uint8Array([1, 0, 1, 0, 1, 0, 1, 0]);
        this.#audio = audioData || new Uint8Array([128, 255, 64, 192, 32]);
    }

    //En esta sección empleamos el encapsulamiento aplicando get y set a los atributos
    getImage() {
        return this.#image;
    }

    setImage(newImage) {
        if (newImage instanceof Uint8Array) {
                this.#image = newImage;
        } else {
                throw new Error("El dato debe ser Uint8Array");
        }
    }

    getAudio() {
        return this.#audio;
    }

    setAudio(newAudio) {
    if (newAudio instanceof Uint8Array) {
        this.#audio = newAudio;
    } else {
        throw new Error("El audio debe ser Uint8Array");
    }
    }

    //En esta parte de la codificación aplicamos un metodo con return en donde esperamos que el programa nos regrese los datos binarios
        combineImageAudio(){
        const combinedData = new Uint8Array(this.#image.length + this.#audio.length);
        combinedData.set(this.#image);
        combinedData.set(this.#audio, this.#image.length);
        
        return combinedData;
        }

    //Por último implementamos un metodo void para la ejecución del programa.
    displayAllData() {
    console.log("DATOS BINARIOS");
    console.log("Imagen (píxeles):", this.#image);
    console.log("Audio (amplitud):", this.#audio);
    }
}