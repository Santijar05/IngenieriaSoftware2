/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package srp2;

import java.util.LinkedList;

/**
 *
 * @author santi
 */
public class GestorFacturas {
    private LinkedList<Factura> baseDatosFacturas = new LinkedList<>();

    public GestorFacturas() {
    }
    
    public void guardarFactura(Factura f){
        if(f != null){
            getBaseDatosFacturas().add(f);
            System.out.println("Factura guardada exitosamente");
        }else{
            System.out.println("Factura inválida");
        }
    }
    
    public void mostrarBaseDatos() {
        if (getBaseDatosFacturas().isEmpty()) {
            System.out.println("No hay facturas en la base de datos.");
        } else {
            for (Factura factura : getBaseDatosFacturas()) {
                System.out.println("ID Factura: " + factura.getId());
                System.out.println("Total: $" + factura.getTotal());
                System.out.println();
            }
        }
    }

    /**
     * @return the baseDatosFacturas
     */
    public LinkedList<Factura> getBaseDatosFacturas() {
        return baseDatosFacturas;
    }

    /**
     * @param baseDatosFacturas the baseDatosFacturas to set
     */
    public void setBaseDatosFacturas(LinkedList<Factura> baseDatosFacturas) {
        this.baseDatosFacturas = baseDatosFacturas;
    }
}
