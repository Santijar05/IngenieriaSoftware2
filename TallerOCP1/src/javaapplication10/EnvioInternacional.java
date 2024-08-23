/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10;

/**
 * La clase EnvioInternacional es una implementación concreta de la clase abstracta Envio.
 * Representa un tipo de envío internacional, donde el costo se calcula en función del peso y la distancia.
 * @author Santiago Jimenez
 */
public class EnvioInternacional extends Envio{

    /**
     * Construye una instancia de EnvioInternacional con el peso, la distancia, el origen y el destino especificados.
     *
     * @param peso     el peso del paquete
     * @param distancia la distancia del envío
     * @param origen   la ubicación de origen del envío
     * @param destino  la ubicación de destino del envío
     */
    public EnvioInternacional(double peso, double distancia, String origen, String destino) {
        super(peso, distancia, origen, destino);
    }

    /**
     * 
     * Calcula el costo del envío internacional.
     *
     * @return el costo calculado del envío estándar
     */
    @Override
    public double calcularCosto() {
        return this.peso * 0.8 + this.distancia * 0.08;
    }

}
