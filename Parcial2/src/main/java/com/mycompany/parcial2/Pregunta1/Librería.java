/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial2.Pregunta1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author santi
 */
public class Librería {
    private ArrayList<Libro> libros = new ArrayList<>();

    public Librería() {
    }

    public void añadirLibro(Libro l){
        libros.add(l);
    }
    /**
     * @return the libros
     */
    public List<Libro> getLibros() {
        return libros;
    }

    /**
     * @param libros the libros to set
     */
    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    
}
