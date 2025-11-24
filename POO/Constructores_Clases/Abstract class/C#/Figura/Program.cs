using System;

namespace ClaseAbstracta.CSharp
{
    public abstract class Figura
    {
        public string Color { get; set; }

        protected Figura()
        {
            Color = "negro";
        }

        public abstract double CalcularArea();
        public abstract double CalcularPerimetro();

        public virtual void Mostrar()
        {
            Console.WriteLine($"Color: {Color}");
        }
    }

    public class Cuadrado : Figura
    {
        public double Lado { get; set; }

        public Cuadrado() : base()
        {
            Lado = 1.0;
        }

        public override double CalcularArea()
        {
            return Lado * Lado;
        }

        public override double CalcularPerimetro()
        {
            return 4 * Lado;
        }

        public override void Mostrar()
        {
            base.Mostrar();
            Console.WriteLine($"Cuadrado - Lado: {Lado}");
            Console.WriteLine($"Área: {CalcularArea():F2}");
            Console.WriteLine($"Perímetro: {CalcularPerimetro():F2}");
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Figura cuadrado = new Cuadrado();
            cuadrado.Mostrar();
        }
    }
}
