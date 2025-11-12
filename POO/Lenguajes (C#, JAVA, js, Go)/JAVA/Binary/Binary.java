//Se utilizan atributos como Imagen, Audio, Vídeo y Archivo son los que se manejan como datos binarios por lo tanto, se implementan en el ejercicio.
class Binary{

   //Se utilizan modificadores de acceso privados
    private byte[] image;
    private byte[] audio;

    //Implementación de un contructor para los atributos con parámetros
    public Binary(byte[] imageData, byte[] audioData){
        this.image = (imageData != null) ? imageData : new byte[]{1, 0, 1, 0, 1, 0, 1, 0};
        this.audio = (audioData != null) ? audioData : new byte[]{(byte)128, (byte)255, 64, (byte)192, 32};
    }

    //En esta sección empleamos el encapsulamiento aplicando get y set a los atributos
    public byte[] getImage() {
        return this.image;
    }

    public void setImage(byte[] newImage) {
        if (newImage != null) {
                this.image = newImage;
        } else {
                throw new IllegalArgumentException("El dato debe ser byte[]");
        }
    }

    public byte[] getAudio() {
        return this.audio;
    }

    public void setAudio(byte[] newAudio) {
    if (newAudio != null) {
        this.audio = newAudio;
    } else {
        throw new IllegalArgumentException("El audio debe ser byte[]");
    }
    }

    //En esta parte de la codificación aplicamos un metodo con return en donde esperamos que el programa nos regrese los datos binarios
    public byte[] combineImageAudio(){
        byte[] combinedData = new byte[this.image.length + this.audio.length];
        System.arraycopy(this.image, 0, combinedData, 0, this.image.length);
        System.arraycopy(this.audio, 0, combinedData, this.image.length, this.audio.length);
        
        return combinedData;
    }

    //Por último implementamos un metodo void para la ejecución del programa.
    public void displayAllData() {
    System.out.println("DATOS BINARIOS");
    System.out.println("Imagen (píxeles): " + java.util.Arrays.toString(this.image));
    System.out.println("Audio (amplitud): " + java.util.Arrays.toString(this.audio));
    }
}
