/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10;

/**
 * La clase CalculadorCosto proporciona un método para calcular el costo de un envío.
 * Esta clase actúa como un facilitador que utiliza el método Envio#calcularCosto() 
 * de la clase Envio y sus subclases para obtener el costo del envío.
 * Esta clase es útil para encapsular la lógica de cálculo de costos, permitiendo que 
 * diferentes tipos de envíos sean procesados de manera uniforme.
 * @author Santiago Jimenez
 */
public class CalculadorCosto {
    
    /**
     * Calcula el costo del envío utilizando el método calcularCosto() 
     * de la instancia de Envio proporcionada.
     * @param envio la instancia de Envio para la cual se calculará el costo
     * @return el costo calculado del envío
     */
    public double calcularCosto(Envio envio){
        return envio.calcularCosto();
    }
}
