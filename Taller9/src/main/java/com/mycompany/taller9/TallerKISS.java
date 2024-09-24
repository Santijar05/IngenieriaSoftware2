/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.taller9;

import javax.swing.JOptionPane;

/**
 *
 * @author santi
 */
public class TallerKISS {
    
    
    public String invertirCadena(String cadena){
        StringBuilder sb = new StringBuilder(cadena);
        return sb.reverse().toString();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = JOptionPane.showInputDialog("Ingrese una cadena: ");
        
        TallerKISS main = new TallerKISS();
        System.out.println("La palabra "+cadena+" invertida sería: "+main.invertirCadena(cadena));
    }
    
}
