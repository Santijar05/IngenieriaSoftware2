/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FabricaciónPura;

import java.util.List;

/**
 *
 * @author santi
 */
public class FabricaPedidos {
    
    private static int idPedido = 0;
    
    public static Pedido crearPedido(Cliente cliente, List<Producto> productos) {
        idPedido++;
        return new Pedido(idPedido,cliente, productos);
    }
    
}
