using System;

namespace Interfaz.CSharp
{
    public interface IExportable
    {
        string Exportar();
        string Formato();
        bool ValidarDatos();
    }

    public class Documento : IExportable
    {
        public string Titulo { get; set; }
        public string Contenido { get; set; }
        public string FormatoDoc { get; set; }
        public string Autor { get; set; }

        // Constructor 1: Solo título y contenido
        public Documento(string titulo, string contenido)
        {
            Titulo = titulo;
            Contenido = contenido;
            FormatoDoc = "TXT";
            Autor = "Anónimo";
        }

        // Constructor 2: Todos los parámetros
        public Documento(string titulo, string contenido, string formato, string autor)
        {
            Titulo = titulo;
            Contenido = contenido;
            FormatoDoc = formato;
            Autor = autor;
        }

        public string Exportar()
        {
            return $"Exportando documento '{Titulo}' en formato {FormatoDoc}";
        }

        public string Formato()
        {
            return FormatoDoc;
        }

        public bool ValidarDatos()
        {
            return !string.IsNullOrEmpty(Titulo) && 
                   !string.IsNullOrEmpty(Contenido) && 
                   !string.IsNullOrEmpty(FormatoDoc);
        }

        public void Mostrar()
        {
            Console.WriteLine($"Documento: {Titulo}");
            Console.WriteLine($"Autor: {Autor}, Formato: {FormatoDoc}");
            string contenidoPreview = Contenido.Length > 20 ? 
                Contenido.Substring(0, 20) + "..." : Contenido;
            Console.WriteLine($"Contenido: {contenidoPreview}");
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            IExportable doc1 = new Documento("Reporte", "Este es el contenido del reporte...");
            IExportable doc2 = new Documento(
                "Tesis", 
                "Contenido completo de la tesis...", 
                "PDF", 
                "María González"
            );

            doc1.Mostrar();
            Console.WriteLine(doc1.Exportar());
            Console.WriteLine();

            doc2.Mostrar();
            Console.WriteLine(doc2.Exportar());
        }
    }
}