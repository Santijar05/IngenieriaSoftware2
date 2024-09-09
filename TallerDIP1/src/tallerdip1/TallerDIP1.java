/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerdip1;

import java.util.Date;

/**
 *
 * @author santi
 */
public class TallerDIP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here.
        IProcesarOrdenFedex procesarOrdenFedex = new ProcesarOrdenFedexImpl();
        IProcesarOrdenDHL procesarOrdenDHL = new ProcesarOrdenDHLImpl();
        IProcesarOrdenUPS procesarOrdenUPS = new ProcesarOrdenUPSImpl();
        SistemaEnvios sistemaEnvios = new SistemaEnvios(procesarOrdenDHL,procesarOrdenFedex,procesarOrdenUPS);
        Orden orden = new Orden("1024636587", "Manizales", "Bogota");
        sistemaEnvios.enviarOrdenFedex(orden);
        sistemaEnvios.enviarOrdenDHL(orden);
        sistemaEnvios.enviarOrdenUPS(orden);
    
    }
}    
