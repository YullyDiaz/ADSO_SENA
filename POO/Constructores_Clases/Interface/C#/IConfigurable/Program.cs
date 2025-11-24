using System;
using System.Collections.Generic;

namespace Interfaz.CSharp
{
    public interface IConfigurable
    {
        void Configurar(Dictionary<string, object> parametros);
        Dictionary<string, object> ObtenerConfig();
        bool Validar();
    }

    public class ConfiguracionApp : IConfigurable
    {
        public string Nombre { get; set; }
        public string Version { get; set; }
        public Dictionary<string, object> Parametros { get; set; }

        // Constructor con parámetros
        public ConfiguracionApp(string nombre, string version)
        {
            Nombre = nombre;
            Version = version;
            Parametros = new Dictionary<string, object>();
        }

        // Constructor de copia
        public ConfiguracionApp(ConfiguracionApp other)
        {
            Nombre = other.Nombre;
            Version = other.Version;
            Parametros = new Dictionary<string, object>(other.Parametros);
        }

        public void Configurar(Dictionary<string, object> parametros)
        {
            foreach (var param in parametros)
            {
                Parametros[param.Key] = param.Value;
            }
        }

        public Dictionary<string, object> ObtenerConfig()
        {
            return Parametros;
        }

        public bool Validar()
        {
            return !string.IsNullOrEmpty(Nombre) && !string.IsNullOrEmpty(Version);
        }

        public void Mostrar()
        {
            Console.WriteLine($"Configuración: {Nombre} v{Version}");
            Console.WriteLine("Parámetros:");
            foreach (var param in Parametros)
            {
                Console.WriteLine($"  {param.Key}: {param.Value}");
            }
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            ConfiguracionApp original = new ConfiguracionApp("MiApp", "1.0");
            original.Configurar(new Dictionary<string, object>
            {
                ["puerto"] = 8080,
                ["debug"] = true,
                ["timeout"] = 30
            });

            ConfiguracionApp copia = new ConfiguracionApp(original);

            IConfigurable config1 = original;
            IConfigurable config2 = copia;

            original.Mostrar();
            copia.Mostrar();
        }
    }
}