/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10;

/**
 *
 * @author santi
 */
public class EnvioEstandar extends Envio{

    public EnvioEstandar(double peso, double distancia, String origen, String destino) {
        super(peso, distancia, origen, destino);
    }

    @Override
    public double calcularCosto() {
        return this.peso * 0.2 + this.distancia * 0.01;
    }


}
