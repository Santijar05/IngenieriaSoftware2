/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.parcial2.Pregunta1;

import java.util.ArrayList;

/**
 *
 * @author santi
 */
public class Pregunta1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Librería libreria = new Librería();
        LibroBusqueda l = new LibroBusqueda();
        Libro libro1 = new Libro("h", "pepe", 2500.0, 1982);
        Libro libro2 = new Libro("es", "pepo", 2500.0, 1982);
        Libro libro3 = new Libro("el", "pepe", 2500.0, 1982);
        Libro libro4 = new Libro("en", "pepo", 2500.0, 1982);
        
        libreria.añadirLibro(libro4);
        libreria.añadirLibro(libro3);
        libreria.añadirLibro(libro2);
        libreria.añadirLibro(libro1);
        
        Libro l1 = l.buscarLibroNombre("es", (ArrayList<Libro>) libreria.getLibros());
        
    }
    
}
