class Producto {
    constructor(id, nombre, precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    // Constructor de copia
    static from(other) {
        return new Producto(other.id, other.nombre, other.precio);
    }

    mostrar() {
        console.log(`ID: ${this.id}, Producto: ${this.nombre}, Precio: $${this.precio.toFixed(2)}`);
    }
}

// Uso
const original = new Producto(1, "Laptop", 1500.00);
const copia = Producto.from(original);

original.mostrar();
copia.mostrar();