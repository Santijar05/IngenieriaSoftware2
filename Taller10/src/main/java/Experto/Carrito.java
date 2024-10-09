/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Experto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author santi
 */
public class Carrito {
    private List<Libro> libros = new ArrayList<>();

// Método para agregar un libro
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    // Método para eliminar un libro
    public void eliminarLibro(Libro libro) {
        libros.remove(libro);
    }

public double calcularPrecioTotal() {
    double total = 0;
    for (Libro libro : libros) {
        total += libro.getPrecio();
    }
    return total;
}
}