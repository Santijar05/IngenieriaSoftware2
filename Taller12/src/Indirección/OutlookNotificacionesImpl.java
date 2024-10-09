/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Indirección;

/**
 *
 * @author santi
 */
public class OutlookNotificacionesImpl implements IServicioNotificaciones{
    @Override
    public Correo crearCorreo(Usuario usuario) {
        return new Correo("Hola " + usuario.getNombre() + ", este es tu correo desde Outlook.");
    }

    @Override
    public void enviarCorreo(Correo correo) {
        System.out.println("Enviando correo desde Outlook: " + correo.getContenido());
    }
    
}
