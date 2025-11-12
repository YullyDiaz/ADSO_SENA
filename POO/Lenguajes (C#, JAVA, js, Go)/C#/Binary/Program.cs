//Se utilizan atributos como Imagen, Audio, Vídeo y Archivo son los que se manejan como datos binarios por lo tanto, se implementan en el ejercicio.
class Binary{

    //Se utilizan modificadores de acceso privados
    private byte[] image;
    private byte[] audio;

    //Implementación de un contructor para los atributos con parámetros
    public Binary(byte[] imageData = null, byte[] audioData = null){
        this.image = imageData ?? new byte[] { 1, 0, 1, 0, 1, 0, 1, 0 };
        this.audio = audioData ?? new byte[] { 128, 255, 64, 192, 32 };
    }

    //En esta sección empleamos el encapsulamiento aplicando get y set a los atributos
    public byte[] GetImage(){
        return this.image;
    }

    public void SetImage(byte[] newImage){
        if (newImage is byte[]){
            this.image = newImage;
        }
        else{
            throw new ArgumentException("El dato debe ser byte[]");
        }
    }

    public byte[] GetAudio(){
        return this.audio;
    }

    public void SetAudio(byte[] newAudio){
        if (newAudio is byte[]){
            this.audio = newAudio;
        }
        else{
            throw new ArgumentException("El audio debe ser byte[]");
        }
    }

    //En esta parte de la codificación aplicamos un metodo con return en donde esperamos que el programa nos regrese los datos binarios
    public byte[] CombineImageAudio(){
        byte[] combinedData = new byte[this.image.Length + this.audio.Length];
        Array.Copy(this.image, 0, combinedData, 0, this.image.Length);
        Array.Copy(this.audio, 0, combinedData, this.image.Length, this.audio.Length);
        
        return combinedData;
    }

    //Por último implementamos un metodo void para la ejecución del programa.
    public void DisplayAllData(){
        Console.WriteLine("DATOS BINARIOS");
        Console.WriteLine("Imagen (píxeles): " + string.Join(", ", this.image));
        Console.WriteLine("Audio (amplitud): " + string.Join(", ", this.audio));
    }
}