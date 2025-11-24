package main

import "fmt"

type Dispositivo interface {
    Encender() string
    Apagar() string
    Estado() string
    Mostrar()
}

type Computadora struct {
    marca   string
    modelo  string
    encendida bool
    precio  float64
}

// Constructor 1: Solo marca y modelo
func NewComputadora(marca, modelo string) *Computadora {
    return &Computadora{
        marca:    marca,
        modelo:   modelo,
        encendida: false,
        precio:   0.0,
    }
}

// Constructor 2: Todos los parámetros
func NewComputadoraCompleta(marca, modelo string, precio float64, encendida bool) *Computadora {
    return &Computadora{
        marca:    marca,
        modelo:   modelo,
        precio:   precio,
        encendida: encendida,
    }
}

func (c *Computadora) Encender() string {
    c.encendida = true
    return "Computadora encendida"
}

func (c *Computadora) Apagar() string {
    c.encendida = false
    return "Computadora apagada"
}

func (c *Computadora) Estado() string {
    if c.encendida {
        return "Encendida"
    }
    return "Apagada"
}

func (c *Computadora) Mostrar() {
    fmt.Printf("%s %s - $%.2f\n", c.marca, c.modelo, c.precio)
    fmt.Printf("Estado: %s\n", c.Estado())
}

func main() {
    var disp1 Dispositivo = NewComputadora("Dell", "XPS")
    var disp2 Dispositivo = NewComputadoraCompleta("Apple", "MacBook", 2000.00, true)
    
    disp1.Mostrar()
    disp2.Mostrar()
}