//Se utilizan atributos como Nombre, Apellido y Profesion son los que se manejan como texto por lo tanto, se implementan en el ejercicio.
class Text
{
    //Se utilizan modificadores de acceso privados
    private string name;
    private string lastName;
    private string profession;

    //Implementación de un contructor para los atributos con parámetros
    public Text(string nameData = null, string lastNameData = null, string professionData = null){
        this.name = nameData ?? "Yully";
        this.lastName = lastNameData ?? "Diaz";
        this.profession = professionData ?? "Aprendiz SENA";
    }

    //En esta sección empleamos el encapsulamiento aplicando get y set a los atributos
    public string GetName(){
        return this.name;
    }

    public void SetName(string newName){
        if (!string.IsNullOrWhiteSpace(newName)){
            this.name = newName.Trim();
        }
        else{
            throw new ArgumentException("El nombre debe ser un texto válido");
        }
    }

    public string GetLastName(){
        return this.lastName;
    }

    public void SetLastName(string newLastName){
        if (!string.IsNullOrWhiteSpace(newLastName)){
            this.lastName = newLastName.Trim();
        }
        else{
            throw new ArgumentException("El apellido debe ser un texto válido");
        }
    }

    public string GetProfession(){
        return this.profession;
    }

    public void SetProfession(string newProfession){
        if (!string.IsNullOrWhiteSpace(newProfession)){
            this.profession = newProfession.Trim();
        }
        else{
            throw new ArgumentException("La profesión debe ser un texto válido");
        }
    }

    //En esta parte de la codificación aplicamos un metodo con return en donde esperamos que el programa regrese el texto completo
    public string FullText(){
        return $"{this.name} {this.lastName} - {this.profession}";
    }

    //Por último implementamos un metodo void para la ejecución del programa.
    public void DisplayTextData(){
        Console.WriteLine("DATOS DE TEXTO");
        Console.WriteLine("Nombre: " + this.name);
        Console.WriteLine("Apellido: " + this.lastName);
        Console.WriteLine("Profesión: " + this.profession);
        Console.WriteLine("Texto completo: " + this.FullText());
    }
}
