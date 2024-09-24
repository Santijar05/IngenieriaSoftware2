/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.taller9.YAGNI;

/**
 *
 * @author santi
 */
public class YAGNI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro l1 = new Libro("Colombia 2 Argentina 1", "Nestor Lorenzo", 0);
        Libro l2 = new Libro("Colombia 5 Argentina 0", "Francico Maturana", 0);
        Biblioteca b = new Biblioteca();
        b.agregarLibro(l1);
        b.agregarLibro(l2);
    }
    
}
