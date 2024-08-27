/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerocp2;

/**
 *
 * @author santi
 */
public class Factura {
    
    public double calcularImpuesto(Calculo calculo){
        return calculo.calcularImpuesto() + (2000 * calculo.getCantidad());
    }
    
}
