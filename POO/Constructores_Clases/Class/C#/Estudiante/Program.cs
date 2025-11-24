using System;

namespace ClaseNormal.CSharp
{
    public class Estudiante
    {
        public string Nombre { get; set; }
        public int Edad { get; set; }
        public string Grado { get; set; }
        public double Promedio { get; set; }

        // Constructor 1: Solo nombre y edad
        public Estudiante(string nombre, int edad)
        {
            Nombre = nombre;
            Edad = edad;
            Grado = "No asignado";
            Promedio = 0.0;
        }

        // Constructor 2: Todos los parámetros
        public Estudiante(string nombre, int edad, string grado, double promedio)
        {
            Nombre = nombre;
            Edad = edad;
            Grado = grado;
            Promedio = promedio;
        }

        public void Mostrar()
        {
            Console.WriteLine($"Estudiante: {Nombre}, Edad: {Edad}, Grado: {Grado}, Promedio: {Promedio:F2}");
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Estudiante est1 = new Estudiante("Ana", 20);
            Estudiante est2 = new Estudiante("Carlos", 22, "Ingeniería", 8.5);

            est1.Mostrar();
            est2.Mostrar();
        }
    }
}