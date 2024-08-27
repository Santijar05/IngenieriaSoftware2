/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerocp2;

/**
 *
 * @author santi
 */
public class CalculoImpuestoRetelva extends Calculo {
    
    public static double RETEIVA = 0.5;

    public CalculoImpuestoRetelva(String producto, int cantidad) {
        super(producto, cantidad);
    }
    
    @Override
    public double calcularImpuesto() {
        double iva = 2000 * cantidad * 0.19;
        
        return iva * RETEIVA;
    }
    
}

