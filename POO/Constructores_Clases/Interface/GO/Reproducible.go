package main

import "fmt"

// Interfaz
type Reproducible interface {
    Reproducir() string
    Pausar() string
    Detener() string
    Info() string
}

// Implementación
type Audio struct {
    titulo  string
    artista string
    duracion int // en segundos
}

// Constructor sin parámetros
func NewAudio() *Audio {
    return &Audio{
        titulo:  "Sin título",
        artista: "Desconocido",
        duracion: 0,
    }
}

func (a *Audio) Reproducir() string {
    return fmt.Sprintf("Reproduciendo: %s - %s", a.titulo, a.artista)
}

func (a *Audio) Pausar() string {
    return "Audio pausado"
}

func (a *Audio) Detener() string {
    return "Audio detenido"
}

func (a *Audio) Info() string {
    minutos := a.duracion / 60
    segundos := a.duracion % 60
    return fmt.Sprintf("%s - %s (%d:%02d)", a.titulo, a.artista, minutos, segundos)
}

func main() {
    var reproducible Reproducible = NewAudio()
    fmt.Println(reproducible.Info())
    fmt.Println(reproducible.Reproducir())
}