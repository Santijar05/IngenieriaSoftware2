/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Controlador;

/**
 *
 * @author santi
 */
public class Controlador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario usuario = new Usuario();

        usuario.comprar("VIP"); 
        usuario.comprar("VIP"); 
        usuario.comprar("General"); 
        usuario.comprar("Estudiante"); 
        usuario.comprar("NoExistente");
    }
    
}
