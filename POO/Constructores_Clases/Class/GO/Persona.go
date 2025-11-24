package main

import "fmt"

type Persona struct {
    nombre string
    edad   int
}

// Constructor sin parámetros
func NewPersona() *Persona {
    return &Persona{
        nombre: "Desconocido",
        edad:   0,
    }
}

func (p *Persona) Mostrar() {
    fmt.Printf("Nombre: %s, Edad: %d\n", p.nombre, p.edad)
}

func main() {
    persona := NewPersona()
    persona.Mostrar()
}