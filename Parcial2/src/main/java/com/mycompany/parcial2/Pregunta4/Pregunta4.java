/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.parcial2.Pregunta4;

/**
 *
 * @author santi
 */
public class Pregunta4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ICalcularImpuesto calcCol = new calcularImpuestoColombia();
        ICalcularImpuesto calcEEUU = new calcularImpuestoEEUU();
        ICalcularImpuesto calcFrancia = new calcualrImpuestoFrancia();
        
        CalculadorImpuesto c= new CalculadorImpuesto(calcFrancia);
        c.calcularImpuesto();
        
                
    }
    
}
