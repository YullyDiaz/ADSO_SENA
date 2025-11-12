//Se utilizan atributos como verdadero, falso, encendido, y apagado son los que se manejan como datos boleanos por lo tanto, se implementan en el ejercicio.
type Boolean struct {
    onState bool
    offState bool
}

//Implementación de un contructor para los atributos con parámetros
func NewBoolean(onState, offState bool) *Boolean {
    return &Boolean{
        onState: onState,
        offState: offState,
    }
}

//En esta sección empleamos el encapsulamiento aplicando get y set a los atributos
func (b *Boolean) GetOnState() bool {
    return b.onState
}

func (b *Boolean) SetOnState(newOnState bool) {
    b.onState = newOnState
}

func (b *Boolean) GetOffState() bool {
    return b.offState
}

func (b *Boolean) SetOffState(newOffState bool) {
    b.offState = newOffState
}

//En esta parte de la codificación aplicamos un metodo con return en donde esperamos que el programa regrese el estado del sistema
func (b *Boolean) SystemActive() bool {
    isActive := b.onState && !b.offState
    return isActive
}

//Por último implementamos un metodo void para la ejecución del programa.
func (b *Boolean) DisplaySystemState() {
    fmt.Println("ESTADO DEL SISTEMA")
    fmt.Println("Sistema encendido:", b.onState)
    fmt.Println("Sistema apagado:", b.offState)
}