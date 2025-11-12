//Se utilizan atributos como Imagen, Audio, Vídeo y Archivo son los que se manejan como datos binarios por lo tanto, se implementan en el ejercicio.
type Binary struct {
    image []byte
    audio []byte
}

//Implementación de un contructor para los atributos con parámetros
func NewBinary(imageData, audioData []byte) *Binary {
    if imageData == nil {
        imageData = []byte{1, 0, 1, 0, 1, 0, 1, 0}
    }
    if audioData == nil {
        audioData = []byte{128, 255, 64, 192, 32}
    }
    
    return &Binary{
        image: imageData,
        audio: audioData,
    }
}

//En esta sección empleamos el encapsulamiento aplicando get y set a los atributos
func (b *Binary) GetImage() []byte {
    return b.image
}

func (b *Binary) SetImage(newImage []byte) {
    b.image = newImage
}

func (b *Binary) GetAudio() []byte {
    return b.audio
}

func (b *Binary) SetAudio(newAudio []byte) {
    b.audio = newAudio
}

//En esta parte de la codificación aplicamos un metodo con return en donde esperamos que el programa nos regrese los datos binarios
func (b *Binary) CombineImageAudio() []byte {
    combinedData := make([]byte, len(b.image)+len(b.audio))
    copy(combinedData, b.image)
    copy(combinedData[len(b.image):], b.audio)
    
    return combinedData
}

//Por último implementamos un metodo void para la ejecución del programa.
func (b *Binary) DisplayAllData() {
    fmt.Println("DATOS BINARIOS")
    fmt.Println("Imagen (píxeles):", b.image)
    fmt.Println("Audio (amplitud):", b.audio)
}