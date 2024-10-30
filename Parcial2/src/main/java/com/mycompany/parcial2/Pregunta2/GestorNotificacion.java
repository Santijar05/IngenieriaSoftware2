/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial2.Pregunta2;

/**
 *
 * @author santi
 */
public class GestorNotificacion {
    public void enviarNotificacionSMS(Notificacion n){
        System.out.println("Enviando por sms: "+ n.getMensaje());
    }
    public void enviarNotificacionWhatsapp(Notificacion n){
        System.out.println("Enviando por whatsapp: "+ n.getMensaje());
    }
}
