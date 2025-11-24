package main

import "fmt"

// Interfaz
type Autenticable interface {
    Login(usuario, contraseña string) bool
    Logout() string
    EstaAutenticado() bool
    Info() string
}

// Implementación
type Usuario struct {
    username      string
    email         string
    autenticado   bool
}

// Constructor sin parámetros
func NewUsuario() *Usuario {
    return &Usuario{
        username:    "invitado",
        email:       "invitado@ejemplo.com",
        autenticado: false,
    }
}

func (u *Usuario) Login(usuario, contraseña string) bool {
    if usuario == "admin" && contraseña == "1234" {
        u.autenticado = true
        u.username = usuario
        return true
    }
    return false
}

func (u *Usuario) Logout() string {
    u.autenticado = false
    return "Sesión cerrada"
}

func (u *Usuario) EstaAutenticado() bool {
    return u.autenticado
}

func (u *Usuario) Info() string {
    estado := "No autenticado"
    if u.autenticado {
        estado = "Autenticado"
    }
    return fmt.Sprintf("Usuario: %s, Email: %s, Estado: %s", 
        u.username, u.email, estado)
}

func main() {
    var auth Autenticable = NewUsuario()
    fmt.Println(auth.Info())
    
    if auth.Login("admin", "1234") {
        fmt.Println("Login exitoso")
        fmt.Println(auth.Info())
    }
}