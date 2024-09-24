/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8srp;

/**
 *
 * @author santi
 */
public class DescuentoPorcentaje implements Descuento{

    private double procentaje;
    
    @Override
    public double calcularDescuento(Producto p) {
        return (this.getProcentaje()/100) * p.getPrecio();
    }

    /**
     * @return the procentaje
     */
    public double getProcentaje() {
        return procentaje;
    }

    /**
     * @param procentaje the procentaje to set
     */
    public void setProcentaje(double procentaje) {
        this.procentaje = procentaje;
    }


    
}
