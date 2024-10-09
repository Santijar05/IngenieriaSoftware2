/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VariablesProtegidas;

/**
 *
 * @author santi
 */
public class CanalSMS implements CanalNotificacion{

    @Override
    public void enviarNotificacion(Notificacion notificacion) {
        System.out.println("Enviando notificación por SMS: " + notificacion.getTitulo());
    }
    
}
