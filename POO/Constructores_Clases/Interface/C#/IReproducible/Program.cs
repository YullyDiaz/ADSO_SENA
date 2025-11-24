using System;

namespace Interfaz.CSharp
{
    public interface IReproducible
    {
        string Reproducir();
        string Pausar();
        string Detener();
        string Info();
    }

    public class Audio : IReproducible
    {
        public string Titulo { get; set; }
        public string Artista { get; set; }
        public int Duracion { get; set; }
        private bool reproduciendo;

        // Constructor sin parámetros
        public Audio()
        {
            Titulo = "Sin título";
            Artista = "Desconocido";
            Duracion = 0;
            reproduciendo = false;
        }

        public string Reproducir()
        {
            reproduciendo = true;
            return $"Reproduciendo: {Titulo} - {Artista}";
        }

        public string Pausar()
        {
            reproduciendo = false;
            return "Audio pausado";
        }

        public string Detener()
        {
            reproduciendo = false;
            return "Audio detenido";
        }

        public string Info()
        {
            int minutos = Duracion / 60;
            int segundos = Duracion % 60;
            string estado = reproduciendo ? "Reproduciendo" : "Detenido";
            return $"{Titulo} - {Artista} ({minutos}:{segundos:D2}) - {estado}";
        }

        public void Mostrar()
        {
            Console.WriteLine(Info());
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            IReproducible audio = new Audio();
            audio.Mostrar();
            Console.WriteLine(audio.Reproducir());
            audio.Mostrar();
        }
    }
}