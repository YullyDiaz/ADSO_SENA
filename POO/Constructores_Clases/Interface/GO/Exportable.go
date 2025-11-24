package main

import "fmt"

// Interfaz
type Exportable interface {
    Exportar() string
    Formato() string
    ValidarDatos() bool
    Mostrar()
}

// Implementación
type Documento struct {
    titulo     string
    contenido  string
    formato    string
    autor      string
}

// Constructor 1: Solo título y contenido
func NewDocumento(titulo, contenido string) *Documento {
    return &Documento{
        titulo:    titulo,
        contenido: contenido,
        formato:   "TXT",
        autor:     "Anónimo",
    }
}

// Constructor 2: Todos los parámetros
func NewDocumentoCompleto(titulo, contenido, formato, autor string) *Documento {
    return &Documento{
        titulo:    titulo,
        contenido: contenido,
        formato:   formato,
        autor:     autor,
    }
}

func (d *Documento) Exportar() string {
    return fmt.Sprintf("Exportando documento '%s' en formato %s", d.titulo, d.formato)
}

func (d *Documento) Formato() string {
    return d.formato
}

func (d *Documento) ValidarDatos() bool {
    return d.titulo != "" && d.contenido != "" && d.formato != ""
}

func (d *Documento) Mostrar() {
    fmt.Printf("Documento: %s\n", d.titulo)
    fmt.Printf("Autor: %s, Formato: %s\n", d.autor, d.formato)
    fmt.Printf("Contenido: %s\n", d.contenido[:min(20, len(d.contenido))] + "...")
}

func min(a, b int) int {
    if a < b {
        return a
    }
    return b
}

func main() {
    var exp1 Exportable = NewDocumento("Reporte", "Este es el contenido del reporte...")
    var exp2 Exportable = NewDocumentoComple