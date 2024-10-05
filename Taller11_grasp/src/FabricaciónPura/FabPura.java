/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FabricaciónPura;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author santi
 */
public class FabPura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto producto1 = new Producto("Laptop", 1200.0, 1);
        Producto producto2 = new Producto("Mouse", 25.0, 2);

        Cliente cliente = new Cliente("Santiago", "Calle 123, Manizales");

        List<Producto> listaProductos = Arrays.asList(producto1, producto2);
        Pedido pedido = FabricaPedidos.crearPedido(cliente, listaProductos);
        
        pedido.mostrarDetallesPedido();

    }
    
}
