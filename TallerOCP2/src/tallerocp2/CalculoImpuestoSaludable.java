/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerocp2;

/**
 *
 * @author santi
 */
public class CalculoImpuestoSaludable extends Calculo{

    
        public static double SALUDABLE = 0.05;

    public CalculoImpuestoSaludable(String producto, int cantidad) {
        super(producto, cantidad);
    }
    
    @Override
    public double calcularImpuesto() {
        return (2000 * this.cantidad) * this.SALUDABLE;
    }
    
}

