package main

import "fmt"

// Go no tiene clases abstractas nativas, simulamos con interfaz
type Animal interface {
    Sonido() string
    Moverse() string
    Mostrar()
}

type Perro struct {
    nombre string
    raza   string
    edad   int
}

// Constructor sin parámetros
func NewPerro() *Perro {
    return &Perro{
        nombre: "Sin nombre",
        raza:   "Desconocida",
        edad:   0,
    }
}

func (p *Perro) Sonido() string {
    return "Guau guau!"
}

func (p *Perro) Moverse() string {
    return "Corriendo en cuatro patas"
}

func (p *Perro) Mostrar() {
    fmt.Printf("Perro: %s, Raza: %s, Edad: %d\n", p.nombre, p.raza, p.edad)
    fmt.Printf("Sonido: %s\n", p.Sonido())
    fmt.Printf("Movimiento: %s\n", p.Moverse())
}

func main() {
    var animal Animal = NewPerro()
    animal.Mostrar()
}