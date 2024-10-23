/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

/**
 *
 * @author santi
 */
public class PagoTarjeta implements IMetodoPago{

    @Override
    public void procesarPago(double cantidad) {
        System.out.println("Pago de $" + cantidad + " realizado con Tarjeta.");
    }
    
}
