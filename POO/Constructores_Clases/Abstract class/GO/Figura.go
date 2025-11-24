package main

import "fmt"

type Figura interface {
    Area() float64
    Perimetro() float64
    Mostrar()
}

type Cuadrado struct {
    lado float64
}

// Constructor sin parámetros
func NewCuadrado() *Cuadrado {
    return &Cuadrado{
        lado: 1.0,
    }
}

func (c *Cuadrado) Area() float64 {
    return c.lado * c.lado
}

func (c *Cuadrado) Perimetro() float64 {
    return 4 * c.lado
}

func (c *Cuadrado) Mostrar() {
    fmt.Printf("Cuadrado - Lado: %.2f\n", c.lado)
    fmt.Printf("Área: %.2f, Perímetro: %.2f\n", c.Area(), c.Perimetro())
}

func main() {
    var figura Figura = NewCuadrado()
    figura.Mostrar()
}