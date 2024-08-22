/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package srp2;

/**
 *
 * @author santi
 */
public class RemitenteFacturaDian {

    public RemitenteFacturaDian() {
    }
    
    public void enviarFacturaDian(Factura f){
        if(f != null){
           System.out.println("La siguiente factura fue enviada la la Dian correctamente");
           System.out.println(f.getId());
           System.out.println(f.getFecha());
           System.out.println(f.getCliente().getNombre());
           System.out.println("C.C "+f.getCliente().getCedula());
           for (String producto : f.getProductos()) {
               System.out.println(producto);
           }
           System.out.println("Total: "+f.getTotal());
       }else{
            System.out.println("Factura inválida");
        }
    }
}
