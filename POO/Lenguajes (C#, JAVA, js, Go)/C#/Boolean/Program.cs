//Se utilizan atributos como verdadero, falso, encendido, y apagado son los que se manejan como datos boleanos por lo tanto, se implementan en el ejercicio.
class Boolean{
    //Se utilizan modificadores de acceso privados
    private bool onState;
    private bool offState;

    //Implementación de un contructor para los atributos con parámetros
    public Boolean(bool onState = true, bool offState = false){
        this.onState = onState;
        this.offState = offState;
    }

    //En esta sección empleamos el encapsulamiento aplicando get y set a los atributos
    public bool GetOnState(){
        return this.onState;
    }

    public void SetOnState(bool newOnState){
        this.onState = newOnState;
    }

    public bool GetOffState(){
        return this.offState;
    }

    public void SetOffState(bool newOffState){
        this.offState = newOffState;
    }

    //En esta parte de la codificación aplicamos un metodo con return en donde esperamos que el programa regrese el estado del sistema
    public bool SystemActive(){
        bool isActive = this.onState && !this.offState;
        return isActive;
    }

    //Por último implementamos un metodo void para la ejecución del programa.
    public void DisplaySystemState(){
        Console.WriteLine("ESTADO DEL SISTEMA");
        Console.WriteLine("Sistema encendido: " + this.onState);
        Console.WriteLine("Sistema apagado: " + this.offState);
    }
}