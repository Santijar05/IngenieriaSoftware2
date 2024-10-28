/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller16;

import Builder.IUsuarioBuilderImpl;
import Builder.Usuario;
import Prototype.Producto;
import Builder.UsuarioDirector;
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
        
        UsuarioDirector director = new UsuarioDirector();
        Usuario usuario = director.constructUsuario(new IUsuarioBuilderImpl());

        usuario.mostrarUsuario();
    }
    
}
