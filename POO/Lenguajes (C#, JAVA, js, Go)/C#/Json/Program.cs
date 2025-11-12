using System;
using System.Collections.Generic;
using System.Text.Json;

//Se utilizan atributos como Nombre y Empresa para realizar el ejercicio.
class Json
{
    //Se utilizan modificadores de acceso privados
    private Dictionary<string, object> user;
    private Dictionary<string, object> company;

    // Implementación del constructor para los atributos con parámetros
    public Json(Dictionary<string, object> userData = null, Dictionary<string, object> companyData = null){
        this.user = userData ?? new Dictionary<string, object>{
            { "Nombre ", "Yully Diaz" },
            { "Edad ", 18 },
            { "Email ", "yully@gmail.com" }
        };
        
        this.company = companyData ?? new Dictionary<string, object>{
            { "Nombre ", "Coca cola" },
            { "Empleados ", 100 },
            { "Fundación ", 2020 }
        };
    }

    // En esta sección empleamos el encapsulamiento aplicando get y set a los atributos
    public Dictionary<string, object> GetUser(){
        return this.user;
    }

    public void SetUser(Dictionary<string, object> newUser){
        if (newUser != null){
            this.user = newUser;
        }
        else{
            throw new ArgumentException("El usuario debe ser un objeto válido");
        }
    }

    public Dictionary<string, object> GetCompany(){
        return this.company;
    }

    public void SetCompany(Dictionary<string, object> newCompany){
        if (newCompany != null){
            this.company = newCompany;
        }
        else{
            throw new ArgumentException("La empresa debe ser un objeto válido");
        }
    }

    // En esta parte aplicamos un método con return que combina usuario y empresa en un JSON
    public string CombineJson(){
        var combinedData = new Dictionary<string, object>{
            { "Usuario ", this.user },
            { "Empresa ", this.company },
            { "Duración ", DateTime.UtcNow.ToString("yyyy-MM-dd") }
        };
        
        return JsonSerializer.Serialize(combinedData, new JsonSerializerOptions { WriteIndented = true });
    }

    // Por último implementamos un método void para la ejecución del programa.
    public void DisplayJsonData(){
        Console.WriteLine("DATOS JSON");
        Console.WriteLine("Usuario: " + JsonSerializer.Serialize(this.user, new JsonSerializerOptions { WriteIndented = true }));
        Console.WriteLine("Empresa: " + JsonSerializer.Serialize(this.company, new JsonSerializerOptions { WriteIndented = true }));
    }
}