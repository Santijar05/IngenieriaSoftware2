/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VariablesProtegidas;

/**
 *
 * @author santi
 */
public class VariabProteg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CanalNotificacion canalCorreo = new CanalCorreoElectronico();
        CanalNotificacion canalSMS = new CanalSMS();
        CanalNotificacion canalWhatsapp = new CanalWhatsapp();
        
        Notificador notificador = new Notificador(canalCorreo);
        Notificador notificador1 = new Notificador(canalSMS);
        Notificador notificador2 = new Notificador(canalWhatsapp);
        
        Notificacion notificacion = new Notificacion("Nueva notificación", "¡Hola!");
        notificador.enviarNotificacion(notificacion);
        notificador1.enviarNotificacion(notificacion);
        notificador2.enviarNotificacion(notificacion);
    }
    
}
