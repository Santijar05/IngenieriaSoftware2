/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerdip1;

/**
 *
 * @author santi
 */
public class SistemaEnvios {
    private IProcesarOrdenDHL procesarOrdenDHL;
    private IProcesarOrdenFedex procesarOrdenFedex;
    private IProcesarOrdenUPS procesarOrdenUPS;

    public SistemaEnvios(IProcesarOrdenDHL procesarOrdenDHL, IProcesarOrdenFedex procesarOrdenFedex, IProcesarOrdenUPS procesarOrdenUPS) {
        this.procesarOrdenDHL = procesarOrdenDHL;
        this.procesarOrdenFedex = procesarOrdenFedex;
        this.procesarOrdenUPS = procesarOrdenUPS;
    }

    
    
    public void enviarOrdenFedex(Orden orden){
        procesarOrdenFedex.enviarOrdenFedex(orden);
    }
    public void enviarOrdenDHL(Orden orden){
        procesarOrdenDHL.enviarOrdenDHL(orden);
    }
    public void enviarOrdenUPS(Orden orden){
        procesarOrdenUPS.enviarOrdenUPS(orden);
    }
}
