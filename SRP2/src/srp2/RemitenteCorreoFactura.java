/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package srp2;

/**
 *
 * @author santi
 */
public class RemitenteCorreoFactura {

    public RemitenteCorreoFactura() {
    }
    
   public void enviarFactura(Factura f, Cliente c){
       if (f != null && c != null) {
            System.out.println("Para: " + (c.getEmail()!= null ? c.getEmail(): "Correo no disponible"));
            System.out.println("Confirmamos la compra de... Aquí está su factura:");
            
            if (f.getId() != null) {
                System.out.println("ID Factura: " + f.getId());
            }
            if (f.getFecha()!= null) {
                System.out.println("Fecha de Emisión: " + f.getFecha());
            }
            if (f.getCliente() != null && f.getCliente().getNombre() != null) {
                System.out.println("Cliente: " + f.getCliente().getNombre());
            }
            if (f.getCliente() != null && f.getCliente().getCedula() != null) {
                System.out.println("C.C: " + f.getCliente().getCedula());
            }
            if (f.getProductos()!= null) {
                for (String producto : f.getProductos()) {
                    System.out.println("Producto: " + producto);
                }
            }
            if (f.getTotal() != 0) {
                System.out.println("Total: $" + f.getTotal());
            }
        } else {
            System.out.println("Factura inválida o Cliente inválido");
        }
   }
    
}
