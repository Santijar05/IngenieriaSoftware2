/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller9.YAGNI;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author santi
 */
public class Biblioteca {
    private List<Libro> libros = new ArrayList<>();

    public Biblioteca() {
    }
    
    

    public void agregarLibro(Libro libro) {
        libro.setAñoPublicacion(2024);
        getLibros().add(libro);
        System.out.println("El libro "+libro.getTitulo()+" de "+libro.getAutor()+" fue agregado exitosamente");
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
    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
}
