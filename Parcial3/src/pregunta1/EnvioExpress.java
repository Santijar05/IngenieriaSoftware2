/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pregunta1;

/**
 *
 * @author santi
 */
public class EnvioExpress implements ServicioEnvio{

    @Override
    public void enviar(String paquete) {
        System.out.println("Enviando paquete "+paquete+" de forma express");
    }
    
}
