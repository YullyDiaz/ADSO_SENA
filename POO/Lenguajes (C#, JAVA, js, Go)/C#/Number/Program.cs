//Se utilizan atributos como Teléfono y Edad para realizar el ejercicio.
class Number{
    //Se utilizan modificadores de acceso privados
    private long phone;
    private int age;

    //Implementación de un contructor para los atributos con parámetros
    public Number(long? phoneData = null, int? ageData = null){
        this.phone = phoneData ?? 1234567890;
        this.age = ageData ?? 25;
    }

    //En esta sección empleamos el encapsulamiento aplicando get y set a los atributos
    public long GetPhone(){
        return this.phone;
    }

    public void SetPhone(long newPhone){
        if (newPhone > 0){
            this.phone = newPhone;
        }
        else{
            throw new ArgumentException("El teléfono debe ser un número válido");
        }
    }

    public int GetAge(){
        return this.age;
    }

    public void SetAge(int newAge){
        if (newAge >= 0 && newAge <= 120){
            this.age = newAge;
        }
        else{
            throw new ArgumentException("La edad debe ser un número entre 0 y 120");
        }
    }

    //En esta parte de la codificación aplicamos un metodo con return en donde esperamos que el programa nos regrese el número de teléfono formateado
    public string FormatPhoneNumber(){
        string phoneString = this.phone.ToString();
        if (phoneString.Length == 10){
            return $"({phoneString.Substring(0, 3)}) {phoneString.Substring(3, 3)}-{phoneString.Substring(6)}";
        }
        return phoneString; 
    }

    //Por último implementamos un metodo void para la ejecución del programa.
    public void DisplayNumberData(){
        Console.WriteLine("DATOS NUMÉRICOS");
        Console.WriteLine("Teléfono: " + this.phone);
        Console.WriteLine("Edad: " + this.age);
        Console.WriteLine("Teléfono formateado: " + this.FormatPhoneNumber());
    }
}
