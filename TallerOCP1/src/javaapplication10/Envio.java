/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10;

/**
 * La clase Envio es una representación abstracta de un servicio de envío o entrega.
 * Proporciona los atributos y métodos fundamentales necesarios para calcular los costos de envío
 * basados en el peso, la distancia, el origen y el destino. Esta clase sirve como base para 
 * tipos específicos de métodos de envío que extenderán su funcionalidad.
 * @author Santiago Jimenez
 */
public abstract class Envio {
    protected double peso;       // Peso del paquete
    protected double distancia;  // Distancia del envío
    protected String origen;     // Origen del envío
    protected String destino;    // Destino del envío

    /**
     * Construye una instancia de Envio con el peso, la distancia, el origen y el destino especificados.
     * @param peso     el peso del paquete
     * @param distancia la distancia del envío
     * @param origen   la ubicación de origen del envío
     * @param destino  la ubicación de destino del envío
     */
    public Envio(double peso, double distancia, String origen, String destino) {
        this.peso = peso;
        this.distancia = distancia;
        this.origen = origen;
        this.destino = destino;
    }
    
    /**
     * Calcula el costo del envío. Este método debe ser implementado por las subclases.
     * @return el costo calculado del envío
     */
    public abstract double calcularCosto();

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the distancia
     */
    public double getDistancia() {
        return distancia;
    }

    /**
     * @param distancia the distancia to set
     */
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    /**
     * @return the origen
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * @param origen the origen to set
     */
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    
}
