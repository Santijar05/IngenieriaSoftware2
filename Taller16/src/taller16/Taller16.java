/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller16;

import Builder.Builder;
import Builder.Usuario;
import Prototype.Producto;

/**
 *
 * @author santi
 */
public class Taller16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Prototype
        
        Producto productoOriginal = new Producto("Laptop", 1500.0, "Electrónica");
        Producto productoClonado = productoOriginal.clone();

        productoClonado.setNombre("Tablet");

        System.out.println("Producto Original: " + productoOriginal);
        System.out.println("Producto Clonado: " + productoClonado);
        
        // Builder
        
        Usuario usuario1 = new Builder()
                            .setNombre("Alice")
                            .setEdad(30)
                            .setCorreo("alice@example.com")
                            .addInteres("Musica")
                            .addInteres("Deportes")
                            .build();

        Usuario usuario2 = new Builder()
                            .setNombre("Bob")
                            .setEdad(25)
                            .setCorreo("bob@example.com")
                            .addInteres("Tecnología")
                            .build();

        System.out.println(usuario1);
        System.out.println(usuario2);
        
    }
    
}
