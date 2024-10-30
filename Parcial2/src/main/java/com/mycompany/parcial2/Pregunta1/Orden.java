/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial2.Pregunta1;

/**
 *
 * @author santi
 */
public class Orden {
    
    public double calcularTotalConImpuesto(double precio, double descuento){
        double impuesto = 0;
        if(descuento == 0){
            impuesto = precio * 0.1;
            return precio + impuesto;
        }else{
            double precioDesc = precio - descuento;
            impuesto = precioDesc * 0.1;
            return precioDesc + impuesto;
        }
    }
    
}
