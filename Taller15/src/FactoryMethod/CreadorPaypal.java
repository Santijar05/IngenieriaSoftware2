/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

/**
 *
 * @author santi
 */
public class CreadorPaypal extends CreadorPago {
    @Override
    public IMetodoPago crearMetodoPago() {
        return new PagoPaypal();
    }
}