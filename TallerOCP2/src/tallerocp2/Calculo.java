/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerocp2;

/**
 *
 * @author santi
 */
public abstract class Calculo {
 protected String producto;
 protected int cantidad;

    public Calculo(String producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

   
 
 public abstract double calcularImpuesto();

    /**
     * @return the producto
     */
    public String getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

   


}
