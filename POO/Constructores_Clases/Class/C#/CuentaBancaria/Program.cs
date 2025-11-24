using System;

namespace ClaseNormal.CSharp
{
    public class CuentaBancaria
    {
        public string NumeroCuenta { get; set; }
        public double Saldo { get; set; }
        public bool Activa { get; set; }

        // Constructor sin parámetros
        public CuentaBancaria()
        {
            NumeroCuenta = "000000";
            Saldo = 0.0;
            Activa = false;
        }

        public void Mostrar()
        {
            Console.WriteLine($"Cuenta: {NumeroCuenta}, Saldo: ${Saldo:F2}, Activa: {Activa}");
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            CuentaBancaria cuenta = new CuentaBancaria();
            cuenta.Mostrar();
        }
    }
}
