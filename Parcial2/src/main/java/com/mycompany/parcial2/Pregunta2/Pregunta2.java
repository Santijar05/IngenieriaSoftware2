/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.parcial2.Pregunta2;

/**
 *
 * @author santi
 */
public class Pregunta2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tarea t = new Tarea("Armar el pesebre y el árbol de navidad");
        Notificacion n = new Notificacion("Master, arme la navidad en su casa");
        GestorNotificacion gn = new GestorNotificacion();
        GestorTarea gt = new GestorTarea();
        
        gt.insertarTarea(t);
        gt.leerTarea(t);
        
        gn.enviarNotificacionSMS(n);
        gn.enviarNotificacionWhatsapp(n);
    }
    
}
