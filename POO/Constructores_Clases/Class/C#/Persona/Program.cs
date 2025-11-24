using System;

namespace ClaseNormal.CSharp
{
    public class Persona
    {
        public string Nombre { get; set; }
        public int Edad { get; set; }

        // Constructor sin parámetros
        public Persona()
        {
            Nombre = "Desconocido";
            Edad = 0;
        }

        public void Mostrar()
        {
            Console.WriteLine($"Nombre: {Nombre}, Edad: {Edad}");
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Persona persona = new Persona();
            persona.Mostrar();
        }
    }
}
