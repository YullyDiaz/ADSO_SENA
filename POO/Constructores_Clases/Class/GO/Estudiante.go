package main

import "fmt"

type Estudiante struct {
    nombre string
    edad   int
    grado  string
    promedio float64
}

// Constructor 1: Solo nombre y edad
func NewEstudiante(nombre string, edad int) *Estudiante {
    return &Estudiante{
        nombre: nombre,
        edad:   edad,
        grado:  "No asignado",
        promedio: 0.0,
    }
}

// Constructor 2: Todos los parámetros
func NewEstudianteCompleto(nombre string, edad int, grado string, promedio float64) *Estudiante {
    return &Estudiante{
        nombre:   nombre,
        edad:     edad,
        grado:    grado,
        promedio: promedio,
    }
}

func (e *Estudiante) Mostrar() {
    fmt.Printf("Estudiante: %s, Edad: %d, Grado: %s, Promedio: %.2f\n",
        e.nombre, e.edad, e.grado, e.promedio)
}

func main() {
    est1 := NewEstudiante("Ana", 20)
    est2 := NewEstudianteCompleto("Carlos", 22, "Ingeniería", 8.5)
    
    est1.Mostrar()
    est2.Mostrar()
}