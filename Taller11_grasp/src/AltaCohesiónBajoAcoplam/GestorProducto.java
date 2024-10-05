/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AltaCohesiónBajoAcoplam;

/**
 *
 * @author santi
 */
public class GestorProducto {
    
    public void crearProducto(Producto producto) {
        System.out.println("Producto creado: " + producto.getNombreProducto());
    }

    public Producto leerProducto(int idProducto) {
        return new Producto(idProducto, "ProductoX", 50.0); 
    }

    public void actualizarProducto(Producto producto) {
        System.out.println("Producto actualizado: " + producto.getNombreProducto());
    }

    public void eliminarProducto(int idProducto) {
        System.out.println("Producto eliminado con ID: " + idProducto);
    }
}

