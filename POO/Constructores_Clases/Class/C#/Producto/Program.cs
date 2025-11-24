using System;

namespace ClaseNormal.CSharp
{
    public class Producto
    {
        public int Id { get; set; }
        public string Nombre { get; set; }
        public double Precio { get; set; }

        // Constructor con parámetros
        public Producto(int id, string nombre, double precio)
        {
            Id = id;
            Nombre = nombre;
            Precio = precio;
        }

        // Constructor de copia
        public Producto(Producto other)
        {
            Id = other.Id;
            Nombre = other.Nombre;
            Precio = other.Precio;
        }

        public void Mostrar()
        {
            Console.WriteLine($"ID: {Id}, Producto: {Nombre}, Precio: ${Precio:F2}");
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Producto original = new Producto(1, "Laptop", 1500.00);
            Producto copia = new Producto(original);

            original.Mostrar();
            copia.Mostrar();
        }
    }
}
