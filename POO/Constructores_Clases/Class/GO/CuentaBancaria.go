package main

import "fmt"

type CuentaBancaria struct {
    numeroCuenta string
    saldo        float64
    activa       bool
}

// Constructor sin parámetros
func NewCuentaBancaria() *CuentaBancaria {
    return &CuentaBancaria{
        numeroCuenta: "000000",
        saldo:        0.0,
        activa:       false,
    }
}

func (c *CuentaBancaria) Mostrar() {
    fmt.Printf("Cuenta: %s, Saldo: $%.2f, Activa: %t\n", 
        c.numeroCuenta, c.saldo, c.activa)
}

func main() {
    cuenta := NewCuentaBancaria()
    cuenta.Mostrar()
}