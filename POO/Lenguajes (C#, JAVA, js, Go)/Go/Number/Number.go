import (
    "fmt"
    "strconv"
)

//Se utilizan atributos como Teléfono y Edad para realizar el ejercicio.
type Number struct {
    phone int64
    age   int
}

//Implementación de un contructor para los atributos con parámetros
func NewNumber(phoneData int64, ageData int) *Number {
    if phoneData == 0 {
        phoneData = 1234567890
    }
    if ageData == 0 {
        ageData = 25
    }

    return &Number{
        phone: phoneData,
        age:   ageData,
    }
}

//En esta sección empleamos el encapsulamiento aplicando get y set a los atributos
func (n *Number) GetPhone() int64 {
    return n.phone
}

func (n *Number) SetPhone(newPhone int64) {
    if newPhone > 0 {
        n.phone = newPhone
    }
}

func (n *Number) GetAge() int {
    return n.age
}

func (n *Number) SetAge(newAge int) {
    if newAge >= 0 && newAge <= 120 {
        n.age = newAge
    }
}

//En esta parte de la codificación aplicamos un metodo con return en donde esperamos que el programa nos regrese el número de teléfono formateado
func (n *Number) FormatPhoneNumber() string {
    phoneString := strconv.FormatInt(n.phone, 10)
    if len(phoneString) == 10 {
        return "(" + phoneString[:3] + ") " + phoneString[3:6] + "-" + phoneString[6:]
    }
    return phoneString
}

//Por último implementamos un metodo void para la ejecución del programa.
func (n *Number) DisplayNumberData() {
    fmt.Println("DATOS NUMÉRICOS")
    fmt.Println("Teléfono:", n.phone)
    fmt.Println("Edad:", n.age)
    fmt.Println("Teléfono formateado:", n.FormatPhoneNumber())
}