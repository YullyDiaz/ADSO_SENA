using System;

namespace ClaseAbstracta.CSharp
{
    public abstract class Animal
    {
        public string Nombre { get; set; }
        public string Especie { get; set; }

        // Constructor sin parámetros
        protected Animal()
        {
            Nombre = "Sin nombre";
            Especie = "Desconocida";
        }

        // Métodos abstractos
        public abstract string HacerSonido();
        public abstract string Moverse();

        public virtual void Mostrar()
        {
            Console.WriteLine($"{Nombre} - {Especie}");
        }
    }

    public class Perro : Animal
    {
        public Perro() : base()
        {
            Nombre = "Rex";
            Especie = "Perro";
        }

        public override string HacerSonido()
        {
            return "Guau guau!";
        }

        public override string Moverse()
        {
            return "Corriendo en cuatro patas";
        }

        public override void Mostrar()
        {
            base.Mostrar();
            Console.WriteLine($"Sonido: {HacerSonido()}");
            Console.WriteLine($"Movimiento: {Moverse()}");
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Animal perro = new Perro();
            perro.Mostrar();
        }
    }
}
