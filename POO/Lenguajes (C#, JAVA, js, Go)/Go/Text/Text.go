import "fmt"

//Se utilizan atributos como Nombre, Apellido y Profesion son los que se manejan como texto por lo tanto, se implementan en el ejercicio.
type Text struct {
    name      string
    lastName  string
    profession string
}

//Implementación de un contructor para los atributos con parámetros
func NewText(nameData, lastNameData, professionData string) *Text {
    if nameData == "" {
        nameData = "Yully"
    }
    if lastNameData == "" {
        lastNameData = "Diaz"
    }
    if professionData == "" {
        professionData = "Aprendiz SENA"
    }

    return &Text{
        name:      nameData,
        lastName:  lastNameData,
        profession: professionData,
    }
}

//En esta sección empleamos el encapsulamiento aplicando get y set a los atributos
func (t *Text) GetName() string {
    return t.name
}

func (t *Text) SetName(newName string) {
    t.name = newName
}

func (t *Text) GetLastName() string {
    return t.lastName
}

func (t *Text) SetLastName(newLastName string) {
    t.lastName = newLastName
}

func (t *Text) GetProfession() string {
    return t.profession
}

func (t *Text) SetProfession(newProfession string) {
    t.profession = newProfession
}

//En esta parte de la codificación aplicamos un metodo con return en donde esperamos que el programa regrese el texto completo
func (t *Text) FullText() string {
    return t.name + " " + t.lastName + " - " + t.profession
}

//Por último implementamos un metodo void para la ejecución del programa.
func (t *Text) DisplayTextData() {
    fmt.Println("DATOS DE TEXTO")
    fmt.Println("Nombre:", t.name)
    fmt.Println("Apellido:", t.lastName)
    fmt.Println("Profesión:", t.profession)
    fmt.Println("Texto completo:", t.FullText())
}