/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Experto;

/**
 *
 * @author santi
 */
public class TallerExperto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", "123456789", 20.0);
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", "987654321", 15.0);
        Libro libro3 = new Libro("1984", "George Orwell", "111213141", 10.0);
        
        Carrito carrito = new Carrito();

        carrito.agregarLibro(libro1);
        carrito.agregarLibro(libro2);
        carrito.agregarLibro(libro2); 
        carrito.agregarLibro(libro3);

        System.out.println("Precio total: $" + carrito.calcularPrecioTotal());

        System.out.println(carrito);

        carrito.eliminarLibro(libro2); 
        
        System.out.println("Precio total después de eliminar un libro: " + carrito.calcularPrecioTotal());

        System.out.println(carrito);
    }
    
}
