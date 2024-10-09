/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Indirección;

/**
 *
 * @author santi
 */
public class Indireccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Juan", "12345", new GmailNotificacionesImpl());
        Usuario usuario2 = new Usuario("Maria", "67890", new OutlookNotificacionesImpl());

        usuario1.generarCorreo();
        usuario2.generarCorreo();    
    }
    
}
