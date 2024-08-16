/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1srp;

/**
 *
 * @author santi
 */
public class ServicioDeCorreos {
    
    public void EnviarCorreo(String email, String destinatario, String mensaje){
        System.out.println("De: "+email);
        System.out.println("Para: "+destinatario);
        System.out.println(mensaje);
    }
    
};
