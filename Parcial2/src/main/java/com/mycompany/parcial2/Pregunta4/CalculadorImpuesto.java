/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial2.Pregunta4;

/**
 *
 * @author santi
 */
public class CalculadorImpuesto {
    private ICalcularImpuesto calcularimpuesto;

    public CalculadorImpuesto(ICalcularImpuesto calcularimpuesto) {
        this.calcularimpuesto = calcularimpuesto;
    }
    
    public void calcularImpuesto(){
        calcularimpuesto.calcularImpuesto();
    }
    
}
