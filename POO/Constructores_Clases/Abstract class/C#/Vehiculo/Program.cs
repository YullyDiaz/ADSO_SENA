using System;

namespace ClaseAbstracta.CSharp
{
    public abstract class Vehiculo
    {
        public string Marca { get; set; }
        public string Modelo { get; set; }

        public abstract void Encender();
        public abstract void Apagar();
        public abstract void Mostrar();
    }

    public class Automovil : Vehiculo
    {
        public int Año { get; set; }
        public double Precio { get; set; }
        public bool Encendido { get; set; }

        // Constructor 1: Solo marca y modelo
        public Automovil(string marca, string modelo)
        {
            Marca = marca;
            Modelo = modelo;
            Año = DateTime.Now.Year;
            Precio = 0.0;
            Encendido = false;
        }

        // Constructor 2: Todos los parámetros
        public Automovil(string marca, string modelo, int año, double precio, bool encendido)
        {
            Marca = marca;
            Modelo = modelo;
            Año = año;
            Precio = precio;
            Encendido = encendido;
        }

        public override void Encender()
        {
            Encendido = true;
            Console.WriteLine("Automóvil encendido");
        }

        public override void Apagar()
        {
            Encendido = false;
            Console.WriteLine("Automóvil apagado");
        }

        public override void Mostrar()
        {
            string estado = Encendido ? "Encendido" : "Apagado";
            Console.WriteLine($"{Marca} {Modelo} ({Año}) - ${Precio:F2}");
            Console.WriteLine($"Estado: {estado}");
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Vehiculo auto1 = new Automovil("Toyota", "Corolla");
            Vehiculo auto2 = new Automovil("Honda", "Civic", 2023, 25000.00, false);

            auto1.Mostrar();
            auto2.Mostrar();

            auto2.Encender();
            auto2.Mostrar();
        }
    }
}