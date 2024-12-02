/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pregunta1;

/**
 *
 * @author santi
 */
public class CreadoraEnvioExpress extends CreadoraServicioEnvio{

    @Override
    public ServicioEnvio crearServicioEnvio() {
        return new EnvioExpress();
    }
    
}
