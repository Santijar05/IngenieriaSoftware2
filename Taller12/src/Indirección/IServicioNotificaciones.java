/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Indirección;

/**
 *
 * @author santi
 */
public interface IServicioNotificaciones {
    Correo crearCorreo(Usuario usuario);
    void enviarCorreo(Correo correo);
}
