import (
    "encoding/json"
    "fmt"
    "time"
)

//Se utilizan atributos como Nombre y Empresa para realizar el ejercicio.
type Json struct {
    user    map[string]interface{}
    company map[string]interface{}
}

// Implementación del constructor para los atributos con parámetros
func NewJson(userData, companyData map[string]interface{}) *Json {
    if userData == nil {
        userData = map[string]interface{}{
            "Nombre ":  "Yully Diaz",
            "Edad ":   18,
            "Email": "yully@example.com",
        }
    }
    if companyData == nil {
        companyData = map[string]interface{}{
            "Empresa ":      "Coca cola",
            "Empleados ": 100,
            "Fundacion ":   2020,
        }
    }

    return &Json{
        user:    userData,
        company: companyData,
    }
}

// En esta sección empleamos el encapsulamiento aplicando get y set a los atributos
func (j *Json) GetUser() map[string]interface{} {
    return j.user
}

func (j *Json) SetUser(newUser map[string]interface{}) {
    j.user = newUser
}

func (j *Json) GetCompany() map[string]interface{} {
    return j.company
}

func (j *Json) SetCompany(newCompany map[string]interface{}) {
    j.company = newCompany
}

// En esta parte aplicamos un método con return que combina usuario y empresa en un JSON
func (j *Json) CombineJson() string {
    combinedData := map[string]interface{}{
        "Usuario ":      j.user,
        "Empresa ":   j.company,
        "Tiempo ": time.Now().Format(time.RFC3339),
    }

    jsonData, _ := json.Marshal(combinedData)
    return string(jsonData)
}

// Por último implementamos un método void para la ejecución del programa.
func (j *Json) DisplayJsonData() {
    userJson, _ := json.MarshalIndent(j.user, "", "  ")
    companyJson, _ := json.MarshalIndent(j.company, "", "  ")

    fmt.Println("DATOS JSON")
    fmt.Println("Usuario:", string(userJson))
    fmt.Println("Empresa:", string(companyJson))
}