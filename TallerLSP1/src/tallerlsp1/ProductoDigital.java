/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerlsp1;

/**
 *
 * @author santi
 */
public class ProductoDigital extends Producto {
    
    private double tamañoArchivo; // Tamaño del archivo en GB

    public ProductoDigital(double tamañoArchivo, String nombre, int cantidad, double precio) {
        super(nombre, cantidad, precio);
        this.tamañoArchivo = tamañoArchivo;
    }

    @Override
    public double calcularCosto() {
        return this.cantidad * this.precio;
    }
    
    
    
    
}
