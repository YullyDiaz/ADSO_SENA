package main

import "fmt"

type Empleado interface {
    Trabajar() string
    CalcularSalario() float64
    Mostrar()
}

type Desarrollador struct {
    nombre   string
    lenguaje string
    salario  float64
}

// Constructor con parámetros
func NewDesarrollador(nombre, lenguaje string, salario float64) *Desarrollador {
    return &Desarrollador{
        nombre:   nombre,
        lenguaje: lenguaje,
        salario:  salario,
    }
}

// Constructor de copia
func NewDesarrolladorFrom(other *Desarrollador) *Desarrollador {
    return &Desarrollador{
        nombre:   other.nombre,
        lenguaje: other.lenguaje,
        salario:  other.salario,
    }
}

func (d *Desarrollador) Trabajar() string {
    return fmt.Sprintf("Programando en %s", d.lenguaje)
}

func (d *Desarrollador) CalcularSalario() float64 {
    return d.salario
}

func (d *Desarrollador) Mostrar() {
    fmt.Printf("Desarrollador: %s\n", d.nombre)
    fmt.Printf("Lenguaje: %s, Salario: $%.2f\n", d.lenguaje, d.salario)
    fmt.Printf("Trabajo: %s\n", d.Trabajar())
}

func main() {
    original := NewDesarrollador("Ana", "Go", 50000.00)
    copia := NewDesarrolladorFrom(original)
    
    var emp1 Empleado = original
    var emp2 Empleado = copia
    
    emp1.Mostrar()
    emp2.Mostrar()
}