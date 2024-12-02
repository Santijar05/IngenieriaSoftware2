/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pregunta1;

/**
 *
 * @author santi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CreadoraServicioEnvio creadora1 = new CreadoraEnvioExpress();
        ServicioEnvio envio1 = creadora1.crearServicioEnvio();
        envio1.enviar("Botella Arguardiente Cristal");
        
        CreadoraServicioEnvio creadora2 = new CreadoraEnvioNormal();
        ServicioEnvio envio2 = creadora2.crearServicioEnvio();
        envio1.enviar("Trofeo Liga Betplay");
    }
    
}
