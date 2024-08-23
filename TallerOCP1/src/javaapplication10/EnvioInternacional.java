/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10;

/**
 *
 * @author santi
 */
public class EnvioInternacional extends Envio{

    public EnvioInternacional(double peso, double distancia, String origen, String destino) {
        super(peso, distancia, origen, destino);
    }

    @Override
    public double calcularCosto() {
        return this.peso * 0.8 + this.distancia * 0.08;
    }

}
