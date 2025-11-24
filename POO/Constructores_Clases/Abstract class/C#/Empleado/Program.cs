using System;

namespace ClaseAbstracta.CSharp
{
    public abstract class Empleado
    {
        public string Nombre { get; set; }

        public abstract string Trabajar();
        public abstract double CalcularSalario();
        public abstract void Mostrar();
    }

    public class Gerente : Empleado
    {
        public string Departamento { get; set; }
        public double Salario { get; set; }

        // Constructor con parámetros
        public Gerente(string nombre, string departamento, double salario)
        {
            Nombre = nombre;
            Departamento = departamento;
            Salario = salario;
        }

        // Constructor de copia
        public Gerente(Gerente other)
        {
            Nombre = other.Nombre;
            Departamento = other.Departamento;
            Salario = other.Salario;
        }

        public override string Trabajar()
        {
            return $"Gestionando el departamento {Departamento}";
        }

        public override double CalcularSalario()
        {
            return Salario;
        }

        public override void Mostrar()
        {
            Console.WriteLine($"Gerente: {Nombre}");
            Console.WriteLine($"Departamento: {Departamento}, Salario: ${Salario:F2}");
            Console.WriteLine($"Trabajo: {Trabajar()}");
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Gerente original = new Gerente("Carlos", "Ventas", 75000.00);
            Gerente copia = new Gerente(original);

            original.Mostrar();
            copia.Mostrar();
        }
    }
}
