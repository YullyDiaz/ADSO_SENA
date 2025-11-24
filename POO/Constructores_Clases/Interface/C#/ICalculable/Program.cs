using System;

namespace Interfaz.CSharp
{
    public interface ICalculable
    {
        double Sumar(double a, double b);
        double Restar(double a, double b);
        double Multiplicar(double a, double b);
        double Dividir(double a, double b);
        string Tipo();
    }

    public class CalculadoraCientifica : ICalculable
    {
        public string Marca { get; set; }
        public string Modelo { get; set; }
        public int Precision { get; set; }

        // Constructor con parámetros
        public CalculadoraCientifica(string marca, string modelo, int precision)
        {
            Marca = marca;
            Modelo = modelo;
            Precision = precision;
        }

        public double Sumar(double a, double b)
        {
            return a + b;
        }

        public double Restar(double a, double b)
        {
            return a - b;
        }

        public double Multiplicar(double a, double b)
        {
            return a * b;
        }

        public double Dividir(double a, double b)
        {
            if (b == 0)
                throw new DivideByZeroException("No se puede dividir por cero");
            return a / b;
        }

        public string Tipo()
        {
            return "Científica";
        }

        public void Mostrar()
        {
            Console.WriteLine($"Calculadora {Marca} {Modelo}");
            Console.WriteLine($"Precisión: {Precision} dígitos, Tipo: {Tipo()}");
        }

        public void ProbarOperaciones()
        {
            Console.WriteLine($"5 + 3 = {Sumar(5, 3)}");
            Console.WriteLine($"10 - 4 = {Restar(10, 4)}");
            Console.WriteLine($"6 * 7 = {Multiplicar(6, 7)}");
            try
            {
                Console.WriteLine($"15 / 3 = {Dividir(15, 3)}");
            }
            catch (Exception ex)
            {
                Console.WriteLine($"Error: {ex.Message}");
            }
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            ICalculable calc = new CalculadoraCientifica("Casio", "FX-991EX", 12);
            
            if (calc is CalculadoraCientifica calculadora)
            {
                calculadora.Mostrar();
                calculadora.ProbarOperaciones();
            }
        }
    }
}
