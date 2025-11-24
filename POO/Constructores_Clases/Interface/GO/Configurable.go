package main

import "fmt"

// Interfaz
type Configurable interface {
    Configurar(parametros map[string]interface{})
    ObtenerConfig() map[string]interface{}
    Validar() bool
    Mostrar()
}

// Implementación
type ConfiguracionApp struct {
    nombre    string
    version   string
    parametros map[string]interface{}
}

// Constructor con parámetros
func NewConfiguracionApp(nombre, version string) *ConfiguracionApp {
    return &ConfiguracionApp{
        nombre:    nombre,
        version:   version,
        parametros: make(map[string]interface{}),
    }
}

// Constructor de copia
func NewConfiguracionAppFrom(other *ConfiguracionApp) *ConfiguracionApp {
    nuevo := &ConfiguracionApp{
        nombre:    other.nombre,
        version:   other.version,
        parametros: make(map[string]interface{}),
    }
    
    for k, v := range other.parametros {
        nuevo.parametros[k] = v
    }
    
    return nuevo
}

func (c *ConfiguracionApp) Configurar(parametros map[string]interface{}) {
    for k, v := range parametros {
        c.parametros[k] = v
    }
}

func (c *ConfiguracionApp) ObtenerConfig() map[string]interface{} {
    return c.parametros
}

func (c *ConfiguracionApp) Validar() bool {
    return c.nombre != "" && c.version != ""
}

func (c *ConfiguracionApp) Mostrar() {
    fmt.Printf("Configuración: %s v%s\n", c.nombre, c.version)
    fmt.Println("Parámetros:")
    for k, v := range c.parametros {
        fmt.Printf("  %s: %v\n", k, v)
    }
}

func main() {
    original := NewConfiguracionApp("MiApp", "1.0")
    original.Configurar(map[string]interface{}{
        "puerto": 8080,
        "debug":  true,
    })
    
    copia := NewConfiguracionAppFrom(original)
    
    var config1 Configurable = original
    var config2 Configurable = copia
    
    config1.Mostrar()
    config2.Mostrar()
}