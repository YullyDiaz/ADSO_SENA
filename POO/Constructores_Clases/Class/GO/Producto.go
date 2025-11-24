package main

import "fmt"

type Producto struct {
    id     int
    nombre string
    precio float64
}

// Constructor con parámetros
func NewProducto(id int, nombre string, precio float64) *Producto {
    return &Producto{
        id:     id,
        nombre: nombre,
        precio: precio,
    }
}

// Constructor de copia
func NewProductoFrom(other *Producto) *Producto {
    return &Producto{
        id:     other.id,
        nombre: other.nombre,
        precio: other.precio,
    }
}

func (p *Producto) Mostrar() {
    fmt.Printf("ID: %d, Producto: %s, Precio: $%.2f\n", 
        p.id, p.nombre, p.precio)
}

func main() {
    original := NewProducto(1, "Laptop", 1500.00)
    copia := NewProductoFrom(original)
    
    original.Mostrar()
    copia.Mostrar()
}