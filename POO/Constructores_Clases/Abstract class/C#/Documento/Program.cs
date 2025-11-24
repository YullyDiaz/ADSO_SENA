using System;

namespace ClaseAbstracta.CSharp
{
    public abstract class Documento
    {
        public string Titulo { get; set; }
        public string Autor { get; set; }

        public abstract void Imprimir();
        public abstract void Guardar();
        public abstract void Mostrar();
    }

    public class Reporte : Documento
    {
        public string Contenido { get; set; }
        public DateTime Fecha { get; set; }
        public bool EsConfidencial { get; set; }

        // Constructor con parámetros
        public Reporte(string titulo, string autor, string contenido, DateTime fecha, bool esConfidencial)
        {
            Titulo = titulo;
            Autor = autor;
            Contenido = contenido;
            Fecha = fecha;
            EsConfidencial = esConfidencial;
        }

        public override void Imprimir()
        {
            string confidencial = EsConfidencial ? "CONFIDENCIAL" : "PÚBLICO";
            Console.WriteLine($"Imprimiendo reporte: {Titulo} ({confidencial})");
        }

        public override void Guardar()
        {
            Console.WriteLine($"Guardando reporte: {Titulo}");
        }

        public override void Mostrar()
        {
            string confidencial = EsConfidencial ? "Sí" : "No";
            Console.WriteLine($"Reporte: {Titulo}");
            Console.WriteLine($"Autor: {Autor}, Fecha: {Fecha:dd/MM/yyyy}");
            Console.WriteLine($"Confidencial: {confidencial}");
            Console.WriteLine($"Contenido: {Contenido.Substring(0, Math.Min(50, Contenido.Length))}...");
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Documento reporte = new Reporte(
                "Reporte Trimestral",
                "Ana García",
                "Este es el contenido completo del reporte trimestral que detalla...",
                new DateTime(2024, 1, 15),
                true
            );

            reporte.Mostrar();
            reporte.Guardar();
            reporte.Imprimir();
        }
    }
}
