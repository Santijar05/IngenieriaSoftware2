/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1srp;

/**
 * Esta clase define objetos que se encargan de hacer envio de correos de un usuario a otro.
 * @author Santiago Jimenez
 */
public class ServicioDeCorreos {

    public ServicioDeCorreos() {
    }
    
    
    /**
     * Envia un correo que contiene un mensaje básico.
     * @param email Dirección de correo electrónico del usuario que envia.
     * @param destinatario Dirección de correo electrónico del usuario que recibe el mensaje.
     * @param mensaje Mensaje que se quiere enviar en el correo.
     */
    public void EnviarCorreo(String email, String destinatario, String mensaje){
        System.out.println("De: "+email);
        System.out.println("Para: "+destinatario);
        System.out.println(mensaje);
    }
    
};
