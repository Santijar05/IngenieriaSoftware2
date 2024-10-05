/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AltaCohesiónBajoAcoplam;

import java.util.Arrays;

/**
 *
 * @author santi
 */
public class ACBA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "Santiago", "Calle 123");
        Producto prod1 = new Producto(1, "Laptop", 1000.0);
        Producto prod2 = new Producto(2, "Mouse", 20.0);

        Factura factura = new Factura();
        factura.procesarFactura(cliente, Arrays.asList(prod1, prod2));

        double totalConDescuento = factura.calcularPrecioConDescuento(10);
        System.out.println("Total con descuento: " + totalConDescuento);

        GestorProducto crudProducto = new GestorProducto();
        crudProducto.crearProducto(prod1);
        crudProducto.actualizarProducto(prod2);
    }
    
}
