/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerdip1;

/**
 *
 * @author santi
 */
public class ProcesarOrdenFedexImpl implements IProcesarOrdenFedex{
    
    @Override
    public void enviarOrdenFedex(Orden o) {
        System.out.println("Fedex");
        System.out.println("Desde: "+o.getOrigen());
        System.out.println("Hacia: "+o.getDestino());
        System.out.println("Número de orden: "+o.getNumeroOrden());
        System.out.println("Fecha de realización de la orden: "+o.getFecha());

    }
    
}
