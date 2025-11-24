package main

import "fmt"

type Vehiculo struct {
    marca      string
    modelo     string
    año        int
    precio     float64
    enStock    bool
}

// Constructor con parámetros
func NewVehiculo(marca, modelo string, año int, precio float64, enStock bool) *Vehiculo {
    return &Vehiculo{
        marca:   marca,
        modelo:  modelo,
        año:     año,
        precio:  precio,
        enStock: enStock,
    }
}

func (v *Vehiculo) Mostrar() {
    estado := "No disponible"
    if v.enStock {
        estado = "Disponible"
    }
    fmt.Printf("%s %s (%d) - $%.2f - %s\n", 
        v.marca, v.modelo, v.año, v.precio, estado)
}

func main() {
    vehiculo := NewVehiculo("Toyota", "Corolla", 2023, 25000.00, true)
    vehiculo.Mostrar()
}