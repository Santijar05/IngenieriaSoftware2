/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial2.Pregunta1;

import java.util.ArrayList;

/**
 *
 * @author santi
 */
public class LibroBusqueda {
    
    public Libro buscarLibroNombre(String nombre, ArrayList<Libro> libros ){
        Libro libroBuscado = new Libro();
        for (Libro libro : libros) {
            if(libro.getTitulo().equals(nombre)){
                libroBuscado = libro;
            }
        }
        return libroBuscado;
    }
    
    public Libro buscarLibroAutor(String autor, ArrayList<Libro> libros ){
        Libro libroBuscado = new Libro();
        for (Libro libro : libros) {
            if(libro.getAutor().equals(autor)){
                libroBuscado = libro;
            }
        }
        return libroBuscado;
    }
    
    public Libro buscarLibroPrecio(int preciom, int precioM, ArrayList<Libro> libros ){
        Libro libroBuscado = new Libro();
        for (Libro libro : libros) {
            if(libro.getPrecio() > preciom && libro.getPrecio() < precioM){
                libroBuscado = libro;
            }
        }
        return libroBuscado;
    }
    
    public Libro buscarLibroAño(int año, ArrayList<Libro> libros ){
        Libro libroBuscado = new Libro();
        for (Libro libro : libros) {
            if(libro.getAño() == año){
                libroBuscado = libro;
            }
        }
        return libroBuscado;
    }
    
}
