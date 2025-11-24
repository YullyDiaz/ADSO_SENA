using System;

namespace Interfaz.CSharp
{
    public interface IAutenticable
    {
        bool Login(string usuario, string contraseña);
        string Logout();
        bool EstaAutenticado();
        string Info();
    }

    public class Usuario : IAutenticable
    {
        public string Username { get; set; }
        public string Email { get; set; }
        private bool autenticado;

        // Constructor sin parámetros
        public Usuario()
        {
            Username = "invitado";
            Email = "invitado@ejemplo.com";
            autenticado = false;
        }

        public bool Login(string usuario, string contraseña)
        {
            if (usuario == "admin" && contraseña == "1234")
            {
                autenticado = true;
                Username = usuario;
                return true;
            }
            return false;
        }

        public string Logout()
        {
            autenticado = false;
            return "Sesión cerrada";
        }

        public bool EstaAutenticado()
        {
            return autenticado;
        }

        public string Info()
        {
            string estado = autenticado ? "Autenticado" : "No autenticado";
            return $"Usuario: {Username}, Email: {Email}, Estado: {estado}";
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
            IAutenticable usuario = new Usuario();
            usuario.Mostrar();

            if (usuario.Login("admin", "1234"))
            {
                Console.WriteLine("Login exitoso");
                usuario.Mostrar();
            }
        }
    }
}
