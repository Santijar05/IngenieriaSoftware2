/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerocp2;

/**
 *
 * @author santi
 */
public class CalculoImpuestoIva extends Calculo{
    
    public static double IVA = 0.19;

    public CalculoImpuestoIva(String producto, int cantidad) {
        super(producto, cantidad);
    }
    
    @Override
    public double calcularImpuesto() {
        return (2000 * this.cantidad) * this.IVA;
    }
    
}
