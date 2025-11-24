package main

import "fmt"

// Interfaz
type Calculable interface {
    Sumar(a, b float64) float64
    Restar(a, b float64) float64
    Multiplicar(a, b float64) float64
    Dividir(a, b float64) (float64, error)
    Tipo() string
}

// Implementación
type CalculadoraCientifica struct {
    marca   string
    modelo  string
    precision int
}

// Constructor con parámetros
func NewCalculadoraCientifica(marca, modelo string, precision int) *CalculadoraCientifica {
    return &CalculadoraCientifica{
        marca:     marca,
        modelo:    modelo,
        precision: precision,
    }
}

func (c *CalculadoraCientifica) Sumar(a, b float64) float64 {
    return a + b
}

func (c *CalculadoraCientifica) Restar(a, b float64) float64 {
    return a - b
}

func (c *CalculadoraCientifica) Multiplicar(a, b float64) float64 {
    return a * b
}

func (c *CalculadoraCientifica) Dividir(a, b float64) (float64, error) {
    if b == 0 {
        return 0, fmt.Errorf("división por cero")
    }
    return a / b, nil
}

func (c *CalculadoraCientifica) Tipo() string {
    return "Científica"
}

func (c *CalculadoraCientifica) Mostrar() {
    fmt.Printf("Calculadora %s %s\n", c.marca, c.modelo)
    fmt.Printf("Precisión: %d dígitos, Tipo: %s\n", c.precision, c.Tipo())
}

func main() {
    var calc Calculable = NewCalculadoraCientifica("Casio", "FX-991EX", 12)
    
    if calculadora, ok := calc.(*CalculadoraCientifica); ok {
        calculadora.Mostrar()
    }
    
    fmt.Printf("5 + 3 = %.2f\n", calc.Sumar(5, 3))
    fmt.Printf("10 - 4 = %.2f\n", calc.Restar(10, 4))
}