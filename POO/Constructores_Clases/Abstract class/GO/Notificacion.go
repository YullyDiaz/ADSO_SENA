package main

import "fmt"

type Notificacion interface {
    Enviar() string
    Prioridad() string
    Mostrar()
}

type Email struct {
    destinatario string
    asunto       string
    mensaje      string
    urgente      bool
}

// Constructor con parámetros
func NewEmail(destinatario, asunto, mensaje string, urgente bool) *Email {
    return &Email{
        destinatario: destinatario,
        asunto:       asunto,
        mensaje:      mensaje,
        urgente:      urgente,
    }
}

func (e *Email) Enviar() string {
    return fmt.Sprintf("Email enviado a: %s", e.destinatario)
}

func (e *Email) Prioridad() string {
    if e.urgente {
        return "ALTA"
    }
    return "NORMAL"
}

func (e *Email) Mostrar() {
    fmt.Printf("Email para: %s\n", e.destinatario)
    fmt.Printf("Asunto: %s, Prioridad: %s\n", e.asunto, e.Prioridad())
    fmt.Printf("Mensaje: %s\n", e.mensaje)
}

func main() {
    var notif Notificacion = NewEmail(
        "cliente@empresa.com", 
        "Importante: Reunión", 
        "Tenemos una reunión mañana a las 10:00 AM", 
        true,
    )
    notif.Mostrar()
}