/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package srp2;

import java.time.LocalDateTime;
import java.util.LinkedList;

/**
 *
 * @author Santiago Jimenez
 */
public class Factura {
    
    private String id;
    private LocalDateTime fecha = LocalDateTime.now();
    private Cliente cliente;
    private LinkedList<String> productos;
    private double total;

    public Factura() {
    }

    public Factura(String id, Cliente cliente, LinkedList<String> productos, double total) {
        this.id = id;
        this.cliente = cliente;
        this.productos = productos;
        this.total = total;
        
        if (cliente != null) {
            cliente.agregarFactura(this);
        }
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the fecha
     */
    public LocalDateTime getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the productos
     */
    public LinkedList<String> getProductos() {
        return productos;
    }

    /**
     * @param productos the productos to set
     */
    public void setProductos(LinkedList<String> productos) {
        this.productos = productos;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }
    
    
    
}
