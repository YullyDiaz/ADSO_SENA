using System;

namespace ClaseNormal.CSharp
{
    public class Vehiculo
    {
        public string Marca { get; set; }
        public string Modelo { get; set; }
        public int Año { get; set; }
        public double Precio { get; set; }
        public bool EnStock { get; set; }

        // Constructor con parámetros
        public Vehiculo(string marca, string modelo, int año, double precio, bool enStock)
        {
            Marca = marca;
            Modelo = modelo;
            Año = año;
            Precio = precio;
            EnStock = enStock;
        }

        public void Mostrar()
        {
            string estado = EnStock ? "Disponible" : "No disponible";
            Console.WriteLine($"{Marca} {Modelo} ({Año}) - ${Precio:F2} - {estado}");
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Vehiculo vehiculo = new Vehiculo("Toyota", "Corolla", 2023, 25000.00, true);
            vehiculo.Mostrar();
        }
    }
}