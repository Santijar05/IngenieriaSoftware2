/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observer2;

/**
 *
 * @author santi
 */
public class Observer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CanalNoticias canal = new CanalNoticias();
        Observador usuario1 = new Usuario("Luis");
        Observador usuario2 = new Usuario("Pepe");
        Observador usuario3 = new Usuario("Ronaldo");
        Observador usuario4 = new Usuario("Marcelo");
        
        canal.agregarSuscriptor(usuario4);
        canal.agregarSuscriptor(usuario3);
        canal.agregarSuscriptor(usuario2);
        canal.agregarSuscriptor(usuario1);
    }
    
}
