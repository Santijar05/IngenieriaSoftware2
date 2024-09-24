/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8srp;

/**
 *
 * @author santi
 */
public class DescuentoFijo implements Descuento{
    
    private double valor;

    @Override
    public double calcularDescuento(Producto p) {
        return this.getValor() * p.getPrecio();
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
